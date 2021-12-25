package section7;

import java.util.*;

public class Six {

    // static의 의미는 무엇일까... 
    static int [] arr;
    static int length;


    public void DFS(int idx){

        if( idx ==length+1){

            for( int i=1 ; i<length+1 ; i++){
                if( arr[i] ==1)
                    System.out.print( i + " ");
            }
            System.out.print("\n");
            return;
        }


        arr[idx] =1;
        DFS(idx +1);
        arr[idx]=0;
        DFS(idx +1);

    }


    public void solution(int num){
        DFS(num);
    }

    public static void main(String [] arg){

        Six T = new Six();

        Scanner scanner = new Scanner (System.in);

        length = scanner.nextInt();

        arr = new int [ length+1];

        T.solution(1);


    }
}
