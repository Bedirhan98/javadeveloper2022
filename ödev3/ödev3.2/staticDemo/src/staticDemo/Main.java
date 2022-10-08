package staticDemo;

public class Main {

	public static void main(String[] args) {
		// Lesson 45
		ProductManager manager=new ProductManager();
		Product product = new Product();
		product.id=54;
		product.name="Akşş";
		product.price=5454;
		
		
		manager.add(product);

	}

}
