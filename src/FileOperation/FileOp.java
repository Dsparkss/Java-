package FileOperation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOp {

	public static void main(String[] args) {
		
		String dirpath = "folder" + File.separator + "path";
		
		File dir = new File(dirpath);
		
		if(!dir.exists()) {
			dir.mkdirs();
		}

		File file = new File(dirpath + File.separator + "FirstFile.txt"); // Creating New File
		try {
			if (!file.exists()) {

				file.createNewFile();

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		
		
		
		try {
			FileOutputStream os = new FileOutputStream(file);
			String str = "My First String name";
			try {
				os.write(str.getBytes());
				os.flush();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream is = new FileInputStream(file);
			int i;
			try {
				while((i=is.read()) != -1) {
					
					System.out.print((char)i);
						
				}
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//file.delete();

		

	}

}

















/*try {
	FileWriter fw = new FileWriter(file); // Writing on file
	fw.write("My Written Auto text");
	fw.flush();
	fw.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

try {
	FileReader fr = new FileReader(file); // Reading file

	int i;
	try {
		while ((i = fr.read()) != -1) {

			System.out.print((char) i);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}*/
