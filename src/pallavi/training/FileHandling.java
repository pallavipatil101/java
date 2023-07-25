package pallavi.training;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		File f = new File("/home/josh/eclipse-workspace/Java/Docs/abc.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line;
		
		while((line = br.readLine())!=null)
		{
			System.out.println(line);
		}
		br.close();
	}
}


