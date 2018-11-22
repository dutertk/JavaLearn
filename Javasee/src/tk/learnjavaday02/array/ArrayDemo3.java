package tk.learnjavaday02.array;
/*
 * 
 * 冒泡排序法
 */
public class ArrayDemo3 {

	public static void main(String[] args) {
		int [] intArray = new int[5];
		intArray[0] = 10;
		intArray[1] = 15;
		intArray[2] = 20;
		intArray[3] =25;
		intArray[4] =18;
		int temp = intArray[0];
		for (int i = 1; i < intArray.length; i++) {
			if (temp  < intArray[i]) {
				temp = intArray[i];
			}}
			System.out.println("数组最大值：" + temp);
			
			temp = intArray[0];
			
			for (int j = 1; j < intArray.length; j++) {
				if (temp  > intArray[j]) {
					temp = intArray[j];
				}
		}
			System.out.println("数组最小值：" + temp);


}
}
