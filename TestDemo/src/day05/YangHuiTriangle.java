package day05;

/**
 * 利用到了二维数组和for循环 输出10行的杨辉三角形
 * 
 * @author tangkai
 *
 */
public class YangHuiTriangle {
	public static void main(String[] args) {
		int[][] triangle = new int[10][];

		// 遍历二维数组的第一层，确定第二层的数组长度
		for (int i = 0; i < triangle.length; i++) {
			triangle[i] = new int[i + 1];

			// 遍历第二层，设置二维数组的值
			for (int j = 0; j <= i; j++) {
				if(i==0 || j==0 || i==j) {
					triangle[i][j] = 1;
				}else {
					triangle[i][j] = triangle[i-1][j] + triangle[i-1][j-1];
				}
				System.out.print(triangle[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
