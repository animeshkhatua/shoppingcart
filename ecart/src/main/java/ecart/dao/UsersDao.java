package ecart.dao;

import java.util.List;

import ecart.model.Users;



public interface UsersDao {
	
	public void addUsers(Users users);
	public void updateUsers(Users users);
	public void deleteUsers(int userId);
	public Users getUsersById(int userId);

	public List<Users> getAllUsers();

	public Users getUsersByUsername(String userName);
	

}
