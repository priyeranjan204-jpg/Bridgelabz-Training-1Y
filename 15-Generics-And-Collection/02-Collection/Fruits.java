package Collection;

import java.util.ArrayList;


public class Fruits {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Coconut");
        list.add("Papaya");
        list.add("Mango");

        System.out.println("My fruits:- "+list);

        String i0 = list.get(0);
        System.out.println("Index 0:-"+i0);

        list.set(0,"Orange");
        System.out.println("Upadated list:- "+list);

        list.remove("Apple");
        System.out.println("Apple Remove:- "+list);

        int sizelist = list.size();
        System.out.println("Size of the List:- "+sizelist);

        boolean CheckIsEmpty = list.isEmpty();
        System.out.println("Check is Empty:- "+CheckIsEmpty);

        boolean Contain = list.contains("Mango");
        System.out.println("Mango is present or not:- "+Contain);
    }
}
