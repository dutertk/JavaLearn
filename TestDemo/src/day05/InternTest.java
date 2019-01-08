package day05;

public class InternTest {
	public static void main(String[] args){
		String str1 = new StringBuilder("计算机").append("软件").toString();
		System.out.println(str1.intern() == str1);
		
		
		
		/**
		 * 这是由于在System的源码中可以看到，System是由虚拟机自动调用的
		 * 在initializeSystemClass方法中调用了Version对象的init静态方法
		 * 而Version类里laucher_name是私有静态字符串常量
		 * private static final String launcher_name = "java";
		 * 所以“java”在执行.toString之前已经出现过
		 * 因此下面的输出结果为false
		 * 
		 */
		String str2 = new StringBuilder("ja").append("va").toString();
		System.out.println(str2.intern() == str2);
	}

}
