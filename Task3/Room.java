package Task3;

// 3.a
public class Room {
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

//3.b
    private Room(int numberOfDoors, int numberOfLamps, int numberOfWindows) {

    }
// 3.c
    public int getNumberOfDoors (){
      return numberOfDoors;
    }
    public int getNumberOfLamps (){
        return numberOfLamps;
    }
    public int getNumberOfWindows (){
        return numberOfWindows;
    }

}