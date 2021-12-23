package section2;

import java.util.*;


public class Four {


    public int [] solution (int length){

        int [] answer = new int [length];

        for (int i =0; i <length ; i ++){

            if( i ==0 || i ==1) answer[i] =1 ;
            
            else answer[i]= answer[i-1] + answer[ i-2];
         
        }

        return answer;

    }
    
    public static void main(String [] arg){

        Four T = new Four();
        Scanner scanner = new Scanner (System.in);
        int lenght = scanner.nextInt();

        for (int ele : T.solution(lenght)){

            System.out.print(ele + " ");
        }

        scanner.close();

    }

}
