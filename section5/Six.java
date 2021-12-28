package section5;

import java.util.*;

public class Six {

    public int solution(int size, int num){

        int answer =0;

        Queue <Integer> queue = new LinkedList<>();

        for( int i =0; i<size; i++) queue.offer(i+1);
        
        while( !queue.isEmpty()){

            for(int i=0; i<num-1 ; i++){
                queue.offer(queue.poll());
            }
            queue.poll();

            if (queue.size()==1) answer =queue.poll();

        }

        return answer ;

    }
    
    public static void  main(String [] arg){


        Six T = new Six();
        Scanner scanner= new Scanner(System.in);
        int size = scanner.nextInt();
        int num = scanner.nextInt();

        System.out.println(T.solution(size, num));
        scanner.close();

    }


}
