package practicalfive;

// TODO: Add the correct import statements

import java.util.Date;
import java.util.Scanner;

/** This class performs redaction on the input text.
 *
 * <p>Bugs: This program has no known bugs, but is missing source code
 *
 * @author Add Your Name Here
 */

public class PerformRedaction {

  public static void main(String[] args) {
    // TODO: Display the name of the programmer and the date
    System.out.println("Add Your Name Here" + new Date() + "\n");
    // declare the starting file and scanner
    File sentenceInputFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      sentenceInputFile = new File("content/sentence_input.txt");
      scanner = new Scanner(sentenceInputFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate the input file");
    }
    // TODO: Step One: Read in and display the sentence that will be redacted

    // TODO: Step Two: Perform the redaction on the input sentence

    // TODO: Step Three: Write the redacted content to the file system
    try {
      // TODO: Make sure that you understand how the PrintWriter works!
      PrintWriter out = new PrintWriter("content/sentence_output.txt");
      out.println("ADD CORRECT VARIABLE");
      // TODO: Do you understand why these methods need to be called?
      out.flush();
      out.close();
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate the input file");
    }

    // TODO: Final Step: Display a final thankyou message
    System.out.print("\nThanks for using the redaction program. \nHave an awesome day.");
  }

}
