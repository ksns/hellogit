
public class BranchingStatementsDemo {
	public static void main(String[] args){
		int i;
		for(i=0; i<10; i++){
			System.out.println(i);
			if(i>5){
				return;
			}
			System.out.println("After If");
		}
		System.out.println("After for");
	}
}
