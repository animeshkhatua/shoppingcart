package ecart.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ecart.model.Users;



@Repository("usersDao")
@Transactional
public class UsersDaoImpl implements UsersDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}

	public void addUsers(Users users) {
		// TODO Auto-generated method stub

		Session session = getSession();

		String s = users.getUserName();

		session.save(users);

		session.flush();

		session.close();

	}

	public Users getUsersById(int userId) {
		// TODO Auto-generated method stub
		Session session = getSession();
		return (Users) session.get(Users.class, userId);
	}

	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		Session session = getSession();

		Query query = session.createQuery("from Users"); // hql   sql   --  select * from 
		List<Users> customerList = query.list();

		return customerList;

	}

	public Users getUsersByUsername(String userName) {
		// TODO Auto-generated method stub
		Session session = getSession();

		Query query = session.createQuery("from Users where username = ?");
		query.setString(0, userName);

		return (Users) query.uniqueResult();

	}

	public void updateUsers(Users users) {
		// TODO Auto-generated method stub
		Session session = getSession();

		String s = users.getUserName();

		session.update(users);

		session.flush();

		session.close();
	}

	public void deleteUsers(int userId) {
		// TODO Auto-generated method stub
		
		Session session = getSession();

		Query query = session.createQuery("from Users where userId = ?");
		query.setInteger(0, userId);

		Users u=(Users) query.uniqueResult();
		session.delete(u);
		session.flush();

		session.close();
		
	}

	

}
