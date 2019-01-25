package stack;

public class WordReversebyStack {
	private String input;
	
	public WordReversebyStack(String input) {
		this.input = input;
	}
	
	public String doReverse() {
		CharStack charStack = new CharStack(input.length());
		for(int i = 0; i < input.length(); i++) {
			charStack.push(input.charAt(i));
		}
		StringBuilder output = new StringBuilder();
		while(!charStack.isEmpty()) {
			output.append(charStack.pop());
		}
		return output.toString();
	}

}
