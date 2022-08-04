package com.example.demo.data;

public class Itens {

	private String[] products = {"","Iphone 13 Pro","Iphone 13","Iphone SE","Samsung Galaxy S22","Samsung Z Fold","Samsung Galaxy Note","Apple Mac Air","Laptop Acer Open Box",
			"Laptop MSI G63","Laptop Asus ROG Zephyrus","Laptop HP Victus","Laptop Dell XPS","Earphone Beats DRE Powerbears","Earphone Sony WF1000XM4","Earphone Sennheiser True Momentum"};
	private String[] version = {"","Black", "White","Silver","Pink"};
	
	
	public Itens() {
		
	}
	
	public Itens(String[] products, String[] version) {
		this.products = products;
		this.version = version;
	}

	public String[] getProducts() {
		return products;
	}

	public String[] getVersion() {
		return version;
	}


	
	
	
	
}
