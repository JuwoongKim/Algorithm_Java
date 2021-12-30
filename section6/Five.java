package section6;

import java.util.*;

public class Five {

    
    public char solution(int length, int [] arr){

        char answer = 'U';

        Arrays.sort(arr);

        for(int i =0 ; i <length -1 ; i++){
            if(arr[i] == arr[i+1])
            {
                answer ='D';
                return answer;
                
            }
        }

        return answer;
    }


    public static void  main(String [] arg){


        Five T = new Five();
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int [] arr = new int [length];

        for ( int i =0; i <length ; i++) arr[i] = scanner.nextInt();

        System.out.println(T.solution(length, arr));
        scanner.close();

    }   

}
