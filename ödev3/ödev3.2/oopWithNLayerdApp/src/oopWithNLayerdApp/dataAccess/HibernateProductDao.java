package oopWithNLayerdApp.dataAccess;

import oopWithNLayerdApp.entites.Product;

public class HibernateProductDao implements ProductDao{
	public void add(Product product) {
		System.out.println("Hibernate ile veritabanına eklendi ");
		
	}

} 
