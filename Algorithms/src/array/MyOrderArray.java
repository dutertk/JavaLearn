package array;

/**
 * 有序数组的二分查找法
 * 
 * @author tangkai
 *
 */

public class MyOrderArray {
	private int[] myarray;
	// 表示有效数据是多少
	private int elements;

	// 默认构造方法；
	public MyOrderArray() {
		myarray = new int[50];
	}

	public MyOrderArray(int maxsize) {
		myarray = new int[maxsize];
	}

	/**
	 * 添加数据
	 * 
	 * @param value
	 */
	public void add(int value) {
		int i;
		for (i = 0; i < elements; i++) {
			if (myarray[i] > value) {
				break;
			}
		}
		if (i == elements) {
			myarray[elements] = value;
			elements++;
		} else {
			for (int j = elements; j > i; j--) {
				myarray[j] = myarray[j-1];
			}
			myarray[i] = value;

			elements++;
		}
	}

	/**
	 * 显示数据
	 */
	public void display() {
		System.out.print("[");
		for (int i = 0; i < elements; i++) {
			System.out.print(myarray[i] + " ");
		}
		System.out.print("]");
	}

	/**
	 * 查找数据
	 */
	public int search(int value) {
		int i;
		for (i = 0; i < elements; i++) {
			if (value == myarray[i]) {
				break;
			}
		}
		if (i == elements) {
			return -1;
		} else {
			return i;
		}
	}

	/**
	 * 根据索引来查找数据
	 */
	public int get(int index) {
		if (index < 0 || index >= elements) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			return myarray[index];
		}
	}

	/**
	 * 根据索引删除数据
	 */
	public void delete(int index) {
		if (index < 0 || index >= elements) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			for (int i = index; i < elements; i++) {
				myarray[i] = myarray[i + 1];
			}
		}
		elements--;
	}

	/**
	 * 二分法查找数据
	 */
	public int binarySearch(int value) {
		int low = 0;
		int middle = 0;
		int pow = elements;

		while (true) {
			middle = (pow + low) / 2;
			if (myarray[middle] == value) {
				return middle;
			} else if (low > elements) {
				return -1;
			} else {
				if (myarray[middle] > value) {
					pow = middle - 1;
				} else {
					low = middle + 1;
				}
			}
		}

	}
}
