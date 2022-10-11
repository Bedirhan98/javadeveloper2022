package business;

import core.Logger;
import dataAccess.BaseDao;
import entites.BaseEntites;

public class InstructorManager extends BaseManager {
	private BaseDao baseDao;
	private Logger[] loggers;

	public InstructorManager(BaseDao baseDao, Logger[] loggers) {
		this.baseDao = baseDao;
		this.loggers = loggers;
	}

	@Override
	public void add(BaseEntites instructor) {
		System.out.println("******************************");
		System.out.println("Egitmen eklendi : " + instructor.getName());
		baseDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getName());
		}

	}

	@Override
	public void delete(BaseEntites instructor) {
		System.out.println("Eğitmen silindi : " + instructor.getName());

	}

}
