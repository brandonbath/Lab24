package co.grandcircus.Lab24.model;

public class Product {

	private int id;
	private String productName;
	private String productDescription;
	private double productPrice;
	
	
	public Product() {
		super();
	}
	
	public Product(int id, String productName, String productDescription, double productPrice) {
		super();
		this.id = id;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productDescription=" + productDescription
				+ ", productPrice=" + productPrice + "]";
	}
	
	
	
}


