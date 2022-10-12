package business.ValidatorManager;
import entites.Courses;


public abstract class CourseValidator implements Validator{
	private static String[] courseList = { "Java", "C#","C++" };
	static boolean valid;
		
	public static boolean isValid(Courses course) {
		for (String newName :courseList) {

			if (course.getName() == newName | course.getPrice() <0   ) {
				valid=false;
				break;
			} 
			else {

				valid=true;
			}
		}
		return valid;
	}

}
