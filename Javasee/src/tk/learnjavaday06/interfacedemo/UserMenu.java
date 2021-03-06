package tk.learnjavaday06.interfacedemo;

import java.util.Scanner;

public class UserMenu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserService userManage = new UserServiceImplement();
		System.out.println("1.登陆；2.注册；");
		String nextline = scanner.nextLine();
		switch (nextline) {
		case "1":
			System.out.println("请输入账号：");
			String username = scanner.nextLine();
			System.out.println("请输入密码：");
			String password = scanner.nextLine();
			boolean login = userManage.login(username, password);
			if (login) {
				System.out.println("登陆成功！");
			} else {
				System.out.println("抱歉，您的用户名或者密码不正确！");
			}
			break;

		case "2":
			System.out.println("请输入用户名：");
			String name = scanner.nextLine();
			System.out.println("请输入密码：");
			String password1 = scanner.nextLine();
			System.out.println("请确认密码：");
			String password2 = scanner.nextLine();
			String returnValue = userManage.registrate(name, password1, password2);
			switch (returnValue) {
			case "1":
				System.out.println("两次密码不一致。");
				break;
			case "2":
				System.out.println("该账号已经注册。");
				break;
			default:
				System.out.println("注册成功。");
				break;
			}
			break;
		}
		
	}
}
