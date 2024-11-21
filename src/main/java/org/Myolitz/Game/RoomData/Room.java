package org.Myolitz.Game.RoomData;

//Libraries
import java.util.Scanner;

//Packages
import org.Myolitz.PlayerData.Player;

public abstract class Room
{
  //Gen Room Info vars
  public String name;
  public String desc;
  public String desc2;
  public String desc3;

  public String ctrls;
  public String[][] map;
  
  //Misc vars
  public String fullDesc;

  //Navigation-related vars
  public Room Next;
  public Room Prev;
  public Room Left;
  public Room Right;

  public Room () {}
  
  //Setters
  public void setRooms(Room next, Room prev, Room left, Room right)
  {
    this.Next = next;
    this.Prev = prev;
    this.Left = left;
    this.Right = right;
  }
  
  //Note: All description-related methods commented out while I figure this shit out

  //Getters
  //  Variable-related
  public String getName() { return this.name; }
  public String getDesc() { return this.fullDesc; }
  public String getCtrls() { return this.ctrls; }
  
  //  Location-related
  public Room getNext() { return this.Next; }
  public Room getPrev() { return this.Prev; }
  public Room getLeft() { return this.Left; }
  public Room getRight() { return this.Right; }
  
  //Printers
  public void printName() { System.out.println(this.name); }
  public void printDesc() { System.out.println(this.fullDesc); }
  public void printCtrls() { System.out.println("Ctrls: " + this.ctrls); }
  public void printEverything() { printName(); printDesc(); printCtrls(); }

  //Abstract Methods
  public abstract void formatDesc();
  
  /**
   *  Will be very boiler plate-y within the individual room classes but I cba messing w/ super calls and whatnot 
   *
   *
   *  @param in serves to take userInput and will be crucial
   *  @param player will allow for the game to call for inventory and other cmds if needed
   *  @param roomDict is the giant list of dictionaries used by the game to determine "correct" commands
   *
   *  For roomDict:
   *  @see "resources/jsons/Dicts.json" for the list of commands
   *  @see "RoomDicts.java" for the methods that will use those lists to verify cmds
   */
  public abstract void playerAction(Scanner in, Player player, RoomDicts roomDict);
  
  public abstract void playerInteract(Scanner in, Player player, RoomDicts roomDict);
} 
