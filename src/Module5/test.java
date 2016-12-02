package Module5;

public class test {
    public static void main(String[] args) {
        Controller controller = new Controller();
        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();


        Room rooms1[] = controller.requstRooms(11000, 3, "Donetsk", "Ramada");
        Room rooms2[] = controller.requstRooms(2000, 1,"Lviv", "Reikartz");
        Room rooms3[] = controller.requstRooms(5000, 2, "Kiev", "Bontiak");

        System.out.println("\n= = = = =Requst Rooms rooms1= = = = =\n");
        for (Room room : rooms1){
            System.out.println(room.toString());
        }

        System.out.println("\n= = = = =Requst Rooms rooms1= = = = =\n");
        for (Room room : rooms2){
            System.out.println(room.toString());
        }

        System.out.println("\n= = = = =Requst Rooms rooms1= = = = =\n");
        for (Room room : rooms3){
            System.out.println(room.toString());
        }

        rooms1 = controller.check(bookingComAPI, googleAPI);
        rooms2 = controller.check(bookingComAPI, tripAdvisorAPI);
        rooms3 = controller.check(tripAdvisorAPI,googleAPI);

        System.out.println("\n= = = = =check API (Booking & Google)= = = = =\n");
        for (Room room : rooms1){
            System.out.println(room.toString());
        }

        System.out.println("\n= = = = =check API (Booking & TripAdvisior)= = = = =\n");
        for (Room room : rooms2){
            System.out.println(room.toString());
        }

        System.out.println("\n= = = = =check API (TripAdvisior & Google)= = = = =\n");
        for (Room room : rooms3){
            System.out.println(room.toString());
        }


    }
}
