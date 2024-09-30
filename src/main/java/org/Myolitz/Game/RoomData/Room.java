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
  public String ctrls;
  public String[][] map;

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

  //Getters
  //  Variable-related
  public String getName() { return this.name; }
  public String getDesc() { return this.desc; }
  public String getCtrls() { return this.ctrls; }
  
  //  Location-related
  public Room getNext() { return this.Next; }
  public Room getPrev() { return this.Prev; }
  public Room getLeft() { return this.Left; }
  public Room getRight() { return this.Right; }
  
  //Printers
  public void printName() { System.out.println(this.name); }
  public void printDesc() { System.out.println(this.desc); }
  public void printCtrls() { System.out.println("Ctrls: " + this.ctrls); }
  public void printEverything() { printName(); printDesc(); printCtrls(); }

  //Abstract Methods
  public abstract void formatDesc();
  public abstract void playerAction(Scanner in, Player player, RoomDicts roomDict);
  public abstract void playerInteract(Scanner in, Player player);
} 
