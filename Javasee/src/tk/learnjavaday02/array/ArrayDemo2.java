package tk.learnjavaday02.array;
/*
 * 数组倒序打印
 * 
 */
public class ArrayDemo2 {
	public static void main(String[] args) {
		int [] intArr = new int[10];
		for (int i = 0; i < 10; i++) {
			intArr[i] = i;
		}
		for (int i = 9; i >=0 ; i--) {
			System.out.println(intArr[i]);
		}
	}
}
