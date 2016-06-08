import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateCircleAreaExample {
	public static void main(String[] args){
		int radius = 0;
		System.out.println("Please enter radius ");
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		radius = Integer.parseInt(br.readLine());
		} catch(NumberFormatException e){
			System.out.println("Invalid raduis value");
			System.exit(0);
		} catch(IOException ioe){
			System.out.println("IO exception" + ioe);
			System.exit(0);
		}
		/*
		 * Area = PI * r * r
		 */
		double area = Math.PI*radius*radius;
		System.out.println("Area is " + area);
	}
}
