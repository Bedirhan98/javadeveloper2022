package business;

import business.ValidatorManager.CategoryValidator;
import core.Logger;
import dataAccess.BaseDao;
import entites.BaseEntites;
import entites.Category;

public  class CategoryManager implements BaseEntites{
	 private BaseDao baseDao;
	 private Logger[] loggers;
	 
	 
	public CategoryManager(BaseDao baseDao, Logger[] loggers) {
		this.baseDao = baseDao;
		this.loggers = loggers;
	}


	public void add(Category category) throws Exception {
		if (CategoryValidator.isValid(category) == true) {

			System.out.println("******************************");
			System.out.println("Kategori eklendi : " + category.getName());

			baseDao.add(category);
			for (Logger logger : loggers) {
				logger.log(category.getName());
			}
		} else {
			System.out.println("******************************");
			throw new Exception("Kategori mevcut : " + category.getName());
		}
		 
	}
		
		
	public void delete(Category category) {
		System.out.println("Kategori silindi : " + category.getName());
	}

}
