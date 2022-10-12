package business;

import business.ValidatorManager.CourseValidator;
import core.Logger;
import dataAccess.BaseDao;
import entites.BaseEntites;
import entites.Courses;


public class CourseManager implements BaseEntites {
	private BaseDao baseDao;
	private Logger[] loggers;

	public CourseManager(BaseDao baseDao, Logger[] loggers) {
		this.baseDao = baseDao;
		this.loggers = loggers;
		
	}

	public void add(Courses course) throws Exception{
		if (CourseValidator.isValid(course) == true) {

			System.out.println("******************************");
			System.out.println("Kurs eklendi : " + Courses.class.getName());
			baseDao.add(course);
			for (Logger logger : loggers) {
				logger.log(Courses.class.getName());

			}
		} else {
			throw new Exception("Kurs mevcut ya da kurs fiyati 0'dan kucuk : "+Courses.class.getName()+" "+Courses.class.getTypeParameters()+"$");
		}

	}

	public void delete(Courses course) {
		System.out.println("Kurs silindi : " + Courses.class.getName());

	}



}
