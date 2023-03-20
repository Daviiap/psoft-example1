package entities;

public class Product {
	private String id;
	private String name;
	private String manufacturer;
	private double price;
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public String getID() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public Product(String name, String manufacturer, double price) {
		this.name = name;
		this.manufacturer = manufacturer;
		this.price = price;
		this.id = name+"-"+manufacturer;
	}
}
