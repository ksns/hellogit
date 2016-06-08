
public class ArrayOutOfBoundExceptionExample {
	public static void main(String[] args){
		int arr[] = {1,2,3,4,5};
		try{
		System.out.println(arr[7]);
		} catch(ArrayIndexOutOfBoundsException aioe){
			System.out.println("Index exceeded");
		}
	}
}
