package client;

import controllers.ProductController;

public class Client {
	public static void main(String[] args) {
		ProductController c = new ProductController();
		String p1 = c.createProduct("leite", "parmalat", 5.70);
		String p2 = c.createProduct("leite", "moça", 5.70);
		System.out.println(p1);
		System.out.println(p2);
	}
}
