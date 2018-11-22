package tk.learnjavaday02.array;

public class ArrayDemo4 {
	public static void main(String[] args) {
		int [] arraySort = new int[5];
		arraySort[0] = 15;
		arraySort[1] = 11;
		arraySort[2] = 18;
		arraySort[3] = 9;
		arraySort[4] = 19;
		for (int i = 0; i < arraySort.length-1; i++) {
			for (int j = 0; j < arraySort.length-1-i; j++) {
				int temp = 0;
				if (arraySort[j] > arraySort[j+1]) {
					temp = arraySort[j];
					arraySort[j] = arraySort[j+1];
					arraySort[j+1] = temp;
				}
				
			}
		}
		for (int i = 0; i < arraySort.length; i++) {
			System.out.println(arraySort[i]);
			
		}
	}
}
