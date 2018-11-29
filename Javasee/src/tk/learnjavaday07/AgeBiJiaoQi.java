package tk.learnjavaday07;

public class AgeBiJiaoQi implements BiJiaoQi{

	@Override
	public boolean BiJiao(User u1, User u2) {
		if (u1.getAge() < u2.getAge()) {
			return true;
		}
		return false;
	}

	
}
