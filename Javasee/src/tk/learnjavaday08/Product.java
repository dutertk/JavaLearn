package tk.learnjavaday08;

public class Product implements Comparable<Product> {
	private String productId;
	private String productName;
	private float price;
	private int number;
	public Product() {
		// TODO 自动生成的构造函数存根
	}

	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}


	public Product(String productId, String productName, float price, int number) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.number = number;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}


	@Override
	public int compareTo(Product other) {
		if (this.getPrice() > other.getPrice()) {
			return 1;
		}else if (this.getPrice() == other.getPrice()) {
			return 0;
		}
		return -1;
	}
	

}
