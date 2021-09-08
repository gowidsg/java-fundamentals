package javaiostream;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {
		String filename = "D:\\Technology\\java\\java-fundamentals\\Tutorial\\src\\javaiostream\\file.txt";
		File f = new File(filename);
		try {
			if (f.createNewFile()) {

				System.out.println("New File created");
			} else {
				System.out.println("File already exists");
			}

			File f2 = f.getCanonicalFile();
			System.out.println(f2.exists());
			String path = f.getAbsolutePath();
			System.out.println(path);

			f = new File("D:\\Technology\\java\\java-fundamentals\\Tutorial");

			String list[] = f.list();
			for (String files : list) {
				System.out.println(files);
			}

			File filelist[] = f.listFiles();

			for (File file : filelist) {
				System.out.println(file.getName() + " Can Write: " + file.canWrite() + "Is Hidden: " + file.isHidden()
						+ " Length: " + file.length() + " bytes");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
