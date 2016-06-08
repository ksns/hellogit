import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatePerimeterOfCircleExample {
	public static void main(String[] args){
		int radius = 0;
		System.out.println("Please enter radius ");
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		radius = Integer.parseInt(br.readLine());
		} catch(IOException ioe){
			System.out.println("IO exception " + ioe);
			System.exit(0);
		} catch(NumberFormatException e){
			System.out.println("Error");
			System.exit(0);
		}
		double peri = 2*Math.PI*radius;
		System.out.println("Perimeter is "+ peri);
	}
}
