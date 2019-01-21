package array;

public class ArrayTest {
	public static void main(String[] args) {
		/*MyArray myArray = new MyArray();
		myArray.add(3);
		myArray.add(5);
		myArray.add(11);
		myArray.display();
		System.out.println(myArray.search(5));*/
		MyOrderArray myOrderArray = new MyOrderArray();
		myOrderArray.add(3);
		myOrderArray.add(15);
		myOrderArray.add(6);
		myOrderArray.add(11);
		myOrderArray.display();
		System.out.println(myOrderArray.binarySearch(6));
		
	}

}
