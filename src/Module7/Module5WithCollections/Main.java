package Module7.Module5WithCollections;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();


        Set<Room> rooms1 = controller.requstRooms(11000, 3, "Donetsk", "Ramada");
        Set<Room> rooms2 = controller.requstRooms(2000, 1,"Lviv", "Reikartz");
        Set<Room> rooms3 = controller.requstRooms(5000, 2, "Kiev", "Bontiak");

        System.out.println("\n= = = = =Requst Rooms rooms1= = = = =\n");
        System.out.println(rooms1);

        System.out.println("\n= = = = =Requst Rooms rooms2= = = = =\n");
        System.out.println(rooms2);

        System.out.println("\n= = = = =Requst Rooms rooms3= = = = =\n");
        System.out.println(rooms3);

        rooms1 = controller.check(bookingComAPI, googleAPI);
        rooms2 = controller.check(bookingComAPI, tripAdvisorAPI);
        rooms3 = controller.check(tripAdvisorAPI,googleAPI);

        System.out.println("\n= = = = =check API (Booking & Google)= = = = =\n");
        System.out.println(rooms1);

        System.out.println("\n= = = = =check API (Booking & TripAdvisior)= = = = =\n");
        System.out.println(rooms2);

        System.out.println("\n= = = = =check API (TripAdvisior & Google)= = = = =\n");
        System.out.println(rooms3);

    }
}
