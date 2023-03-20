package repositories;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class ProductRepository {
	private Map<String, Product> map;
	
	public ProductRepository() {
		this.map = new HashMap<String, Product>();
	}
	
	public void addProduct(Product p) {
		this.map.put(p.getID(), p);
	}
	
	public boolean exists(Product p) {
		return this.map.containsValue(p);
	}
}
