
public class Boy extends Human{
	public void eat(){
		System.out.println("subclass eaten");
	}
	public static void main(String[] args){
		Boy bObj = new Boy();
		bObj.eat();
	}
}
