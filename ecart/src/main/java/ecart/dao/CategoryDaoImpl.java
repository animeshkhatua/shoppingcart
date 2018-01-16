package ecart.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ecart.model.Category;
import ecart.model.Users;


@Repository("categoryDao")
@Transactional
public class CategoryDaoImpl implements CategoryDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	protected Session getSession() {
		return sessionFactory.openSession();
	}
	public List<Category> list() {
		// TODO Auto-generated method stub
		Session session = getSession();

		Query query = session.createQuery("from Category");
		List<Category> categoryList = query.list();
        session.close();
		return categoryList;
	}
	public void addCategory(Category category) {
		// TODO Auto-generated method stub
		Session session = getSession();

		String s = category.getCategoryName();

		session.save(category);

		session.flush();

		session.close();
		
	}
	public Category getCategoryById(int categoryId) {
		// TODO Auto-generated method stub
		Session session = getSession();
		return (Category) session.get(Category.class, categoryId);
	}
	
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		Session session = getSession();

		Query query = session.createQuery("from Category"); // hql   sql   --  select * from 
		List<Category> categoryList = query.list();

		return categoryList;

	}
	
	public Users getCategoryByCategoryname(String categoryName) {
		// TODO Auto-generated method stub
		Session session = getSession();

		Query query = session.createQuery("from Category where categoryname = ?");
		query.setString(0, categoryName);

		return (Category) query.uniqueResult();

	}
	
	public void updateCategory(Category category) {
		// TODO Auto-generated method stub
		Session session = getSession();

		String s = category.getCategoryName();

		session.update(category);

		session.flush();

		session.close();
	}
	
	public void deleteCategory(int categoryId) {
		// TODO Auto-generated method stub
		
		Session session = getSession();

		Query query = session.createQuery("from Category where categoryId = ?");
		query.setInteger(0, categoryId);

		Category c=(Category) query.uniqueResult();
		session.delete(c);
		session.flush();

		session.close();
		
	}
	

	}