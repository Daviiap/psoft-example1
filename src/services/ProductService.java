package services;

import entities.Product;
import repositories.ProductRepository;

public class ProductService {
	private ProductRepository repo;
	
	public ProductService() {
		this.repo = new ProductRepository();
	}
	
	public Product createProduct(String name, String manufacturer, double price) {
		Product p = new Product(name, manufacturer	, price);
		if(!this.repo.exists(p)) {
			this.repo.addProduct(p);			
		}
		return p;
	}
}
