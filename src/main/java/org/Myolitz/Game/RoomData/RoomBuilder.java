package org.Myolitz.Game.RoomData;

//Libraries
import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

//Packages
import org.Myolitz.PlayerData.Player;


public class RoomBuilder
{ 
  //Objects 
  //  Room-specific File Locations
  public File entranceJson;
  public File roomTwoJson;
  public File roomThreeJson;
  public File roomFourJson;
  public File roomFiveJson;

  public Scanner in; 
  public Gson gson;
  //Class-specific vars
  public String entJson = "";


  public RoomBuilder() 
  {
    gson = new Gson();

    try 
    {
      entranceJson = new File("src/main/resources/jsons/Entrance.json");
      in = new Scanner(entranceJson);
      while (in.hasNextLine())
      {
        entJson += in.nextLine();
      }
      //System.out.println(entJson);
    }
    catch (FileNotFoundException a)
    {
        System.out.println("Entrance.json not found!");
    }
  }
  
  public ArrayList<Room> build(Player player)
  { 

    ArrayList<Room> roomList = new ArrayList<Room>(); 
    
    roomList.add(gson.fromJson(entJson, Entrance.class)); 

    player.setLocation(roomList.get(0));

    return roomList;
  }
   
}
