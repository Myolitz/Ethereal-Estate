package org.Myolitz.PlayerData;

//Libraries
import java.util.ArrayList;

//Packages
//import org.Myolitz.Rooms

public class Player
{
  //Class-specific vars
  protected String name;
  protected ArrayList<String> inventory;
  //protected Room location;
  protected boolean wet;

  public Player(String userName)
  {
    name = userName;
    inventory = new ArrayList<String>();
    inventory.add("Coat");
    wet = true;
    //location = FrontEntrance
  }

  //Inventory-Related Methods 
  public void getInventory()
  {
    if (!inventory.isEmpty())
    {
      int i = 1;
      for (String s : inventory)
      {
        System.out.println(i + ". " + s);
        i++;
      }   
    }
    else 
    {
      System.out.println("Your inventory is empty!");
    }
 
  }

  public void addItem(String newItem)
  {
    inventory.add(newItem);
    System.out.println("\n" + newItem + " obtained");
  }

  public void useItem(String usedItem)
  {
    if (checkInv(usedItem))
    {
      //Going to be **very** hack-y as certain items will have global usage
      //while others will not
      switch (usedItem)
      {
        case "Towel", "towel" -> 
        {
          System.out.println("You dry yourself off");
          dryOff();
        }
        //More will be added soon
        

        //Default should theoretically never be reached as if
        //checkInv returns [true] then item name should match switch case
        default -> System.out.println("How did you get here?");
      }

      //Keeping this text here to still remind players that they have in-fact
      //used the item
      System.out.println("Used " + usedItem);
      inventory.remove(usedItem);
    }
    else
    {
      System.out.println("You do not have that item!");
    }
  }
  
  // Checks player inventory for certain item
  // A small failsafe so players actually acquire/have said items they use
  public boolean checkInv(String item) 
  {
    for (String s : inventory)
    {
      if (s.equalsIgnoreCase(item))
      {
        return true;
      }
    }
    return false;
  }

  //Player Status-related Methods
  public boolean isWet() { return wet; }

  public void dryOff() { wet = false; }

  public String getName() { return name; }

  //NYI
  //public Room getLocation() { return location; }
  
  //public void setLocation(Room currRoom) { return currRoom.nextRoom(); }
}
