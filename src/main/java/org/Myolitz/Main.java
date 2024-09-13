package org.Myolitz;

//Libs
import java.util.Scanner;

//Classes
import org.Myolitz.Menus.MenuUtils;

public class Main 
{
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    MenuUtils menUtils = new MenuUtils();

    System.out.println("Welcome to the Game:tm:...not that game, this game"); 
    
    //Loops player into an infinite menu loop until they either:
    //A) Start the Game
    //B) Quit the Game

    boolean userQuit = false;
    int userChoice;

    while (!userQuit)
    {
      menUtils.printMenu();
      userChoice = in.nextInt();
      switch (userChoice)
      {
        case 1 -> 
        {
          System.out.println("See you in 0.2.0 :)");
          userQuit = true;
        }
        case 2 -> menUtils.printCtrls();
        case 3 -> menUtils.printCreds();
        case 4 -> 
        {
          System.out.println("See you later~");
          userQuit = true;
        }
      }
    }
    in.close(); 
  } 
  String fuck = "git test"; 
}
