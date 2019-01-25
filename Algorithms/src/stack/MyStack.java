package stack;

public class MyStack {
	private int[] array;
	private int top;
	private int maxSize;

	public MyStack(int size) {
		maxSize = size;
		array = new int[maxSize];
		top = -1;
	}
	//入栈
	public void push(int num) {
		array[++top] = num;
	}
	
	//弹出数据
	public int pop() {
		return array[top--];
	}
	
	//访问栈顶元素
	public int peek() {
		return array[top];
	}
	
	//栈是否为空
	public boolean isEmpty() {
		return (top == -1);
	}
	
	//栈是否满了
	public boolean isFull() {
		return (top == maxSize - 1);
	}
	

}
