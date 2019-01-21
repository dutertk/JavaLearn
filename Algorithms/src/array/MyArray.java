package array;

public class MyArray {
	private int[] myarray;
	//表示有效数据是多少
	private int elements;
	
	//默认构造方法；
	public MyArray() {
		myarray = new int[50];
	}
	
	public MyArray(int maxsize) {
		myarray = new int[maxsize];
	}
	
	/**
	 * 添加数据
	 * @param value
	 */
	public void add(int value) {
		myarray[elements] = value;
		elements ++;
	}
	
	/**
	 * 显示数据
	 */
	public void display() {
		System.out.print("[");
		for(int i = 0; i < elements; i++) {
			System.out.print(myarray[i] + " ");
		}
		System.out.print("]");
	}
	
	/**
	 * 查找数据
	 */
	public int search(int value) {
		int i;
		for(i=0; i < elements; i++) {
			if (value == myarray[i]) {
				break;
			}
		}
		if (i == elements) {
			return -1;
		}else {
			return i;
		}
	}

	/**
	 * 根据索引来查找数据
	 */
	public int get(int index) {
		if (index < 0 || index >= elements) {
			throw new ArrayIndexOutOfBoundsException();
		}else {
			return myarray[index];
		}
	}
	
	/**
	 * 根据索引删除数据
	 */
	public void delete(int index) {
		if (index < 0 || index >= elements) {
			throw new ArrayIndexOutOfBoundsException();
		}else {
			for (int i = index; i < elements; i++) {
				myarray[i] = myarray[i+1];
			}
		}
		elements--;
	}
}
