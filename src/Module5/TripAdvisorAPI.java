package Module5;

import java.util.Date;

public class TripAdvisorAPI implements API {

    public Room[] rooms = new Room[5];

    public TripAdvisorAPI() {
        rooms[0] = new Room(356L, 2450, 2, new Date(2016,11,21), "Bontiak", "Kiev");
        rooms[1] = new Room(357L, 1350, 2, new Date(2016,10,30), "Bontiak", "Kiev");
        rooms[2] = new Room(358L, 3300, 1, new Date(2016,10,25), "Ramada",  "Donetsk");
        rooms[3] = new Room(345L, 5500, 3, new Date(2016,11,27), "Ramada",  "Donetsk");
        rooms[4] = new Room(340L, 2540, 2, new Date(2016,11,04), "Reikartz","Lviv");
    }

    @Override
    public Room[] findRooms(int price, int person, String city, String hotel) {
        int count = 0;
        for (Room room : rooms){
            if(room.getPrice() <= price && room.getPersons() == person &&
                    room.getCityName() == city && room.getHotelName() == hotel){
                count++;
            }
        }
        Room foundRooms[] = new Room[count];
        int i = 0;
        for (Room room : rooms){
            if(room.getPrice() <= price && room.getPersons() == person &&
                    room.getCityName() == city && room.getHotelName() == hotel){
                foundRooms[i] = room;
                i++;
            }
        }
        return foundRooms;
    }

    @Override
    public Room[] getAllRoom() {
        return rooms;
    }
}
