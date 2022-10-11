package business;

import business.ValidatorManager.CourseValidator;
import core.Logger;
import dataAccess.BaseDao;
import entites.BaseEntites;


public class CourseManager extends BaseManager {
	private BaseDao baseDao;
	private Logger[] loggers;

	public CourseManager(BaseDao baseDao, Logger[] loggers) {
		this.baseDao = baseDao;
		this.loggers = loggers;
		
	}

	public void add(BaseEntites course) throws Exception{
		if (CourseValidator.isValid(course) == true) {

			System.out.println("******************************");
			System.out.println("Kurs eklendi : " + course.getName());
			baseDao.add(course);
			for (Logger logger : loggers) {
				logger.log(course.getName());

			}
		} else {
			throw new Exception("Kurs mevcut ya da kurs fiyati 0'dan kucuk : "+course.getName()+" "+course.getPrice()+"$");
		}

	}

	@Override
	public void delete(BaseEntites course) {
		System.out.println("Kurs silindi : " + course.getName());

	}



}
