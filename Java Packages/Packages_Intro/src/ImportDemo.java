/*
 * Java program to demonstrate accessing of members when corresponding classes are imported and not imported
 */

import java.util.Vector;

public class ImportDemo {

	public ImportDemo() {
		
		// java.util.vector is imported, hence we are able to access directly in our code
		Vector newVector = new Vector();
		
		// java.util.ArrayList is not imported, hence we are referring to it using the complete package
		java.util.ArrayList newList = new java.util.ArrayList();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImportDemo();
	}

}
