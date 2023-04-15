package Bhavani;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args){

        HashMap<String,Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println(map);
        System.out.println(map.size());

        for (String item : map.keySet()){
            System.out.println(map.get(item));
        }

        if (map.containsKey("A")){
           int a = map.get("A");
            System.out.println(a);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "."+ entry.getValue());
        }

    }

}
