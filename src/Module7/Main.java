package Module7;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[10];
        users[0] = new User(12345670L, "Petya",     "Petrov",         "Kiev", 14500);
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
        orderList.add( new Order(147258362L, 250,   Currency.UAH, "Pizza",                  "Pizza Market", users[2]));
        orderList.add( new Order(147258363L, 250,   Currency.UAH, "Engine Oil",             "Auto Market",  users[3]));
        orderList.add( new Order(147258364L, 250,   Currency.UAH, "Products",               "Market",       users[4]));
        orderList.add( new Order(147258365L, 650,   Currency.UAH, "Gas",                    "Gas Station",  users[5]));
        orderList.add( new Order(147258366L, 6500,  Currency.UAH, "Electronics",            "iMarket",      users[6]));
        orderList.add( new Order(147258367L, 745,   Currency.UAH, "Household chemicals",    "House Market", users[7]));
        orderList.add( new Order(147258368L, 132,   Currency.UAH, "Products",               "Market",       users[8]));
        orderList.add( new Order(147258369L, 75,    Currency.UAH, "Communication service",  "iMarket",      users[9]));

        System.out.println("\n====================sort list by Order price in decrease order====================");
        Collections.sort(orderList);
        System.out.println(orderList);

        System.out.println("\n====================sort list by Order price in increase order AND User city====================");
        orderList.sort(new PriceAndCityComparator());
        System.out.println(orderList);

        System.out.println("\n====================sort list by Order itemName AND ShopIdentificator AND User city====================");
        orderList.sort(new ItemNameAndShopAndCityComparator());
        System.out.println(orderList);


        Set<Order> orderSet = new TreeSet<>();
        orderSet.add( new Order(147258360L, 146,   Currency.UAH, "Cat Food",               "Zoo Market",   users[0]));
        orderSet.add( new Order(147258361L, 150,   Currency.USD, "Headphones",             "iMarket",      users[1]));
        orderSet.add( new Order(147258362L, 125,   Currency.UAH, "Pizza",                  "Pizza Market", users[2]));
        orderSet.add( new Order(147258363L, 250,   Currency.UAH, "Engine Oil",             "Auto Market",  users[3]));
        orderSet.add( new Order(147258364L, 232,   Currency.UAH, "Products",               "Market",       users[4]));
        orderSet.add( new Order(147258364L, 232,   Currency.UAH, "Products",               "Market",       users[4]));
        orderSet.add( new Order(147258365L, 635,   Currency.UAH, "Gas",                    "Gas Station",  users[5]));
        orderSet.add( new Order(147258366L, 650,   Currency.USD, "Electronics",            "iMarket",      users[6]));
        orderSet.add( new Order(147258367L, 745,   Currency.UAH, "Household chemicals",    "House Market", users[7]));

        Iterator iter = orderSet.iterator();
        Set<Order> orderTemp = new TreeSet<>();

        while (iter.hasNext()){
            Order order = (Order) iter.next();
            if(order.getUser().getLastName().equals("Petrov")) {
                System.out.println("\n====================check if set contain Order where User’s lastName is - “Petrov”====================");
                System.out.println("We found Petrov in collection");
            }
            if (order.getCurrency()==Currency.USD) orderTemp.add(order);
        }

        System.out.println("\n====================print Order with largest price using only one set method - get====================");
        List<Order> orderListSet = new ArrayList<>(orderSet);
        System.out.println(orderListSet.get(0));

        System.out.println("\n====================delete orders where currency is USD using Iterator====================");
        orderSet.removeAll(orderTemp);
        System.out.println(orderSet);
    }
}
