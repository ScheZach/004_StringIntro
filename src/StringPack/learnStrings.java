package StringPack;

import javax.swing.JOptionPane;

public class learnStrings {
	private String word = "";
	//private int x = getLength();
	
	public learnStrings(String s) {
		setString(s);
	}//end of constructor
	public void setString(String st) {
		word  = st;
		//System.out.println(word + " (This is for testing)");
		String msg = "String entered is: " + word;
		JOptionPane.showMessageDialog(null, msg);
	}//end of method setString
	public char getFirstLetter() {
		return word.charAt(0);
	}//end of method getFirstLetter
	public char getLastLetter() {
		//return word.charAt(0); //This is not the code. Only placeholder.
		int x = getLength();
		return word.charAt(x-1);
	}
	public String getMiddle() {
		//return word.substring(1, x-1);
		return word.substring(1, word.length()-1);
	}
	public int getLength() {
		return word.length();
	}
}//end of class

