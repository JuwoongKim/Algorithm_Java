package section2;

import java.util.*;


public class Seven {

    
    public int solution(int length, int[] intArr){


        int answer = 0;

        int preScore=0;


        for (int i =0; i<length; i++){
            
            if(intArr[i]==1) answer += (++preScore); 
            else preScore=0;
            
        }

        return answer ; 
    }

    public static void main(String [] arg){

        Seven T = new Seven();
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        int [] intArr = new int[length];

        for (int i =0; i <length; i ++){

            intArr[i] = scanner.nextInt();
        }

        System.out.println(T.solution(length, intArr));


    }
}
