package tk.learnjavaday08;
/**
 * 泛型的学习，利用泛型创造一个更通用的比较器
 * @author tangkai
 */
import java.util.ArrayList;

public class SortUtil<T> {
	public void sort(ArrayList<T> list, BiJiaoQi<T> bijiaoqi) {
		for(int i = 0;i < list.size()-1;i++) {
			for(int j = 0;j < list.size() - 1 - i;j++) {
			boolean daxiao = bijiaoqi.BiJiao(list.get(j),list.get(j+1));
			if (daxiao) {
				T temp = list.get(j);
				list.set(j, list.get(j+1));
				list.set(j+1, temp);
			}
			}
			
		}
	}
}
