package Bhavani;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args){

        LinkedList<String> myList = new LinkedList<>();

        myList.add("A");
        myList.add("B");
        myList.addFirst("F");
        myList.addLast("E");
        System.out.println(myList);

        myList.remove("B");
        System.out.println(myList);

        myList.add("C");
        myList.remove(2);
        System.out.println(myList);
        myList.add("C");
        System.out.println(myList);

        System.out.println(myList.get(2));
    }

}
