package Module5;

import java.util.Arrays;
import java.util.Date;

public class BookingComAPI implements API {

    @Override
    public String toString() {
        return "BookingComAPI{" +
                "rooms=" + Arrays.toString(rooms) +
                '}';
    }

    Room[] rooms = new Room[5];

    public BookingComAPI() {
        rooms[0] = new Room(346L, 2450, 2, new Date(116,10,10), "Bontiak", "Kiev");
        rooms[1] = new Room(344L, 2350, 3, new Date(116,10,12), "Bontiak", "Kiev");
        rooms[2] = new Room(342L, 1300, 1, new Date(116,10,1),  "Ramada",  "Donetsk");
        rooms[3] = new Room(345L, 2225, 2, new Date(116,10,2),  "Ramada",  "Donetsk");
        rooms[4] = new Room(341L, 1325, 1, new Date(116,11,23), "Reikartz","Lviv");
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
