package controllers;

import entities.Product;
import services.ProductService;

public class ProductController {
	private ProductService service;
	
	public ProductController() {
		this.service = new ProductService();
	}
	
	public String createProduct(String name, String manufacturer, double price) {
		Product p = service.createProduct(name, manufacturer, price);
		return p.getID();
	}
}
