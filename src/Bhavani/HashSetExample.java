package Bhavani;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args){
        HashSet<String> mySet = new HashSet<>(5);

        mySet.add("A");
        mySet.add("C");
        mySet.add("E");
        boolean r1 = mySet.add("D");
        boolean r2 = mySet.add("D");

        System.out.println(mySet);

        mySet.remove("C");
        boolean r3 =  mySet.contains("C");
        System.out.println(mySet);

        for (String item : mySet){
            System.out.println(item);
        }
    }

}
