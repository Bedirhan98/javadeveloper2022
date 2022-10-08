package oopWithNLayerdApp.business;


import java.util.List;

import oopWithNLayerdApp.core.logging.Logger;
import oopWithNLayerdApp.dataAccess.JdbcProductDao;
import oopWithNLayerdApp.dataAccess.ProductDao;
import oopWithNLayerdApp.entites.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	
	
	public ProductManager(ProductDao productDao,Logger[] loggers) {
		this.productDao=productDao;
		this.loggers=loggers;
	}
	
	
	
	public void add(Product product) throws Exception {
		if(product.getUnitPrice()<10) {
		throw new Exception("Ürün fiyatı 10 dan küçük olamaz"); 
		}
	JdbcProductDao productDao=new JdbcProductDao();
	productDao.add(product);	
	
	for (Logger logger : loggers) {
		logger.log(product.getName());
		
	}
	}

}
