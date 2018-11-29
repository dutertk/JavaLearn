package tk.learnjavaday07;

public class SalaryBiJiaoQi implements BiJiaoQi {

	@Override
	public boolean BiJiao(User u1, User u2) {
		if (u1.getSalary() < u2.getSalary()) {
			return true;
		}
		return false;
	}

}
