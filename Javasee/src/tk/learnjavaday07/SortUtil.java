package tk.learnjavaday07;

import java.util.ArrayList;

public class SortUtil {
	public static void sort(ArrayList<User> ulist, BiJiaoQi bijiaoqi) {
		for (int i = 0; i <	ulist.size()-1; i++) {
			for (int j = 0; j < ulist.size()-1-i; j++) {
				boolean bijiao =  bijiaoqi.BiJiao(ulist.get(j), ulist.get(j+1));
				if (bijiao) {
					User temp = ulist.get(j);
					ulist.set(j, ulist.get(j+1));
					ulist.set(j+1, temp);
				}
			}
		}
	}
}
