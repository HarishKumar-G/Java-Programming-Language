import java.io.*;

public class GFG {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader sourceStream = null;
		
		try
		{
			sourceStream = new FileReader("Q:/JCOP3.0/tools/JCShell/JCShell_v5.29.0.9_Internal_RELEASE/jcshell.rc");
			
			int temp;
			while((temp = sourceStream.read()) != -1)
				System.out.print((char)temp);
		} finally {
			if (sourceStream != null)
				sourceStream.close();
		}
	}

}
