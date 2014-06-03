package headfirst.chapter03.jdk;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class UpperCaseInputStreamDemo {

	public static void main(String[] args) {

		try {
			File myFile = File.createTempFile("test", "txt");
			myFile.deleteOnExit();
			FileWriter writer = new FileWriter(myFile);
			writer.write("this is supposed to be a lower case text ;)");
			writer.close();

			final InputStream in = new UpperCaseInputStream(new BufferedInputStream(
					new FileInputStream(myFile)));

			int c;
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}
			
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
