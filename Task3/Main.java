package Task3;

public class Main {
    public static int countLampsInBuilding(Building buildings){
        int totalLamps = 0;
        for (Room r : buildings.getRooms()) {
            totalLamps = totalLamps + r.getNumberOfLamps();
        }

        return totalLamps; }
    public boolean isNormal(Building x) {
        if (x.getNumberOfFloors() > x.getRooms().size()) {
            return true;
        } else {
            System.out.println("This is an odd building");
            return false;
        }
    }
    public static void main (String[]args){
        ArrayList<Room> room = new ArrayList<>();
        Room red = new Room(6, 9, 8);
        Room white = new Room(9, 2, 9);
        Room green = new Room(5, 7, 4);
        room.add(red);
        room.add(white);
        room.add(green);

        Building buildings = new Building(room,true,6 ,2);


    }
}









}
