package classesWithAttributes;

public class Product{
	
	public Product(int _id,String name,String _description,double price,int stockAmount,String _color) {
		System.out.println("Maker Blog Activated");
	}
	
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmound;
	private String _color;
	private String _code;

	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public String get_description() {
		return _description;
	}
	public void set_description(String _description) {
		this._description = _description;
	}
	public double get_price() {
		return _price;
	}
	public void set_price(double _price) {
		this._price = _price;
	}
	public int get_stockAmound() {
		return _stockAmound;
	}
	public void set_stockAmound(int _stockAmound) {
		this._stockAmound = _stockAmound;
	}
	public String get_color() {
		return _color;
	}
	public void set_color(String _color) {
		this._color = _color;
	}
	public String get_code() {
		return this._name.substring(0,1)+_id;
	}
	
}
