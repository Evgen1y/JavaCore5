package Module6;


import static Module6.UserUtils.*;

public class Main {
    public static void main(String[] args) {

        User[] usersArray= new User[10];
        usersArray[0] = new User(1L, "Jon", "Maclayn", 2500, 14500);
        usersArray[1] = new User(2L, "Richard", "Hammond", 4500, 40000);
        usersArray[2] = new User(1L, "Jon", "Maclayn", 2500, 14500);
        usersArray[3] = new User(3L, "Jeremy", "Clarkson", 5000, 45000);
        usersArray[4] = new User(2L, "Richard", "Hammond", 4500, 40000);
        usersArray[5] = new User(5L, "James", "May", 4500, 35500);
        usersArray[6] = new User(6L, "Anastasia", "Leroy", 1500, 10000);
        usersArray[7] = new User(5L, "James", "May", 4500, 35500);
        usersArray[8] = new User(8L, "Matthew", "LeBlanc", 5000, 45000);
        //usersArray[9] = new User(7L, "Chris", "Evans", 4500, 40000);

        System.out.println("\n*******Unique Users*******\n");
        for(User user : uniqueUsers(usersArray)){
            System.out.println(user.toString());
        }

        System.out.println("\n*******Users With Contitional Balance*******\n");
        for(User user : usersWithContitionalBalance(usersArray, 45000)){
            System.out.println(user.toString());
        }

        System.out.println("\n*******Pay Salary To User*******\n");
        for(User user : paySalaryToUser(usersArray)){
            System.out.println(user.toString());
        }

        System.out.println("\n*******Get Users Id*******\n");
        for(Long l : getUsersId(usersArray)){
            System.out.println("ID = "+l);
        }

        System.out.println("\n*******Delete Empty Users*******\n");
        for(User user : deleteEmptyUsers(usersArray)){
            System.out.println(user.toString());
        }
    }
}
