//Author name: Samantha Halbleib
//Date: April 5th 2020
//Program Name: Halbleib_text_analyzer
import java.io.*;
import java.util.HashMap;
import java.util.Map;
/**
 * @author Samantha Halbleib
 *
 */

public class halbleib_text_analyzer {
	/**
	 * This is a program that analyzes a document
	 * and counts how many of each word there
	 * are
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		/**
		 * 
	 *	
	 */
	
		// read the file
		File file = new File("C:\\Users\\sammy\\Software Development\\macbeth-1.txt");
		  /**
		   * Detects file that will be used.
		   * Reads file.
		   */
		System.out.println("Reading file... \n");
		  
		// reading through and figuring out the number of each word
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		Map<String, Long> counts = new HashMap<>();
		while ((line = br.readLine()) != null) {
		String[] words = line.split("[\\s.;,?':!-()\"]+");
		for (String word : words) {
		word = word.trim();
		if (word.length() > 0) {
		if (counts.containsKey(word)) {
		counts.put(word, counts.get(word) + 1);
		}
		/**
		 * Words are counted through
		 */
		else {
		counts.put(word, 1L);
			}
		}
	}
}
		for (Map.Entry<String, Long> entry : counts.entrySet()) {
		System.out.println(entry.getKey() + ": " + entry.getValue());
		  /**
		   * Displays the results of how many of each
		   * word in the file there are.
		   * 
		   */
	}
		/**
		 * 
		 */
		br.close();
	}
}