package Module7;


import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TimeTestCollection {
    public static void main(String[] args) {
        List<Integer> userArrayList1k = new ArrayList<>();
        List<Integer> userArrayList10k = new ArrayList<>();
        List<String> userArrayListString1k = new ArrayList<>();
        List<String> userArrayListString10k = new ArrayList<>();
        List<Integer> userLinkedList1k = new LinkedList<>();
        List<Integer> userLinkedList10k = new LinkedList<>();
        List<String> userLinkedListString1k = new LinkedList<>();
        List<String> userLinkedListString10k = new LinkedList<>();
        int k = 10000;
        int kk = 100000;
        String test = "test";

        System.out.println("================ADD================");

        Date start = new Date();
        for(int i = 0; i < k; i++){
            userArrayList1k.add(i);
        }
        Date end = new Date();
        long time = end.getTime()-start.getTime();
        System.out.println("ArrayList 1k Integer = "+time+" ms");

        start = new Date();
        for(int i = 0; i < kk; i++){
            userArrayList10k.add(i);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("ArrayList 10k Integer = "+time+" ms");

        start = new Date();
        for(int i = 0; i < k; i++){
            userArrayListString1k.add(test);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("ArrayList 1k String = "+time+" ms");

        start = new Date();
        for(int i = 0; i < kk; i++){
            userArrayListString10k.add(test);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("ArrayList 10k String = "+time+" ms");

        start = new Date();
        for(int i = 0; i < k; i++){
            userLinkedList1k.add(i);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("LinkedList 1k Integer = "+time+" ms");


        start = new Date();
        for(int i = 0; i < kk; i++){
            userLinkedList10k.add(i);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("LinkedList 10k Integer = "+time+" ms");

        start = new Date();
        for(int i = 0; i < kk; i++){
            userLinkedListString1k.add(test);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("LinkedList 1k String = "+time+" ms");

        start = new Date();
        for(int i = 0; i < kk; i++){
            userLinkedListString10k.add(test);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("LinkedList 10k String = "+time+" ms");

        System.out.println("================SET================");

        start = new Date();
        for(int i = 0; i < k; i++){
            userArrayList1k.set(i, k);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("ArrayList 1k Integer = "+time+" ms");

        start = new Date();
        for(int i = 0; i < kk; i++){
            userArrayList10k.set(i, kk);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("ArrayList 10k Integer = "+time+" ms");

        start = new Date();
        for(int i = 0; i < k; i++){
            userArrayListString1k.set(i, test);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("ArrayList 1k String = "+time+" ms");

        start = new Date();
        for(int i = 0; i < kk; i++){
            userArrayListString10k.set(i, test);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("ArrayList 10k String = "+time+" ms");

        start = new Date();
        for(int i = 0; i < k; i++){
            userLinkedList1k.set(i, k);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("LinkedList 1k Integer = "+time+" ms");

        start = new Date();
        for(int i = 0; i < kk; i++){
            userLinkedList10k.set(i, k);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("LinkedList 10k Integer = "+time+" ms");

        start = new Date();
        for(int i = 0; i < k; i++){
            userLinkedListString1k.set(i, test);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("LinkedList 1k String = "+time+" ms");

        start = new Date();
        for(int i = 0; i < kk; i++){
            userLinkedListString10k.set(i, test);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("LinkedList 10k String = "+time+" ms");

        System.out.println("================GET================");

        start = new Date();
        for(int i = 0; i < k; i++){
            userArrayList1k.get(i);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("ArrayList 1k Integer = "+time+" ms");

        start = new Date();
        for(int i = 0; i < kk; i++){
            userArrayList10k.get(i);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("ArrayList 10k Integer = "+time+" ms");

        start = new Date();
        for(int i = 0; i < k; i++){
            userArrayListString1k.get(i);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("ArrayList 1k String = "+time+" ms");

        start = new Date();
        for(int i = 0; i < kk; i++){
            userArrayListString10k.get(i);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("ArrayList 10k String = "+time+" ms");

        start = new Date();
        for(int i = 0; i < k; i++){
            userLinkedList1k.get(i);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("LinkedList 1k Integer = "+time+" ms");

        start = new Date();
        for(int i = 0; i < kk; i++){
            userLinkedList10k.get(i);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("LinkedList 10k Integer = "+time+" ms");

        start = new Date();
        for(int i = 0; i < k; i++){
            userLinkedListString1k.get(i);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("LinkedList 1k String = "+time+" ms");

        start = new Date();
        for(int i = 0; i < kk; i++){
            userLinkedListString10k.get(i);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("LinkedList 10k String = "+time+" ms");

        System.out.println("================REMOVE================");

        start = new Date();
        for(int i = 0; i < userArrayList1k.size(); i++){
            userArrayList1k.remove(i);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("ArrayList 1k Integer = "+time+" ms");

        start = new Date();
        for(int i = 0; i < userArrayList10k.size(); i++){
            userArrayList10k.remove(i);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("ArrayList 10k Integer = "+time+" ms");

        start = new Date();
        for(int i = 0; i < userArrayListString1k.size(); i++){
            userArrayListString1k.remove(test);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("ArrayList 1k String = "+time+" ms");

        start = new Date();
        for(int i = 0; i < userArrayListString10k.size(); i++){
            userArrayListString10k.remove(test);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("ArrayList 10k String = "+time+" ms");

        start = new Date();
        for(int i = 0; i < userLinkedList1k.size(); i++){
            userLinkedList1k.remove(i);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("LinkedList 1k Integer = "+time+" ms");

        start = new Date();
        for(int i = 0; i < userLinkedList10k.size(); i++){
            userLinkedList10k.remove(i);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("LinkedList 10k Integer = "+time+" ms");

        start = new Date();
        for(int i = 0; i < userLinkedListString1k.size(); i++){
            userLinkedListString1k.remove(i);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("LinkedList 1k String = "+time+" ms");

        start = new Date();
        for(int i = 0; i < userLinkedListString10k.size(); i++){
            userLinkedListString10k.remove(i);
        }
        end = new Date();
        time = end.getTime()-start.getTime();
        System.out.println("LinkedList 10k String = "+time+" ms");




    }
}
