package stack;

public class TestStack {
	
	public static void main(String[] args) {
		MyStack myStack = new MyStack(10);
		myStack.push(40);
		myStack.push(30);
		myStack.push(20);
		myStack.push(10);
		myStack.push(-10);
		myStack.push(-20);
		
		while(!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
		
	}
}
