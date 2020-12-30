import java.io.*;

public class ByteStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream sourceStream = null;
		FileOutputStream targetStream = null;
		
		try 
		{
			sourceStream = new FileInputStream("R:/PART1/Java/Operators In Java/Numeric Promotion In Java/src/GFG.java");
			targetStream = new FileOutputStream("Q:/JCOP3.0/tools/JCShell/JCShell_v5.29.0.9_Internal_RELEASE/temp.java");
			
			int temp;
			while((temp = sourceStream.read()) != -1) {
				System.out.print((char)temp);
				targetStream.write((byte)temp);
			}
		} finally {
			if (sourceStream != null)
				sourceStream.close();
			if (targetStream != null)
				targetStream.close();
		}
	}

}
