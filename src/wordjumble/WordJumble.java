/*
 *Jared Craig   
 *5/11/2018
 * Jumbles words into all possible combonations
 */

package wordjumble;

import javax.swing.JOptionPane;

/**
 *
 * @author jacra1226
 */
public class WordJumble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String letters =   JOptionPane.showInputDialog("Enter a word."); 
    jumbleWords(letters, "");
  }

  //input parameters
  //word - the remaining letters in the word still to jumble
  //jumbLet - the letters already used to create
  //the jumbled word
  public static void jumbleWords(String word, String jumbLet) {
    int pos;
  
    String remainingLetters;
    String origWord = word;
    String origJumbledLetters = jumbLet;
    if (word.length() == 1) {
      System.out.println(jumbLet + word);
    } else {
      for (pos = 0; pos < origWord.length(); pos++) {
        remainingLetters = origWord.substring(0, pos)
          + origWord.substring(pos + 1, origWord.length());
        //recursive call to jumbleWords()
        jumbleWords(remainingLetters, 
          origJumbledLetters + origWord.charAt(pos));
        
         }
      }
   }   
}
