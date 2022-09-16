/**
 * TABA Semester 1 2021-2022
 * UsernameGeneratorApp_Q1a.java
 * @author Igor Tokarev, student number: 21138575
 * 07th January 2022
 */

import javax.swing.JOptionPane;

public class UsernameGeneratorApp_Q1a{
  public static void main(String[] args) {
    //declare variables
     String fullName;
     String username;

    //declare objects
    ItemGenerator g;

    //create objects
    g = new ItemGenerator();

    //input
    fullName = JOptionPane.showInputDialog(null, "Your full name is");

    //set
    g.setName(fullName);

    //process
    g.computeItem();

    //output
    username = g.getItem();
    JOptionPane.showMessageDialog(null, username, "Username generator", JOptionPane.INFORMATION_MESSAGE);
  }
}
