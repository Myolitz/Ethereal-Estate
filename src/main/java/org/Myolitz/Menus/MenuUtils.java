package org.Myolitz.Menus;

//Libraries
import java.util.Scanner;

//Packages

public class MenuUtils extends Menus
{
  //Objects
  Scanner in = new Scanner(System.in);

  public MenuUtils() {}
  
  //Printers
  public void printMenu()
  {
    for (String s : gameMenu)
    {
      System.out.println(s); 
    }
  }

  public void printCtrls()
  {
    for (String s: ctrlMenu)
    {
      System.out.println(s);
    }
    getEnterKey();
  }

  public void printCreds()
  {
    for (String s : credMenu)
    {
      System.out.println(s);      
    }
    getEnterKey();
  }
  
  //Getters

  public void getEnterKey(){
    String temp = "";
    if (temp.isEmpty())
    {
      temp = in.nextLine();
    }
  }

}
