package Module5;

public interface API {

    Room[] findRooms(int price, int person, String city, String hotel);
    Room[] getAllRoom();
}
