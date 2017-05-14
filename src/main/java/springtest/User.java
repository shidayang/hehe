package springtest;

import java.util.List;

public class User {
	private String name;
	private List<String> array;
	public User() {
		super();
	}
	public List<String> getArray() {
		return array;
	}
	public void setArray(List<String> array) {
		this.array = array;
	}
	User(String name){
		this.name=name;
	}
	public void say(){
		System.out.println("i am a user"+name);
	}
}
