package tk.learnjavaday04.list.demo;

import java.util.ArrayList;

import tk.learnjavaday04.list.Product;

public class ListDemoProduct {
	public static void main(String[] args) {
		
	
	//创建一个装product对象数据的ArrayList对象
	ArrayList<Product> arrayListproducts = new ArrayList<Product>();
	
	Product p1 = new Product();
	p1.pId = "1";
	p1.pName = "足球";
	p1.price = 200.0f;
	p1.number = 5;
	
	Product p2 = new Product();
	p2.pId = "2";
	p2.pName = "篮球";
	p2.price = 150.0f;
	p2.number = 2;
	
	Product p3 = new Product();
	p3.pId = "3";
	p3.pName = "排球";
	p3.price = 180.0f;
	p3.number = 3;
	
	Product p4 = new Product();
	p4.pId = "4";
	p4.pName = "网球";
	p4.price = 15.0f;
	p4.number = 10;
	
	Product p5 = new Product();
	p5.pId = "5";
	p5.pName = "乒乓球";
	p5.price = 10.0f;
	p5.number = 15;
	
	//将4个商品对象放入ArrayList
	arrayListproducts.add(p1);
	arrayListproducts.add(p2);
	arrayListproducts.add(p3);
	arrayListproducts.add(p4);
	
	//计算总价
	float totalAmout = 0.0f;
	for (int i = 0; i < arrayListproducts.size(); i++) {
		totalAmout += (arrayListproducts.get(i).price * arrayListproducts.get(i).number); 
	}
	System.out.println(totalAmout);
	
	//计算list中的所有商品中单价最高的商品；
    Product temp = new Product();
    temp = arrayListproducts.get(0);
    for (int i = 0; i < arrayListproducts.size(); i++) {
		if (temp.price < arrayListproducts.get(i).price) {
			temp = arrayListproducts.get(i);
		}
	}
    System.out.println(temp.toString()); 
	
	// 求出ArrayList中单价排名前3的商品(冒泡排序)
	for (int i = 0; i < arrayListproducts.size()-1; i++) {
		for (int j = 0; j < arrayListproducts.size()-1-i; j++) {
			if (arrayListproducts.get(j).price < arrayListproducts.get(j+1).price) {
				Product t = arrayListproducts.get(j);
				Product product = arrayListproducts.get(j+1);
				arrayListproducts.set(j, product);
				arrayListproducts.set(j+1, t);
			}
		}
	}
	for (int i = 0; i < 3; i++) {
		temp = arrayListproducts.get(i);
		System.out.println(temp.toString()); 
	}
	}
}
