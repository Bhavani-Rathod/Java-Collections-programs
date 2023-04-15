package Bhavani;

import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args){

        TreeMap<String, Integer> trMap = new TreeMap<>();

        trMap.put("B",1);
        trMap.put("A",3);
        trMap.put("C",2);

        System.out.println(trMap);

        for (String key : trMap.keySet()){
            System.out.println(trMap.get(key));
        }
    }

}
