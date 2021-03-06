package ecart.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ecart.model.Category;
import ecart.model.Product;

@Repository("productDao")
@Transactional
public class ProductDaoImpl implements ProductDao{
	
	
	
	
		@Autowired
		private SessionFactory sessionFactory;
		
		public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}
		protected Session getSession() {
			return sessionFactory.openSession();
		}
		


	public List<Product> list() {
		// TODO Auto-generated method stub
		Session session = getSession();

		Query query = session.createQuery("from Product where productStatus = 'true' ");
		List<Product> productList = query.list();
        session.close();
		return productList;
	}
	public List<Product> listByCategoryId(int categoryId) {
		// TODO Auto-generated method stub
		Session session = getSession();

		Query query = session.createQuery("from Product where productCategory.categoryId = :categoryId  and productStatus = 'true'" );
		query.setParameter("categoryId", categoryId);
		List<Product> productList = query.list();
        session.close();
        System.out.println("list "+productList);
		return productList;
	}
	
	public Product listByProductId(int productId) {
		// TODO Auto-generated method stub
		Session session = getSession();

		Query query = session.createQuery("from Product where productId = :productId");
		query.setParameter("productId", productId);
		Product product = (Product)query.uniqueResult();
        session.close();
        
		return product;
	}
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		Session session = getSession();
		
		try
		{
			session.save(product);
			session.flush();
			session.close();
			return true;
		}
		catch(HibernateException e)
		{
			return false;	
		}
		
		
	}
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
Session session = getSession();
		
		try
		{
			session.update(product);
			session.flush();
			session.close();
			return true;
		}
		catch(HibernateException e)
		{
			return false;	
		}
	}
	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
Session session = getSession();
		
		try
		{
			session.save(product);
			session.flush();
			session.close();
			return true;
		}
		catch(HibernateException e)
		{
			return false;	
		}
	}
	
	

}
