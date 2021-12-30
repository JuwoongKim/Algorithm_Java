package section6;

import java.util.*;

public class Eight {
    

    public int binarySearch(int num, int start, int end , int []arr){


        //int divide 
        

    }

    public int solution ( int num, int length , int [] arr){

        int answer =0 ; 

        Arrays.sort(arr);

        answer = binarySearch(num,0, length, arr)

        return answer;
    }

    public static void main(String [] arg){

        Eight T = new Eight();
        Scanner scanner = new Scanner (System.in);
        int length = scanner.nextInt();
        int num = scanner.nextInt();
        int [] arr = new int [length]; 

        for(int i =0 ; i<length ; i++)  arr[i] = scanner.nextInt();

        System.out.println(T.solution(num, length, arr));
        scanner.close();

    }
}
