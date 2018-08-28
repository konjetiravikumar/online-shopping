package net.krk.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.krk.shoppingbackend.dao.CategoryDAO;
import net.krk.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("net.krk.shoppingbackend");
		context.refresh();

		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");

	}

	/*
	 * @Test public void testAddCategory() {
	 * 
	 * category = new Category();
	 * 
	 * category.setName("Teleivision");
	 * category.setDescription("This is some description of Television!");
	 * category.setImageURL("CAT_1.png");
	 * 
	 * 
	 * category.setName("Mobile");
	 * category.setDescription("This is some desccription for Mobile");
	 * category.setImageURL("CAT2.png");
	 * 
	 * 
	 * 
	 * category.setName("Laptop");
	 * category.setDescription("This is some desccription for Laptop");
	 * category.setImageURL("CAT3.png");
	 * 
	 * assertEquals("Successfully added a category inside the table", true,
	 * categoryDAO.add(category));
	 * 
	 * }
	 */

	/*
	 * @Test public void testGetCategory() {
	 * 
	 * category = categoryDAO.get(1);
	 * assertEquals("Successfully fetched category from database table",
	 * "Teleivision", category.getName()); }
	 */

	/*
	 * @Test public void testUpdateCategory() {
	 * 
	 * category = categoryDAO.get(3);
	 * category.setName("TV");
	 * assertEquals("Successfully deleted category from database table", true,
	 * categoryDAO.update(category)); }
	 */
	
	/*
	 * @Test public void testUpdateCategory() {
	 * 
	 * category = categoryDAO.get(3);
	 * 
	 * assertEquals("Successfully deleted category from database table", true,
	 * categoryDAO.delete(category)); }
	 */

	/*
	 * @Test public void testListCategory() {
	 * 
	 * category = categoryDAO.get(3);
	 * 
	 * assertEquals("Successfully feached the list of categories from database table"
	 * , 2, categoryDAO.list().size()); }
	 */

	@Test
	public void testCRUDCategory() {

		// Adding operations
		category = new Category();

		category.setName("Teleivision");
		category.setDescription("This is some description of Television!");
		category.setImageURL("CAT_1.png");

		assertEquals("Successfully added a category 1 inside the table", true, categoryDAO.add(category));

		category = new Category();
		category.setName("Mobile");
		category.setDescription("This is some desccription for Mobile");
		category.setImageURL("CAT_2.png");

		assertEquals("Successfully added a category 2 inside the table", true, categoryDAO.add(category));

		category = new Category();
		category.setName("Laptop");
		category.setDescription("This is some desccription for Laptop");
		category.setImageURL("CAT_3.png");

		assertEquals("Successfully added a category 3 inside the table", true, categoryDAO.add(category));

		// fetching and updating the categories

		category = categoryDAO.get(2);

		category.setName("TV");
		assertEquals("Successfully deleted category from database table", true, categoryDAO.update(category));

		// delete the category

		category = categoryDAO.get(2);

		assertEquals("Successfully deleted category from database table", true, categoryDAO.delete(category));

		//fetch the categories	
		
		assertEquals("Successfully feached the list of categories from database table"
				 , 8, categoryDAO.list().size());
	}

}
