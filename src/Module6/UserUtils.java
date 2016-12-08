package Module6;

public class UserUtils {

    static User[] uniqueUsers(User[] users){
        users = deleteEmptyUsers(users);
        int count;
        int x = 0;
        User[] uniqueUsers = new User[users.length];
        for(int i = 0; i < users.length; i++){
            count = 0;
            for(int y = 0; y < users.length; y++){
                if(i==y){
                    continue;
                }
                if(users[i].equals(users[y])){
                   count++;
                }
            }
            if(count==0){
                uniqueUsers[x] = users[i];
                x++;
            }
        }
        return  deleteEmptyUsers(uniqueUsers);
    }

    static User[] usersWithContitionalBalance(User[] users, int balance){
        users = deleteEmptyUsers(users);
        User[] usersWithContBalance = new User[users.length];
        int i = 0;
        for (User user : users) {
            if(balance==user.getBalance()){
                usersWithContBalance[i] = user;
                i++;
            }
        }
        return deleteEmptyUsers(usersWithContBalance);

    }

    static final User[] paySalaryToUser(User[] users){
        users = deleteEmptyUsers(users);
        for(int i = 0; i < users.length; i++){
            users[i].setBalance(users[i].getBalance()+users[i].getSalary());
        }
        return users;
    }

    static long[] getUsersId(User[] users){
        users = deleteEmptyUsers(users);
        long[] usersId = new long[users.length];
        for(int i = 0; i < users.length; i++){
            usersId[i] = users[i].getId();
        }
        return usersId;
    }

    static final User[] deleteEmptyUsers(User[] users){
        int count = 0;
        for(User user : users){
            if(user!=null){
                count++;
            }
        }

        User[] notEmptyUsers = new User[count];
        count = 0;
        for(User user : users){
            if(user!=null){
                notEmptyUsers[count] = user;
                count++;
            }
        }
        return notEmptyUsers;
    }
}
