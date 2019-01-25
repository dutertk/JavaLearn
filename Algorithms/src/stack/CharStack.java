package stack;

public class CharStack {
	private char[] array;
	private int top;
	private int maxSize;

	public CharStack(int size) {
		maxSize = size;
		array = new char[maxSize];
		top = -1;
	}
	//入栈
	public void push(char num) {
		array[++top] = num;
	}
	
	//弹出数据
	public char pop() {
		return array[top--];
	}
	
	//访问栈顶元素
	public char peek() {
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
