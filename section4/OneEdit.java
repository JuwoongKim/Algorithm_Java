
package section4;

import java.util.*;

public class OneEdit{

    public char solution( int length, String str ){

        char answer = ' ';
        int sum =Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<>();

        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(char c : map.keySet())
        {
            if(map.get(c)>sum) {
                answer = c; 
                sum =map.get(c);
            }
        }

            return answer;

    }

    public static void main(String [] arg){

        OneEdit T = new OneEdit();
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        String str = scanner.next();

        System.out.println(T.solution(length, str));
        scanner.close();


    }
}