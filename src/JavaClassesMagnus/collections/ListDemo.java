package JavaClassesMagnus.collections;

import java.util.*;

public class ListDemo {
    public static void main(String[] args){
        List<String> l=new ArrayList<>();
        l.add("Alice");
        l.add("Bob");
        l.add("Sam");
        System.out.println(l);
        l.remove("Alice");
        System.out.println(l);

        //MAP
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Alice");
        map.put(2,"Bob");
        map.put(3,"Sam");
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.size());

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(STR."\{entry.getKey()}::\{entry.getValue()}");


            Iterator<Map.Entry<Integer,String>> it = map.entrySet().iterator();
            while (it.hasNext()){
                Map.Entry<Integer, String> next = it.next();
                System.out.println(STR."\{next.getKey()}||\{next.getValue()}");
            }
        }
    }
}
