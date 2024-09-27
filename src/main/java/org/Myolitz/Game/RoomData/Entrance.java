package org.Myolitz.Game.RoomData;

//Libraries
import java.util.Scanner;

//Packages

public class Entrance extends Room
{
  public boolean plantInteract = false;

  public Entrance () 
  {
    super();
  }

  public void printMap()
  {
    /* 
     *  @see 0.3.0 commit for previous loop 
     *  reverting back to simple one cause other one was causing an index OOB
     */

    for (int i = 0; i < map.length; i++)
    {
      for (int j = 0; j < map.length; j++)
      {
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
    //  NYI, this will serve to change descriptions based on events
    //  Example: plantInteract
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
