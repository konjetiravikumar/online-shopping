package net.krk.shoppingbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.krk.shoppingbackend.dao.CategoryDAO;
import net.krk.shoppingbackend.dto.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	/*private static List<Category> categories = new ArrayList<Category>();

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

	}*/

	public List<Category> list() {		
		String selectActiveCategory = "FROM Category where active = :active";
		
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		query.setParameter("active", true);
		
		return query.getResultList();
	}

	//Getting single category
	@Override
	public Category get(int id) {

		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

	@Override	
	public boolean add(Category category) {
		
		try {
			//add the category to the database table
			sessionFactory.getCurrentSession().persist(category);
			return true;
			
		}
		catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	
	//Updating a single category
	@Override
	public boolean update(Category category) {
	
		try {
			//add the category to the database table
			sessionFactory.getCurrentSession().update(category);
			return true;
			
		}
		catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean delete(Category category) {
		category.setActive(false);
		try {
			//add the category to the database table
			sessionFactory.getCurrentSession().update(category);
			return true;
			
		}
		catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

}
