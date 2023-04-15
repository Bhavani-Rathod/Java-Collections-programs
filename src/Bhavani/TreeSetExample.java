package Bhavani;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args){

        TreeSet<String> trSet = new TreeSet<>();
        trSet.add("S");
        trSet.add("Q");
        trSet.add("R");
        trSet.add("P");
        trSet.add("P");

        trSet.remove("Q");

        System.out.println(trSet);

    }

}
