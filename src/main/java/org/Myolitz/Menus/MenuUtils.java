package org.Myolitz.Menus;

//Libraries
import java.util.Scanner;

//Packages

public class MenuUtils extends Menus
{
  Scanner in = new Scanner(System.in);

  public MenuUtils() {}
  

  //Methods below, mainly prints
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

  public void getEnterKey(){
    String temp = "";
    if (temp.isEmpty())
    {
      temp = in.nextLine();
    }
  }

}
