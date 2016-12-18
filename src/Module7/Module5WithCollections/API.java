package Module7.Module5WithCollections;

import java.util.List;
import java.util.Set;

public interface API {

    Set<Room> findRooms(int price, int person, String city, String hotel);
    Set<Room> getAllRoom();
}
