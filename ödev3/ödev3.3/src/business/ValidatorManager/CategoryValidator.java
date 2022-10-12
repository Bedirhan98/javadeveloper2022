package business.ValidatorManager;
import entites.Category;

public abstract class CategoryValidator implements Validator{
	private static String[] categoryList = { "Programlama", "Veritanı" };
	static boolean valid;

	public static boolean isValid(Category category) {
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