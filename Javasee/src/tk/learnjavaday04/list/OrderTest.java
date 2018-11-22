package tk.learnjavaday04.list;

import java.util.ArrayList;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		
		User user1 = new User("1","tk","黄金vip");
		order.user = user1;
		
		ArrayList<Product> arrayListProduct = new ArrayList<Product>();
		Product product1 = new Product("1","小米手机",1500.0f,3);
		Product product2 = new Product("1","电饭煲",400.0f,2);
		
		arrayListProduct.add(product1);
		arrayListProduct.add(product2);
		order.arrayListproduct = arrayListProduct;
		
		order.fees();
		order.feestoPay();
		
		System.out.println("订单总金额：" + order.totalfees);
		System.out.println("应付金额：" + order.feestoPay);
	}
}
