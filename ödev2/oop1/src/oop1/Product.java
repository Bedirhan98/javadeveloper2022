package oop1;

//PascalCase
public class Product {

	private String name;                 // field(product'ın altındaki açık maviler)camelCase yazılır.
	private double unitPrice;            // birim fiyatı
	private double discount;             // indirim fiyatı
	private String imageUrl;             // fotoğraf urlsi
	private int unitsInStock;            // stok adedi

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

}
