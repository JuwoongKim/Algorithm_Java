package section3;

import java.util.*;

public class Four {
    
    public  int solution ( int num , int length , int []arr){


        int answer =0 ;
        int lt = 0;
        int sum = 0;

        for (int rt = 0 ; rt <length ; rt++){

            sum += arr[rt];

            if(sum==num) answer ++;

            while(sum>num){
                sum -= arr[lt++];
                if(sum==num) answer ++;
            }
        }

        return answer;

    }

    public static void main(String [] arg){

        Four T = new Four();


        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int num = scanner.nextInt();
        int [] arr = new int [length];


        for(int i =0;  i<length ; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println(T.solution(num, length, arr));

        scanner.close();


    }
}
