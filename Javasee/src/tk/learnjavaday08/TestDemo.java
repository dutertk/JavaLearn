package tk.learnjavaday08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestDemo {
	public static void main(String[] args) {
		SortUtil<User> sortUtil1 = new SortUtil<>();
		ArrayList<User> arrayListUser = new ArrayList<>();
		User u1 = new User("1", "a", 18,2000);
		User u2 = new User("2", "b", 19,3000);
		User u3 = new User("3", "c", 28,1800);
		User u4 = new User("4", "d", 20,2300);
		arrayListUser.add(u1);
		arrayListUser.add(u2);
		arrayListUser.add(u3);
		arrayListUser.add(u4);
		
		//对年龄排序
	    sortUtil1.sort(arrayListUser, new AgeBiJiaoQi());
		
	    
	    //对商品进行排序
	    /**
		 * 对product list数据排序
		 */
		ArrayList<Product> arrayListProduct = new ArrayList<>();
		arrayListProduct.add(new Product("1", "手机", 1599.0f, 2));
		arrayListProduct.add(new Product("2", "优盘", 99.9f, 3));
		arrayListProduct.add(new Product("3", "鼠标", 478.0f, 4));
		arrayListProduct.add(new Product("4", "键盘", 1119.8f, 5));
		arrayListProduct.add(new Product("5", "kindle", 499.0f, 3));
		
		SortUtil<Product> sortUtil2 = new SortUtil<>();
		//按价格比
		sortUtil2.sort(arrayListProduct, new PriceBiJiaoQi());
		//按数量比(此处涉及到了匿名内部类)
		sortUtil2.sort(arrayListProduct, new BiJiaoQi<Product>() {
			@Override
			public boolean BiJiao(Product t1, Product t2) {
				if(t1.getNumber() < t2.getNumber()) {
					return true;
				}
				return false;
			}
		});
		
		
		//对list排序有现成的工具Collections可用
		Collections.sort(arrayListProduct, new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				// TODO 自动生成的方法存根
				int returnValue = (int) (o1.getPrice() - o2.getPrice());
				if (returnValue > 0) {
					return 1;
				}
				return -1;
			}
		});
		
		//利用Collections比较list的第二种方法
		//需要比较的泛型实现Comparable接口，并重载compareto方法
		Collections.sort(arrayListProduct);
		
		for(Product product : arrayListProduct) {
			System.out.println(product.toString());
		}
	}

}
