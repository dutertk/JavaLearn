package tk.learnjavaday08;

public class AgeBiJiaoQi implements BiJiaoQi<User> {

	@Override
	public boolean BiJiao(User t1, User t2) {
		if (t1.getAge() > t2.getAge()) {
			return true;
		}
		return false;
	}

}
