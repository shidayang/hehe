package springtest;

public class BeanFactory {
	public static User newInstance(String name){
		return new User(name);
	}
}
