package tk.learnjavaday02.student;
/*
 * 程序功能
 * 寻找价格最高的商品对象，并输出其信息
 */
public class ProductManagement {
	public static void main(String[] args) {
		Product product1 = new Product();
		product1.id = "1";
		product1.name = "足球";
		product1.category = "体育用品";
		product1.price = 100.2f;
		
		Product product2 = new Product();
		product2.id = "2";
		product2.name = "篮球";
		product2.category = "体育用品";
		product2.price = 98.5f;
		
		Product product3 = new Product();
		product3.id = "2";
		product3.name = "排球";
		product3.category = "体育用品";
		product3.price = 78.5f;
		
		Product product4 = new Product();
		product4.id = "2";
		product4.name = "篮球";
		product4.category = "体育用品";
		product4.price = 8.5f;
	    
		Product[] products = new Product[4];
		products[0] = product1;
		products[1] = product2;
		products[2] = product3;
		products[3] = product4;
		//从数组中寻找价格最大的商品
		Product temp = products[0];
		for (int i = 1; i < products.length; i++) {
			if (temp.price< products[i].price) {
				temp = products[i];
			}
		}
		System.out.println(temp.id + " " + temp.name + " " + temp.price);
	}
}
