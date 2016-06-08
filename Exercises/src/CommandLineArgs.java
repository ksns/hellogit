public class CommandLineArgs {
	
	public static void main(String[] args) {
		final int ARRAY_LENGHT = 1000;
		if(args.length>0){
			//do something
		}
		else{
		for(int i = 0; i< args.length; i++){
			System.out.println(args[i]);
		}
		}
	}
}
