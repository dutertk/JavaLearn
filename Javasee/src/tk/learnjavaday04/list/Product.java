package tk.learnjavaday04.list;
/*
 * 商品信息
 * 
 */
public class Product {
	public String pId;
	public String pName;
	public float price;
	public int number;
	
	public Product() {
		// TODO 自动生成的构造函数存根
	}
	public Product(String pId, String pName, float price, int number) {
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.number = number;
	}
	
}
