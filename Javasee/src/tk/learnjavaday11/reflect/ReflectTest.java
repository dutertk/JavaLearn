package tk.learnjavaday11.reflect;

import java.lang.reflect.Method;

/**
 * 通过reflect按照需求获取类的实例的方法
 * @author tangkai
 *
 */
public class ReflectTest {
	
	public static void main(String[] args) throws Exception{
		String classname = "tk.learnjavaday11.reflect.Person";
		Class<?> forName = Class.forName(classname);
		String methodName = "say";
		Object person = (Person)forName.getDeclaredConstructor().newInstance();
		
		Method method = forName.getMethod(methodName);
		Method method2 = forName.getMethod("eatFood",String.class);
	    method.invoke(person);
		method2.invoke(person, "面条");

	}

}
