
public class Animal {
	private String name;
	private int age;
	public Animal(){
		System.out.println("I am super class default constructor");
	}
	public Animal(String name){
		this.name = name;
		System.out.println("I am super class parameterised constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
