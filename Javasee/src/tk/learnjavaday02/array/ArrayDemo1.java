package tk.learnjavaday02.array;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//数组变量定义
		
		float [] scoreArray =  new float[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("请输入成绩：");
			String line = scanner.nextLine();
			scoreArray[i] = Float.parseFloat(line);
		}
		float sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += scoreArray[i];
		}
		System.out.println("总成绩：" +sum);
		System.out.println("平均成绩："+ sum/5);
	}

}
