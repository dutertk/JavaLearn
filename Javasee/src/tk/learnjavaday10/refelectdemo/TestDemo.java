package tk.learnjavaday10.refelectdemo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class TestDemo {

	public static void main(String[] args) throws Exception {
		HashMap<String, String> applicationContext = new HashMap<>();
		/**
		 * 解析配置文件
		 * 将所有的接口名及其对应的要调用的实现类放入hashmap中
		 * 
		 */
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/users/tangkai/desktop/webpages/filetest/b.txt")));
		String line = "";
		while((line = bufferedReader.readLine()) != null) {
			//解析配置文件中的每一行
			applicationContext.put(line.split(":")[0], line.split(":")[1]);
		}
		
		//先调用Service的实现类的say方法
		Class<?> forName = Class.forName(applicationContext.get("Service"));
		Service service = (Service) forName.newInstance();
		service.say();
		
		
		//调用OtherServcice的实现类的eat方法
		Class<?> forNameTwo = Class.forName(applicationContext.get("OtherService"));
		OtherService otherServiceInstance = (OtherService) forNameTwo.newInstance();
		otherServiceInstance.eat();
	}

}
