package business.ValidatorManager;

import entites.BaseEntites;


public class CourseValidator{
	private static String[] courseList = { "Java", "C#","C++" };
	static boolean valid;
		
	public static boolean isValid(BaseEntites course) {
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
