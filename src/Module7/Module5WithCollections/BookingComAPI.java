package Module7.Module5WithCollections;

import java.util.*;

public class BookingComAPI implements API {

    @Override
    public String toString() {
        return  "\n"+
                "BookingComAPI{" +
                "rooms=" + rooms +
                '}';
    }

    public Set<Room> rooms = new HashSet<>();

    public BookingComAPI() {
        rooms.add(new Room(346L, 2450, 2, new Date(116,10,10), "Bontiak", "Kiev"));
        rooms.add(new Room(344L, 2350, 3, new Date(116,10,12), "Bontiak", "Kiev"));
        rooms.add(new Room(342L, 1300, 1, new Date(116,10,1),  "Ramada",  "Donetsk"));
        rooms.add(new Room(345L, 2225, 2, new Date(116,10,2),  "Ramada",  "Donetsk"));
        rooms.add(new Room(341L, 1325, 1, new Date(116,11,23), "Reikartz","Lviv"));
    }

    @Override
    public Set<Room> findRooms(int price, int person, String city, String hotel) {
        Set<Room> foundRooms = new HashSet<>();
        for (Room room : rooms){
            if(room.getPrice() <= price && room.getPersons() == person &&
                    room.getCityName() == city && room.getHotelName() == hotel){
                foundRooms.add(room);
            }
        }
        return foundRooms;
    }

    @Override
    public Set<Room> getAllRoom() {
        return rooms;
    }
}
