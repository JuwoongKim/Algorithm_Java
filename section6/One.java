package section6;

import java.util.*;


public class One {


    public int [] solution (int length, int [] arr){



            int min = Integer.MAX_VALUE;
            Integer point = null;
            Integer temp =null;
            for(int i =0; i<length ; i++){

                for(int j= i ;j<length ; j++){

                    if(min>arr[j]){
                        min = arr[j];
                        point =j;
                    }

                }

                temp = arr[i];
                arr[i] = arr[point];
                arr[point] = temp;
                temp = null;
                min =Integer.MAX_VALUE;

            }

            return arr;
        }

    public static void main(String [] arg){

        One T = new One();
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int [] arr = new int [length];

        for(int i =0; i<length; i++ ){

            arr[i] = scanner.nextInt();
        }

        for(int i : T.solution(length, arr)){
            System.out.print(i + " ");
        }
        
    }
}
