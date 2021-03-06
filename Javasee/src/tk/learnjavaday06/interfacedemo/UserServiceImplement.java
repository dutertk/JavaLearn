package tk.learnjavaday06.interfacedemo;

public class UserServiceImplement implements UserService {
	UserDao userDao = new UserDaoImplement();
	@Override
	public boolean login(String name, String password) {
		//调用DAO层的接口根据用户名查询是否存在一个用户对象
		
		User user = userDao.findUserByName(name);
		if (user == null) {
			return false;
		}
		if (user.getPassword() == password) {
			return true;
		}
			
			
		return false;
	}

	@Override
	public String registrate(String name, String passwordone, String passwordtwo) {
		//先检查两次密码是否一致
		if (!passwordone.equals(passwordtwo)) {
			return "1";
		}
		//调dao层的功能去检查该用户名是否已存在
		boolean ifExist = userDao.checkUserIfExist(name);
		if (ifExist) {
			return "2";
		}
		//将用户信息添加到数据库
		User user = new User();
		user.setUserName(name);
		user.setPassword(passwordone);
		userDao.addUser(user);
		
		return null;
	}

}
