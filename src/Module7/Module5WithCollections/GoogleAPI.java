package Module7.Module5WithCollections;

import java.util.*;

public class GoogleAPI implements API {

    @Override
    public String toString() {
        return  "\n"+
                "GoogleAPI{" +
                "rooms=" + rooms +
                '}';
    }

    public Set<Room> rooms = new HashSet<>();

    public GoogleAPI() {
        rooms.add(new Room(346L, 2450, 2, new Date(2016,11,21), "Bontiak", "Kiev"));
        rooms.add(new Room(347L, 1350, 2, new Date(2016,10,30), "Bontiak", "Kiev"));
        rooms.add(new Room(342L, 1300, 1, new Date(2016,10,1),  "Ramada",  "Donetsk"));
        rooms.add(new Room(349L, 5500, 3, new Date(2016,10,27), "Ramada",  "Donetsk"));
        rooms.add(new Room(341L, 1325, 1, new Date(2016,11,23), "Reikartz","Lviv"));
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
