package ecart.dao;

import java.util.List;

import ecart.model.Category;


public interface CategoryDao {

	public List<Category> list();
	

	public void addCategory(Category category);

	public void insertCategory(Category category);

	public java.util.List<Category> getlist();

	public Category getCategoryById(int id);

	public void updateCategory(Category category);

	public void deleteCategory(int id);




	
	
}
