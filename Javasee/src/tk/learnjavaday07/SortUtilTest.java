package tk.learnjavaday07;

import java.util.ArrayList;

public class SortUtilTest {
	public static void main(String[] args) {
		ArrayList<User> arrayListUser = new ArrayList<>();
		User u1 = new User("1","张三",20,2800);
		User u2 = new User("2","李四",22,2100);
		User u3 = new User("3","王五",30,5000);
		User u4 = new User("4","冯六",18,4200);
		User u5 = new User("5","赵七",34,1000);
		arrayListUser.add(u1);
		arrayListUser.add(u2);
		arrayListUser.add(u3);
		arrayListUser.add(u4);
		arrayListUser.add(u5);
	    SortUtil.sort(arrayListUser, new AgeBiJiaoQi());
	    SortUtil.sort(arrayListUser, new SalaryBiJiaoQi());
	    for(User user : arrayListUser) {
	    	System.out.println(user);
	    }
	
	}

}
