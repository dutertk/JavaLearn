package tk.learnjavaday06.interfacedemo;

public class UserDaoImplement implements UserDao {

	@Override
	public User findUserByName(String username) {
		
		User user = UserDatabase.userMap.get(username);
		return user;
	}

	@Override
	public boolean checkUserIfExist(String name) {
		//判断数据库是否存在（此处用用静态变量的hashmap来存放数据）
		return UserDatabase.userMap.containsKey(name);
	}

	@Override
	public void addUser(User user) {
		UserDatabase.userMap.put(user.getUserName(), user);
		
	}

}
