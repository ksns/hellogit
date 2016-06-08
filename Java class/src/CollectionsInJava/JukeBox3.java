package CollectionsInJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JukeBox3 {
	ArrayList<Song> songlist = new ArrayList<Song>();
	public static void main(String[] args){
		new JukeBox3().go();
	}
	public void go() {
		getsongs();
		System.out.println(songlist);
		//Collections.sort(songlist);
		System.out.println(songlist);
	}
	void getsongs() {
		try{
			File file = new File("Songsmore.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line=reader.readLine())!= null){
				addsongs(line);
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}
	void addsongs(String lineToParse) {
		String[] tokens= lineToParse.split("/");
		Song nextsong = new Song(tokens[0],tokens[1],tokens[2],tokens[3]);
		songlist.add(nextsong);
	}
}
