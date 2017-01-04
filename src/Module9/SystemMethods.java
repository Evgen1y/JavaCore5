package Module9;


import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by bulov on 04.01.2017.
 */
public class SystemMethods {

    public List sortByPrice (List<Order> list){
        return list.stream().sorted((o1, o2) -> o2.getPrice()-o1.getPrice()).collect(Collectors.toList());
    }

    public List sortByPriceAndCity (List<Order> list){
        return list.stream().sorted(Comparator.comparing(Order::getPrice).thenComparing(Order::getUserCity)).collect(Collectors.toList());
    }

    public List sortByItemNameAndShopIdAndCity (List<Order> list){
        return list.stream()
                .sorted(Comparator.comparing(Order::getItemName).thenComparing(Order::getShopIdentificator).thenComparing(Order::getUserCity))
                .collect(Collectors.toList());
    }

    public List deleteDuplicate (List<Order> list){
        return list.stream().distinct().collect(Collectors.toList());
    }

    public List deletePriceLower1500 (List<Order> list){
        return list.stream()
                .filter(order -> order.getPrice()>=1500)
                .collect(Collectors.toList());
    }

    public void split (List<Order> list){
        List<Order> usdList = list.stream().filter(order -> order.getCurrency()==Currency.USD).collect(Collectors.toList());
        System.out.println("USD: " + usdList);
        List<Order> uahList = list.stream().filter(order -> order.getCurrency()==Currency.UAH).collect(Collectors.toList());
        System.out.println("UAH: " + uahList);
    }

    public void splitCity (List<Order> list){
           Map<String, List<Order>> cityMap = list.stream().collect(Collectors.groupingBy(Order::getUserCity, Collectors.toList()));
           for(Map.Entry<String, List<Order>> item : cityMap.entrySet()){
               System.out.println(item.getKey());
               System.out.println(item.getValue());
           }
    }

    public boolean checkPetrov (Set<Order> set){
        return set.stream().anyMatch(order -> order.getUser().getLastName()=="Petrov");
    }

    public Set deleteUsd (Set<Order> set){
        Set<Order> testSet = set.stream().filter(order -> order.getCurrency()==Currency.USD).collect(Collectors.toSet());
        set.removeAll(testSet);
        return set;
    }
}
