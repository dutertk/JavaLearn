package Day01;
/**
 * 
 * 装箱的测试用例
 * 
 * @author tangkai
 *
 */
public class InBoxDemo {
	public static void main(String[] args) {
		int m = 500;
		Integer obj = new Integer(m);// 手动装箱
		int n = obj.intValue();// 手动拆箱
		System.out.println("n = " + n);
		Integer obj1 = new Integer(500);
		System.out.println("obj1 = " + obj1);

		// 以下为自动装箱

		Integer obj2 = m;
		int l = obj2;
		System.out.println(obj2);
		System.out.println(l);
		
		//字符串比较
		String string = "abcd";
		System.out.println("abcd".equals(string));
		System.out.println(string.length());
		System.out.println("ABCD".equals(string));
		System.out.println(string.replace("cd","abhelloworld"));
		System.out.println(string.substring(0, 4));
		System.out.println(String.join(",", "Hellow","world"));
	}
}