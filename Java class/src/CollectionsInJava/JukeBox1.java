package CollectionsInJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class JukeBox1 {
	ArrayList<String> songlist = new ArrayList<String>();
	
	public static void main(String[] args){
		new JukeBox1().go();
	}

	private void go() {
		getsongs();
		System.out.println(songlist);
		Collections.sort(songlist);
		System.out.println(songlist);
	}

	private void getsongs() {
		try {
			File file = new File("Songs.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = reader.readLine())!= null){
				addsong(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void addsong(String lineToParse) {
		String[] token = lineToParse.split("/");
		songlist.add(token[0]);
		
	}
	
}
