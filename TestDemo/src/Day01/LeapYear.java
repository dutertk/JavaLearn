package Day01;
import java.util.*;

/**
 * 判断是否为闰年
 * 
 * @author tangkai
 *
 */
public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个年份： ");
		long year = scanner.nextLong();
		if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0) {
			System.out.println(year + "年是闰年！");
		} else {
			System.out.println(year + "年不是闰年");
		}
	}

}
