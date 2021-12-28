package section5;

import java.util.*;


public class Seven {


    public String solution(String need, String plan){

        String answer = "YES";

        Queue<Character> queue = new LinkedList<>();

        for(char c : need.toCharArray()) queue.offer(c);

        for (char c : plan.toCharArray()){

            if( queue.contains(c)){

                if(c !=queue.poll()){
                    answer = "NO";
                    return answer;
                }
            }
        }

        if( !queue.isEmpty()){
            answer = "NO";
            return answer;
        }

        return answer;
    }

    public static void main( String [] arg){

        Seven T = new Seven();
        Scanner scanner = new Scanner (System.in);
        String need = scanner.next();
        String plan = scanner.next();

        System.out.println(T.solution(need, plan));
        scanner.close();

    }
    
}
