package tk.learnjavaday06.interfacedemo;

public interface UserDao {
	public User findUserByName(String userame);
	
	public boolean checkUserIfExist(String name);
	
	public void addUser(User user);
	
}
