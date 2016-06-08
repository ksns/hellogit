import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;


public class PropertiesStore {
	public static void main(String[] args) {
		Properties prop = new Properties();
		OutputStream out = null;
		try{
			out = new FileOutputStream("C:\\Users\\dell  lap\\Desktop\\config.properties");
			
			prop.setProperty("database", "localhost");
			prop.setProperty("dbUser", "root");
			prop.setProperty("dbPassword", "MYSQL");
			prop.store(out, null); 
		} catch(IOException e){
			System.out.println(e);
		}
	}
}
