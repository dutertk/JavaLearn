package tk.learnjavaday03.exercise;

import java.util.Scanner;

public class CustomerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第1个用户信息：");
		String customer1 = scanner.nextLine();
		String[] arraycustomer1 = customer1.split(",");

		System.out.println("请输入第2个用户信息：");
		String customer2 = scanner.nextLine();
		String[] arraycustomer2 = customer2.split(",");

		System.out.println("请输入第3个用户信息：");
		String customer3 = scanner.nextLine();
		String[] arraycustomer3 = customer3.split(",");
		
		 Customer cus1 = new Customer(arraycustomer1[0],arraycustomer1[1],Integer.parseInt(arraycustomer1[2]),
				 arraycustomer1[3],arraycustomer1[4]
				 );
		 
		 Customer cus2 = new Customer(arraycustomer2[0],arraycustomer2[1],Integer.parseInt(arraycustomer2[2]),
				 arraycustomer2[3],arraycustomer3[4]
				 );
		 
		 Customer cus3 = new Customer(arraycustomer3[0],arraycustomer3[1],Integer.parseInt(arraycustomer3[2]),
				 arraycustomer3[3],arraycustomer3[4]
				 );
		 
		 int sum = cus1.age + cus2.age + cus3.age;
		 float avg = (float)sum/3;
		 
		 Customer[] customers = new Customer[] {cus1, cus2, cus3};
		 //求最大年龄
		 int temp = customers[0].age;
		 for (int i = 0; i < customers.length; i++) {
			if (customers[i].age > temp) {
				temp = customers[i].age;
			}
		}
		 System.out.println("平均年龄：" + avg);
		 System.out.println("最大年龄：" + temp);
		 
	}

}
