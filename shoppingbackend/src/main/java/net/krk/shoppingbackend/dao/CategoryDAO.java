package net.krk.shoppingbackend.dao;

import java.util.List;

import net.krk.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
	
	
}
