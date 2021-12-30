package section6;

import java.util.*;


public class Four {

    public int [] solution (int size, int length, int [] arr){

        int [] cache = new int [size];
        Integer hitNum =null;

        for (int i : arr){

            hitNum = null;

            for (int j =0; j <size ; j++ ){                
                if( i == cache[j]){
                    hitNum =i;
                    for (int k=j; k>0;k--) cache[k] = cache[k-1];
                    break;
                }
            }

            if(hitNum == null){
                for(int j = size-1; j>0 ; j-- ) cache[j] = cache[j-1];
                hitNum =i;
            }
            cache[0]= hitNum;
        }


        return cache;

    }
    
    public static void main( String [] arg){

        Four T = new Four();
        Scanner scanner = new Scanner (System.in);

        int size = scanner.nextInt();
        int length = scanner.nextInt();

        int [] arr = new int [length];

        for( int i =0; i<length; i++) arr[i] = scanner.nextInt();

        for (int i : T.solution(size, length, arr)) System.out.print( i + " ");
        scanner.close();

    }
}
