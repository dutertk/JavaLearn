package day02;

public class StringTest {
	public static void main(String[] args) {
		String originalString = "Hello";
		
		//concat(string) 连接两个字符串
		System.out.println(originalString.concat(" World!"));
		
		//substring(beginIndex,endIndex)截取开始位置到结束-1位置的字符串
		System.out.println(originalString.substring(0, 3));
		
		//charAt(index) index索引位置处的字符
		System.out.println(originalString.charAt(3));
		
		//indexOf("",int)从第几个位置开始找，第一次出现某字符串的索引
		System.out.println(originalString.concat(" World").indexOf("o", 2));
		
	}

}
