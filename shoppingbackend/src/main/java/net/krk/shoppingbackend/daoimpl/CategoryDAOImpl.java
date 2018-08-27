package net.krk.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.krk.shoppingbackend.dao.CategoryDAO;
import net.krk.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<Category>();

	static {

		Category category = new Category();

		// Adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some desccription for Television");
		category.setImageURL("CAT1.png");

		categories.add(category);

		// Adding second category
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some desccription for Mobile");
		category.setImageURL("CAT2.png");

		categories.add(category);

		// Adding first category
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some desccription for Laptop");
		category.setImageURL("CAT3.png");

		categories.add(category);

	}

	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {

		//enhanced for loop
		for(Category category:categories) {
			if(category.getId() == id) return category;			
		}
		return null;
	}

}
