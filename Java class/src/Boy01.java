
public class Boy01 extends Human01{
	public Boy01(){
		s2 = "child class";
	}
	public Boy01(String s2){
		super(s2);
		this.s2 = s2;
		super.s1 = s2;
		
	}
	public static void main(String[] args){
		Boy01 obj = new Boy01();
		Boy01 obj2 = new Boy01("swathi");
		obj.print();
		obj2.print();
	}
}
