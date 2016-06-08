
public class Cat extends Animal{
	public Cat(){
		System.out.println("I am child class default constructor");
	}
	public Cat(String name){
		super(name);
		System.out.println("I am parameterised child class const");
	}
	public static void main(String[] args){
		Cat c = new Cat();
	}
}


