package day02;

public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("Hello");
		
		//append()连接两个字符串，不能是连接了，应该叫做追加？
		System.out.println(stringBuilder.append(" World!"));
		
		//substring(start,end)同string
		System.out.println(stringBuilder.append("World").substring(2, 5));
		System.out.println(stringBuilder.toString());
		
		//insert(index,"")在位置index处插入字符串
		System.out.println(stringBuilder.insert(2, "BE, He"));
		System.out.println(stringBuilder.toString());
		
		System.out.println(stringBuilder.delete(18, 23));
		
		//看一下delete以后的stringbuiler对象
		System.out.println(stringBuilder.toString());
		
	}

}
