package section4;

import java.util.*;

public class One {
    

    public char solution(int length, String str){

        char answer = ' ';

        HashMap <Character, Integer> map = new HashMap<>();


        for( char c : str.toCharArray()){

            map.put(c, map.getOrDefault(c, 0)+1);

        }
        int max = Integer.MIN_VALUE;

        for ( char key : map.keySet()){
            if(max<map.get(key)){
                max = map.get(key);
                answer = key;
            }
        }


        return answer;
    }

    public static void main(String [] arg){


        One T = new One();
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        String str = scanner.next();

        System.out.println( T.solution(length, str));

        scanner.close();



    }
}
