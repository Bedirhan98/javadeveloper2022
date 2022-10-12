
import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.DatabaseLogger;
import core.FileLogger;
import core.Logger;
import core.MailLogger;
import dataAccess.HibernateDao;
import dataAccess.JdbcDao;
import entites.Category;
import entites.Courses;
import entites.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Instructor instructor1 = new Instructor("Random", "Xxxx");
		Category category1 = new Category("Web", "1");
		Courses course1 = new Courses("Java1", "1", instructor1, -1);

		Logger[] loggers = { new DatabaseLogger(), new MailLogger(), new FileLogger() };
		
		InstructorManager instructor = new InstructorManager(new JdbcDao(), loggers);
		instructor.add(instructor1);

		CategoryManager category = new CategoryManager(new HibernateDao(), loggers);
		category.add(category1);

		CourseManager course = new CourseManager(new JdbcDao(), loggers);
		course.add(course1);
		
	
		

	}

}
