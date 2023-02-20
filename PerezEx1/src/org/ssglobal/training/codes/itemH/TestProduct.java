package org.ssglobal.training.codes.itemH;

class Product {
	public String prodName = "";
	public int prodStock = 0;
	
	public void downLoad(int qty) {
		prodStock += qty;
	}
	
	public void upLoad(int qty) {
		prodStock -= qty;
	}
	
	public String print() {
		return prodName + " is " + prodStock + " pieces";
	}
}


public class TestProduct {
	public static void main(String[] args) {
		Product lamp = new Product();	// instantiate
		lamp.prodName = "IKEA Lamp";	// set the value
		lamp.prodStock = 10000;			// set the value
		System.out.println("Before the loading: " + lamp.print());
		lamp.downLoad(1000);
		lamp.upLoad(100);
		System.out.println("After the loading: " + lamp.print());
	}

}
