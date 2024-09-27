package org.Myolitz.Game.RoomData;

import java.util.Scanner;

public class Entrance extends Room
{
  public boolean plantInteract = false;

  public Entrance () 
  {
    super();
  }

  public void printMap()
  {
    //  Wonky loop given to me by IDEA
    //  String[] s functions as the first [] within a String[][] loop
    //  The nested loop then simply loops through the second []
    //
    //  For personal clarity's sake
    //  First for declaration can be read the same as:
    //  for (int i = 0; i < map.length; i++)
    for (int i = 0; i < map.length; i++)
    {
      for (int j = 0; j < map.length; j++)
      {
        //
        //  s[j] essentially acts like (s[i])[j]
        //
        System.out.print(map[i][j]);
      }
      System.out.println();
    }
  }
  /*
   *  Overrides from RoomMethods.java
   */
  @Override
  public void formatDesc() 
  {
    
  }

  @Override
  public void playerAction(Scanner in)
  {
    boolean roomChange = false;
    
    while (!roomChange)
    { 
      System.out.println("Entrance primed!");

      roomChange = true;
    }



  } 
}
