package com.class29;

public class Files {
	//Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented method while
	//open is an abstract. Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide specific implementation of 
	//open behaviour: Example: to open .java file we need notepad++ or sublime text, to open .
	//doc file we need Microsoft word to be installed etc
	void open(){
System.out.println("file is being opening");
}
	
void edit(){
	System.out.println("file is being editing");
}

void close() {

	System.out.println("file is being closing");

}

}