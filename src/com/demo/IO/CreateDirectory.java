package com.demo.IO;

import java.io.File;

public class CreateDirectory {
	public static void main(String[] args) {
		creteADirectory("Amit");
	}
	public static void creteADirectory(String DirectoryName)
	{
		//project Directory
		String workingDirectory = System.getProperty("User.dir");
		String dir = workingDirectory  +  File.separator + DirectoryName;
		System.out.println("Final file directory :  " + dir);
		//create a directory in a path

		File file = new File(dir);
		if (!file.exists()) {
			file.mkdirs();
			System.out.println("Directory is created");
		} else {
			System.out.println("Directory is already existed");
		}


	}
}
