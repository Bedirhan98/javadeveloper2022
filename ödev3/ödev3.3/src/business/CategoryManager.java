package business;

import business.ValidatorManager.CategoryValidator;
import core.Logger;
import dataAccess.BaseDao;
import entites.BaseEntites;

public class CategoryManager extends BaseManager {
	private BaseDao baseDao;
	private Logger[] loggers;

	public CategoryManager(BaseDao baseDao, Logger[] loggers) {
		this.baseDao = baseDao;
		this.loggers = loggers;
	}

	@Override
	public void add(BaseEntites category) throws Exception{
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

	@Override
	public void delete(BaseEntites category) {
		System.out.println("Kategori silindi : " + category.getName());

	}

}
