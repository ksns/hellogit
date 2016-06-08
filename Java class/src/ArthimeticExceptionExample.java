
class ArthimeticExceptionExample {
	public static void main(String[] args){
		try{
			int num1 = 12 ,num2 = 0 ;
			int result = num1/num2;
			System.out.println("Result "+result);
		} catch (ArithmeticException e){
			System.out.println("You cannot divide a number by 0"+e);
		}
	}
}
