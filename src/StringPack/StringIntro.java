package StringPack;

import javax.swing.JOptionPane;

public class StringIntro {

	public static void main(String[] args) {
		
		boolean StopLoop = false;
		String ConfirmStart = "Yes";
		
		//AP question: What is the difference between a while, and a do-while?
		//answer: a while's testing condiction is at the begining meaning that it can run 0 to infinity
		// a do-while's testing condiction is at the end of the loop meaning that it runs from 1 to infinity
		while(StopLoop == false) {
		String msg = "What word would you like to test?";
		String varWord = JOptionPane.showInputDialog(msg);
		
		learnStrings getIt = new learnStrings(varWord);
		msg = "First char is: " + getIt.getFirstLetter();
		//learnStrings getIt = new learnStrings("SpiderMan");
		JOptionPane.showMessageDialog(null, msg);
		int lengthTest = getIt.getLength();
		msg = "Length equals " + lengthTest;
		JOptionPane.showMessageDialog(null, msg);
		//System.out.println(getIt.getLastLetter());
		//char lastLetter = getIt.getLastLetter();
		msg = "Last char is: " + getIt.getLastLetter();
		JOptionPane.showMessageDialog(null, msg);
		//System.out.println(getIt);
		msg = "The middle chars are " + getIt.getMiddle();
		JOptionPane.showMessageDialog(null, msg);
		msg = "Do you want to do this again? (Y/n)";
		ConfirmStart = JOptionPane.showInputDialog(msg);
		if (ConfirmStart.equalsIgnoreCase("n")) {
			StopLoop = true;
			JOptionPane.showMessageDialog(null, "Have a nice day");
		}//end of if
		else if (ConfirmStart.equalsIgnoreCase("no")) {
			StopLoop = true;
			JOptionPane.showMessageDialog(null, "Have a nice day");
		}
		else if (ConfirmStart.equalsIgnoreCase("y")) {
			StopLoop = false;
		}
		else if (ConfirmStart.equalsIgnoreCase("yes")) {
			StopLoop = false;
		}
		else {
			JOptionPane.showMessageDialog(null, "I'm sorry but I don't understand that.");
		}
		}//end of while
		/*
		 * thinking, taking notes
		 * 
		 * start:
		 * index = 1 that will be the second char (index starts at 0)
		 * end:
		 * .length()-2
		 * 
		 * use: substring(int beginIndex, int endIndex)
		 * .substring(1, word.length()-1)
		 */
		/*
		 * int	indexOf(String str)
		 * Returns the index within this string of the first occurrence of the specified substring.
		 * 
		 * int	indexOf(int ch)
		 * Returns the index within this string of the first occurrence of the specified character.
		 * 
		 * String	toLowerCase()
		 * Converts all of the characters in this String to lower case using the rules of the default locale.
		 * 
		 * String	toUpperCase()
		 * Converts all of the characters in this String to upper case using the rules of the default locale.
		 * 
		 * boolean	equals(Object anObject)
		 * Compares this string to the specified object.
		 * 
		 * boolean	equalsIgnoreCase(String anotherString)
 		 * Compares this String to another String, ignoring case considerations.
		 */
	}

}
