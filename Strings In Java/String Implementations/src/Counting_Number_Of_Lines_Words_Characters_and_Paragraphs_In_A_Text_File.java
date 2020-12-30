import java.io.*;

public class Counting_Number_Of_Lines_Words_Characters_and_Paragraphs_In_A_Text_File {

		public static void main(String[] args) throws IOException {

			File file = new File("R:\\PART1\\Java\\The New Boston Java\\apples.java");
			FileInputStream fileStream = new FileInputStream(file);
			InputStreamReader input = new InputStreamReader(fileStream);
			@SuppressWarnings("resource")
			BufferedReader reader = new BufferedReader(input);

			String line;

			// Initializing counters
			int countWord = 0;
			int sentenceCount = 0;
			int characterCount = 0;
			int paragraphCount = 1;
			int whitespaceCount = 0;

			// Reading line by line from the file until a null is returned
			while((line = reader.readLine()) != null)
			{
				if (line.equals("")) {
					paragraphCount++;
				}
				if (!(line.equals(""))) {
					characterCount += line.length();
					String[] wordList = line.split("\\s+");
					countWord += wordList.length;
					whitespaceCount += countWord - 1;

					String[] sentenceList = line.split("[!?.:]+");
					sentenceCount += sentenceList.length;
				}
			}
			System.out.println("Total word count = " + countWord);
			System.out.println("Total number of sentences = " + sentenceCount);
			System.out.println("Total number of characters = " + characterCount);
			System.out.println("Number of paragraphs = " + paragraphCount);
			System.out.println("Total number of whitespaces = " + whitespaceCount);
		}
}

