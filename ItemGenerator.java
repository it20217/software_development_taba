/**
 * TABA Semester 1 2021-2022
 * ItemGenerator.java
 * @author Igor Tokarev, student number: 21138575
 * 07th January 2022
 */

public class ItemGenerator {
  //data members  - Q1 Username generator App
  private String fullName;
  private StringBuffer strBuff;
  private int totalNumChar;

  // number of vowels (Question 1a)
  private int vowelsNum2;
  private char SecondToLastChar;
  private String username;

  //data members - Q2 Vowels calculator App
  private int textNum;
  private int vowelsNum1;
  //number of vowels (Question 2a)
  private String [] textArray;
  private int [] vowelsArray;

  //constructor
  public ItemGenerator(){
    fullName = "";
    strBuff=new StringBuffer();
    totalNumChar = 0;
    vowelsNum1 = 0;
    vowelsNum2 = 0;
    SecondToLastChar = '?';
    username = "Something goes wrong";
    textNum = 0;
    vowelsArray = new int [0];
  }

  //set methods - username generator (Question 1a)
  public void setName(String fullName){
    this.fullName = fullName;
  }
  //set methods - vowels calculator (Question 2a)
  public void setTextArray(String [] textArray){
    this.textArray = textArray;
  }

  //compute method - username generator App (Question 1a)
  public void computeItem(){
    //total number of characters in given full name
    totalNumChar = fullName.length();
    //second to last character in given full name
    SecondToLastChar = fullName.charAt(totalNumChar-2);

    //iterating over characters in String
    for (int i=0; i<totalNumChar; i++){
      char c =  fullName.charAt(i);
      if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
        vowelsNum1++;
        strBuff.append(Character.toLowerCase(c));
      } else if (c == ' ') {
        strBuff.append(totalNumChar+ "-");
      } else {
        strBuff.append(c);
      }
    }
    //convert String Buffer to String
    fullName = strBuff.toString();

    //username created
    username = SecondToLastChar + fullName + vowelsNum1;

    //clear String Buffer and reset 'vowelsNum1' counter
    strBuff = strBuff.delete(0, strBuff.length());
    vowelsNum1 = 0;
  }

  //compute method - vowels calculator App (Question 2a)
  public void vowelCalculator(){
    //number of paragraphs in array
    textNum = textArray.length;
    //initializing array of numbers
    vowelsArray = new int [textNum];
    //iterationg over array of paragraphs
    for(int i=0; i<textNum; i++){
      String text = textArray[i];
      //iterating over characters in paragraph 
      for(int j=0; j<text.length(); j++){
        if(text.charAt(j)=='a' || text.charAt(j)=='e' || text.charAt(j)=='i' || text.charAt(j)=='o' || text.charAt(j)=='u'
          || text.charAt(j)=='A' || text.charAt(j)=='E'  || text.charAt(j)=='I'  || text.charAt(j)=='O'  || text.charAt(j)=='U'){
          vowelsNum2++;
        }
      }
      //append number of vowels in array
      vowelsArray[i] = vowelsNum2;
      //reset vowel counter
      vowelsNum2 = 0;
    }
  }

  //get method - username generator
  public String getItem(){
    return username;
  }
  //get method - vowels calculator
  public int [] getVowelsCalculator(){
    return vowelsArray;
  }
}