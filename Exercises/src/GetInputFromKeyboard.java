import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GetInputFromKeyboard {
	public static void main(String[] args) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		String name = "";
		try {
			name = dataIn.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello "+ name + "!");
	}
}
