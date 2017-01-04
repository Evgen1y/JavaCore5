package Module9;




import java.util.*;

public class Main {


    public static void main(String[] args) {


        User[] users = new User[10];
        users[0] = new User(12345670L, "Petya",     "Petrov",       "Kiev", 14500);
        users[1] = new User(12345671L, "Vasya",     "Kosoy",        "Kiev", 225015);
        users[2] = new User(12345672L, "Kirill",    "Murka",        "Lviv", 4500);
        users[3] = new User(12345673L, "Vova",      "Kozak",        "Kharkiv", 1458);
        users[4] = new User(12345674L, "Maxim",     "Kalashnokov",  "Dnepr", 76223);
        users[5] = new User(12345675L, "Petya",     "Poroshenko",   "Chernigov", 10154785);
        users[6] = new User(12345676L, "Dima",      "Bilan",        "Moscow", 145780);
        users[7] = new User(12345677L, "Olya",      "Polyakova",    "Donetsk", 321254);
        users[8] = new User(12345678L, "Katya",     "Chehova",      "Odessa", 14200);
        users[9] = new User(12345679L, "Yana",      "Aguzarova",    "Yalta", 35620);

        List<Order> orderList = new ArrayList<>();
        orderList.add( new Order(147258360L, 146,   Currency.UAH, "Cat Food",               "Zoo Market",   users[0]));
        orderList.add( new Order(147258361L, 1500,  Currency.UAH, "Headphones",             "iMarket",      users[1]));
        orderList.add( new Order(147258362L, 250,   Currency.USD, "Pizza",                  "Pizza Market", users[2]));
        orderList.add( new Order(147258363L, 250,   Currency.UAH, "Engine Oil",             "Auto Market",  users[3]));
        orderList.add( new Order(147258364L, 250,   Currency.UAH, "Products",               "Market",       users[4]));
        orderList.add( new Order(147258365L, 650,   Currency.UAH, "Gas",                    "Gas Station",  users[5]));
        orderList.add( new Order(147258366L, 6500,  Currency.UAH, "Electronics",            "iMarket",      users[6]));
        orderList.add( new Order(147258366L, 6500,  Currency.UAH, "Electronics",            "iMarket",      users[6]));
        orderList.add( new Order(147258367L, 745,   Currency.USD, "Household chemicals",    "House Market", users[7]));
        orderList.add( new Order(147258368L, 132,   Currency.UAH, "Products",               "Market",       users[8]));
        orderList.add( new Order(147258369L, 75,    Currency.UAH, "Communication service",  "iMarket",      users[9]));

        SystemMethods s = new SystemMethods();

        System.out.println("SORT LIST BY ORDER PRICE IN DECREASE ORDER \n" + s.sortByPrice(orderList));
        System.out.println();
        System.out.println("SORT LIST BY ORDER PRICE AND USER CITY \n" + s.sortByPriceAndCity(orderList));
        System.out.println();
        System.out.println("SORT LIST BY ORDER ITEM NAME AND SHOP ID AND USER CITY \n" + s.sortByItemNameAndShopIdAndCity(orderList));
        System.out.println();
        System.out.println("REMOVE THE DUPLICATE DATA FROM LIST \n" + s.deleteDuplicate(orderList));
        System.out.println();
        System.out.println("REMOVE OBJECTS WHERE THE PRICE IS LESS THAN 1500 \n" + s.deletePriceLower1500(orderList));
        System.out.println();
        System.out.println("ORDERS IN USD AND IN UAH");
        s.split(orderList);
        System.out.println();
        s.splitCity(orderList);

        Set<Order> orderSet = new HashSet<>();
        orderSet.add( new Order(147258360L, 146,   Currency.UAH, "Cat Food",               "Zoo Market",   users[0]));
        orderSet.add( new Order(147258361L, 150,   Currency.USD, "Headphones",             "iMarket",      users[1]));
        orderSet.add( new Order(147258362L, 125,   Currency.UAH, "Pizza",                  "Pizza Market", users[2]));
        orderSet.add( new Order(147258363L, 250,   Currency.UAH, "Engine Oil",             "Auto Market",  users[3]));
        orderSet.add( new Order(147258364L, 232,   Currency.UAH, "Products",               "Market",       users[4]));
        orderSet.add( new Order(147258364L, 232,   Currency.UAH, "Products",               "Market",       users[4]));
        orderSet.add( new Order(147258365L, 635,   Currency.UAH, "Gas",                    "Gas Station",  users[5]));
        orderSet.add( new Order(147258366L, 650,   Currency.USD, "Electronics",            "iMarket",      users[6]));
        orderSet.add( new Order(147258367L, 745,   Currency.UAH, "Household chemicals",    "House Market", users[7]));

        System.out.println();
        System.out.println("CHECK IF SET CONTAIN ORDER WHERE USER'S LAST NAME IS PETROV \n" + s.checkPetrov(orderSet));
        System.out.println();
        System.out.println("DELETE ORDERS WHERE CURRENCY IS USD \n" + s.deleteUsd(orderSet));
    }
}
