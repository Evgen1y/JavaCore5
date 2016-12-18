package Module7.Module5WithCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Controller {

    List<API> apis = new ArrayList<>();

    public Controller() {
        apis.add(new BookingComAPI());
        apis.add(new GoogleAPI());
        apis.add(new TripAdvisorAPI());
    }

    public Set<Room> requstRooms(int price, int persons, String city, String hotel){
        Set<Room> roomDB = new HashSet<>();
        for(API api : apis){
            for(Room room : api.findRooms(price, persons, city, hotel)){
                roomDB.add(room);
                }
        }
        return roomDB;
    }

    public Set<Room> check (API api1, API api2) {
        Set<Room> checkRooms = new HashSet<>();
        for (Room room : api1.getAllRoom()) {
            for (Room room1 : api2.getAllRoom()) {
                if (room.equals(room1)) {
                    checkRooms.add(room1);
                }
            }
        }
        return checkRooms;
    }
}
