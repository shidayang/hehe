package springtest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("./applicationContext.xml");
		User user=ac.getBean("f1", springtest.User.class);
		user.say();
	}
	@Test
	public void t1(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("./applicationContext.xml");
		User user=ac.getBean("u1", User.class);
		System.out.println(user.getArray());
	}
}
