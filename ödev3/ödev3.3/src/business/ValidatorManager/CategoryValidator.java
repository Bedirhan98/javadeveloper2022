package business.ValidatorManager;

import entites.BaseEntites;

public class CategoryValidator {
	private static String[] categoryList = { "Programlama", "Veritanı" };
	static boolean valid;

	public static boolean isValid(BaseEntites category) {
		for (String newName : categoryList) {

			if (category.getName() == newName) {
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