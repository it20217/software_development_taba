/**
 * TABA Semester 1 2021-2022
 * UsernameGeneratorApp_Q1b.java
 * @author Igor Tokarev, student number: 21138575
 * 07th January 2022
 */

import javax.swing.JOptionPane;

public class ItemGeneratorApp{
  public static void main(String[] args) {
    //declare variables - username generator
    int inputLength;
    String [] inputArray;
    String uName;

    //declare variables - vowels calculator
    //number of paragraphs
    int numText;
    String [] textArray;
    int [] vowelsNum;

    //declare objects
    ItemGenerator g;
    ItemGenerator c;

    //create objects
    g = new ItemGenerator();
    c = new ItemGenerator();

    //input - username generator App (Question 1b)
    //number of full names to be entered
    inputLength = Integer.parseInt(JOptionPane.showInputDialog(null, "How many full names would you like to enter ? ", "Username generator", JOptionPane.INFORMATION_MESSAGE));

    //initialization of array 'inputArray' 
    inputArray = new String [inputLength];

    //iterating input/set/process/output methods to generate usernames based on 'inputLength' value (Question 1b)
    for(int i=0; i<inputLength; i++){
      //input
      inputArray[i] = JOptionPane.showInputDialog(null, "Input "+ (i+1)+ " - Your full name is");
      //set
      String fullName = inputArray[i];
      g.setName(fullName);
      //process
      g.computeItem();
      //get method
      uName = g.getItem();
      //output
      JOptionPane.showMessageDialog(null, "Generated username "+ (i+1)+ ": "+ uName, "Username generator", JOptionPane.INFORMATION_MESSAGE);
    }

    //input - vowels calculator App (Question 2b)
    numText = Integer.parseInt(JOptionPane.showInputDialog(null, "How many paragraphs would you like to enter ?", "Vowels Calculator", JOptionPane.INFORMATION_MESSAGE));
    textArray = new String [numText];
    for(int i=0; i<numText; i++){
      textArray[i] = JOptionPane.showInputDialog(null, "Input "+ (i+1)+ " - Enter paragraph");
    }
      //set
      c.setTextArray(textArray);
      //process
      c.vowelCalculator();
      //output
      vowelsNum = c.getVowelsCalculator();
      for(int i=0; i<vowelsNum.length; i++){
        JOptionPane.showMessageDialog(null, "Number of vowels in paragraph "+ (i+1) + " : "+ vowelsNum[i]+ " vowels", "Vowels calculator", JOptionPane.INFORMATION_MESSAGE);
      }
  }
}
