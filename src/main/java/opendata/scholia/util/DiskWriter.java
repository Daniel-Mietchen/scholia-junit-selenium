package opendata.scholia.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DiskWriter {
	private static String DEFAULT_PATH = "/tmp/pages/";
	
	
	public static void write(String lpath, String fileName, String content, boolean replaceSpecialCharacter) {
	 	FileWriter fileWriter;
		try {
			if(replaceSpecialCharacter)
				fileName = fileName.replaceAll("\\W+", "");
			fileWriter = new FileWriter(lpath+ fileName );
		    PrintWriter printWriter = new PrintWriter(fileWriter);
		    printWriter.print(content);
		    printWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	
	
	public static void write(String fileName, String content, boolean replaceSpecialCharacter) {
			DiskWriter.write(DEFAULT_PATH, fileName, content, replaceSpecialCharacter);
	}
	
	public static void write(String fileName, String content) {
		DiskWriter.write(DEFAULT_PATH, fileName, content, true);
    }
	
	
	
}
