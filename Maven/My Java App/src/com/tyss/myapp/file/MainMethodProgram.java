package com.tyss.myapp.file;

import com.tyss.filecreationutil.util.CreateFileUtil;

public class MainMethodProgram {

	public static void main(String[] args) {

		CreateFileUtil util = new CreateFileUtil();
		util.createFile("MyFile.txt", "new sample Data");
	}
}
