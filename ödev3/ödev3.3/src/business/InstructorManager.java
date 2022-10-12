package business;

import core.Logger;
import dataAccess.BaseDao;
import entites.BaseEntites;
import entites.Category;
import entites.Instructor;

public class InstructorManager implements BaseEntites {
	private BaseDao baseDao;
	private Logger[] loggers;

	public InstructorManager(BaseDao baseDao, Logger[] loggers) {
		this.baseDao = baseDao;
		this.loggers = loggers;
	}

	
	public void add(Instructor instructor) {
		System.out.println("******************************");
		System.out.println("Egitmen eklendi : " + Category.class.getName());
		baseDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log(Category.class.getName());
		}

	}

	
	public void delete(Instructor instructor) {
		System.out.println("Eğitmen silindi : " + instructor.getName());

	}

}
