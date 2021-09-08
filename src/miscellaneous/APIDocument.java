//We can create document api in java by the help of javadoc tool. In the java file, 
// we must use the documentation comment (/**... */)
// to post information for the class, method, constructor, fields etc.

//To create the document API, you need to use the javadoc tool followed by java file name. There is no need to compile the javafile.
//
//On the command prompt, you need to write:
//
//javadoc APIDocument.java
//to generate the document api. Now, there will be created a lot of html files. Open the index.html file to get the information about the classes.


package miscellaneous;


/** This class  is a user defined class that contain print method.*/
public class APIDocument {
	
	
	/**THis print method print a string */
	void print(){
		System.out.println("Print Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**Here we are creating a reference variable. */
		APIDocument a= new APIDocument();
		a.print();

	}

}
