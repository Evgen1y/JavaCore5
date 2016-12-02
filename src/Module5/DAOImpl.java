package Module5;

public class DAOImpl implements DAO {

    @Override
    public Room save(Room room) {
        System.out.println("Комната "+room.toString()+" сохранена.");
        return null;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Комната "+room.toString()+" удалена.");
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Данные о комнате "+room.toString()+" обновлены");
        return null;
    }

    @Override
    public Room findById(long id) {
        System.out.println("Поиск комнаты за номером "+id);
        return null;
    }
}
