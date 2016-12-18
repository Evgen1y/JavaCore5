package Module7.Module5WithCollections;

public interface DAO {
    Room save (Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
}
