package section2;

import java.util.*;



public class Eight {


    public int [] solution (int length, int [] intArr){

        int [] answer = new int [length];


        for( int i =0; i <length ; i ++){
            int rank =1;

            for(int j =0; j<length ; j ++){

                if(j==i) continue;
                else{
                    if(intArr[j]>intArr[i]) rank ++;
                }
            }

            answer[i] = rank;
        }

        return answer;
    }


    public static void main(String [] arg){

        Eight T = new Eight ();
        Scanner scanner = new Scanner (System.in);
        
        int length = scanner.nextInt();
        int [] intArr = new int [length];

        for (int i =0; i < length ; i++){

            intArr[i] = scanner.nextInt(); 
        }

        for(int i :  T.solution(length, intArr)){

            System.out.print(i + " ");
        }


        scanner.close();

    }
}
