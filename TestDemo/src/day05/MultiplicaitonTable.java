package day05;
/**
 * 打印乘法口诀表
 * 类似杨辉三角形的练习
 * @author tangkai
 *
 */
public class MultiplicaitonTable {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= i;j++) {
				System.out.print(i + "*" + j + "=" + i * j  +"\t" );
			}
			System.out.println();
		}
	}

}
