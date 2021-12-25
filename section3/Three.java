package section3;


import java.util.*;



public class Three {




    public int solution (int window, int length, int [] arr){


        int answer = Integer.MIN_VALUE;
        int temp = 0;

        for( int i =0; i<length-window+1; i ++){

            temp = 0;
            for( int j =i ; j<i+window ; j++){
                temp +=  arr[j];
            }

            if( temp>answer){
                answer =temp;
            }

        }

    
        return answer;
    }


    public static void main(String [] arg){

        Three T = new Three();

        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int window = scanner.nextInt();

        int [] arr = new int [length];

        for ( int i =0 ; i <length ; i ++){
            arr[i] = scanner.nextInt();
        }


        System.out.println(T.solution(window, length, arr));

        scanner.close();

    }

}
