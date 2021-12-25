package section4;

import java.util.*;


public class SimpleTest {

    
    public static void main(String [] arg){


        Map <String, Integer> map1 = new HashMap<String, Integer>();
        Map <String, Integer> map2 = new HashMap<String, Integer>();

        map1.put("apple",1);
        map1.put("cola",3);
        map1.put("banana",2);
        

/*
       
        도데체 왜 자동정렬이 된걸까 //////

        for ( Map.Entry<String, Integer> entry : map1.entrySet()){
            System.out.println("[key]:" + entry.getKey() + ", [value]:" + entry.getValue());
        }
*/

        map2.put("cola",3);
        map2.put("apple",1);
        map2.put("banana",2);

/*
        for ( Map.Entry<String, Integer> entry2 : map2.entrySet()){
            System.out.println("[key]:" + entry2.getKey() + ", [value]:" + entry2.getValue());
        }
*/
        System.out.println(map1.equals(map2));

        System.out.println(map1.entrySet());
        System.out.println(map2.entrySet());


        for( String str : map1.keySet()){
            System.out.print(map1.get(str));
        }

        for( String str : map2.keySet()){
            System.out.print(map2.get(str));
        }


    }
}
