package section2;

import java.util.*;


public class Nine {

    
    public int solution ( int length, int [][] arr){

        int answer= 0;

        int sum1 = 0;
        int sum2 = 0;

        for(int i =0 ; i <length ; i ++){

            sum1 =sum2= 0;
            
            for( int j =0 ; j<length ; j++){


                sum1 += arr[i][j];  // 가로 
                sum2 += arr[j][i];  // 세로 

            }

            sum1 = Math.max(sum1, sum2);
            answer = Math.max(answer, sum1);
        }

        sum1 =sum2= 0;

        for(int i =0; i <length ; i ++){

            sum1 +=  arr[i][i];
            sum2 += arr[i][length-1-i];
        }

        sum1 = Math.max(sum1, sum2);
        answer = Math.max(answer, sum1);


        return answer;

    }

    public static void main(String [] arg){

    Nine T = new Nine();

    Scanner  scanner = new Scanner (System.in);

    int length = scanner.nextInt();

    int [][] arr = new int [length][length];


    for (int i =0; i <length ; i++){

        for( int j =0 ; j <length ; j ++){

            arr[i][j] = scanner.nextInt();
        }

    }

    System.out.println(T.solution(length, arr));

    scanner.close();


    }

}

