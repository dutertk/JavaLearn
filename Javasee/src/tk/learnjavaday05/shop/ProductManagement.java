package tk.learnjavaday05.shop;
/**
 * 1保存所有商品数据
 * 2提供操作这些数据的方法
 * @author tangkai
 *
 */

import java.util.ArrayList;

public class ProductManagement {
	ArrayList<Product> arrayListProduct = new ArrayList<>();
	
	// 添加商品的方法
	private void addProduct(Product product) {
		
		arrayListProduct.add(product);
	}
	
	// 显示商品的方法
	public void showProduct() {
		for (Product product : arrayListProduct) {
			System.out.println(product.toString());
		}
	}
	
	//获得所有商品数据(注释的快捷键方式control + command + /)
	/*public ArrayList<Product> getProducts() {
		return this.arrayListProduct;
	}*/
	
	//根据商品productId获得商品对象（如果商品过多，找起来很复杂，用HashMap来替代）
	public Product getProductById(String productId) {
		for (Product product : arrayListProduct) {
			if (product.getProductId().equals(productId)) {
				return product;
			}
		}
		return null;
	}
}
