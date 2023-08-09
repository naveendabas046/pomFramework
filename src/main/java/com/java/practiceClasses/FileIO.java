package com.java.practiceClasses;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {


	public static void main(String[] args) throws IOException  {

		File file = new File("D:\\study_center\\java\\4achivers\\eclipse\\syllabusSheet\\inputfile.txt");  // it creates File object for storing address
		file.createNewFile();                                                                         // for creating new file
		File file1 = new File("inputfile1.txt");                                                      // relative location way
		file1.createNewFile();
		System.out.println("file exsist - " +file.exists() + " | file1 exsist - " +file1.exists());   // for checking existence of the file
		System.out.println(file.getAbsolutePath());
		FileReader fis = new FileReader("inputfile.txt");
		FileWriter fos = new FileWriter("outputfile.txt");
		int a;
		while ((a = fis.read()) != -1) {
			//System.out.print(a);          // for showing ASCII value of character
			//System.out.print((char)a);    // typeCast to normal a
			fos.write(a);
		}
		fis.close();
		fos.close();

		File folder = new File("SampleFolder");                                                        // creating a folder
		folder.mkdir();
		folder.delete();                                                                              // for deleting a folder
		File folder1 = new File("D:\\4achiver");                                                      //  for creating a folder in a specifc location
		folder1.mkdir();
		System.out.println(folder1.getAbsolutePath());
		File folder2 = new File("D:\\4achiver" , "myTestFile1.txt");                                  // for creating new file inside a folder
		folder2.createNewFile();
	}
}

class toStringSample {

	int RollNo;
	int Class;

	toStringSample(int RollNO, int Class) {
		this.RollNo = RollNO;
		this.Class = Class;
	}

	@Override
	public String toString() {
		return "Roll no - " +RollNo + "Class - " + Class;
	}

	public static void main(String[] args) {
		toStringSample obj = new toStringSample(34, 12);

		System.out.println(obj);
	}
}