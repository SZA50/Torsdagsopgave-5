package Task3;

import java.util.ArrayList;

//3.d
public class Building {
    private ArrayList<Building> buildings = new ArrayList<>();
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

//3.e
public Building(ArrayList<Room>rooms, boolean isOfficeBuilding, int numberOfBathrooms, int numberOfFloors) {

    this.rooms = rooms;
    this.isOfficeBuilding = isOfficeBuilding;
    this.numberOfBathrooms = numberOfBathrooms;
    this .numberOfFloors = numberOfFloors ;
}


// 3.f
    public int getnumberOfBathrooms(){
        return numberOfBathrooms;
    }
    public int getnumberOfFloors(){
        return numberOfFloors;
    }
    public boolean getisOfficeBuilding(){
        return isOfficeBuilding;
    }


}

