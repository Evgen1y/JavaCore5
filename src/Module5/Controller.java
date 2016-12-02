package Module5;

public class Controller {

    API apis[] = new API[3];

    public Controller() {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public Room[] requstRooms(int price, int persons, String city, String hotel){
        int count = 0;
        for(API api : apis){
            count += api.findRooms(price, persons, city, hotel).length;
        }
        Room roomDB[] = new Room[count];
        int i = 0;
        for(API api : apis){
            for(Room room : api.findRooms(price, persons, city, hotel)){
                roomDB[i] = room;
                i++;
            }
        }




        return roomDB;
    }

    public Room[] check (API api1, API api2) {
        int count = 0;
        for (Room room : api1.getAllRoom()) {
            for (Room room1 : api2.getAllRoom()) {
                if (room.equals(room1)) {
                    count++;
                }
            }
        }
        Room[] checkRooms = new Room[count];
        int count2 = 0;
        for (Room room : api1.getAllRoom()) {
            for (Room room1 : api2.getAllRoom()) {
                if (room.equals(room1)) {
                    checkRooms[count2] = room1;
                    count2++;
                }
            }
        }
        return checkRooms;
    }
}
