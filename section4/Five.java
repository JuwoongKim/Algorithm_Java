package section4;

import java.util.*;

public class Five {
 

    public int solution(int num, int length, int [] arr){

        int answer = 0 ;
        Set <Integer> set = new TreeSet<>( Collections.reverseOrder());
    
        for(int i =0; i <length ; i ++){
            for(int j =i+1; j <length ; j ++){
                for(int k =j+1; k <length ; k ++){
                    set.add(arr[i]+arr[j]+arr[k]);            
                }
            }
        }


        for(int i : set){
            answer ++;
            if(answer ==num)
            {
                answer = i;
                break;
            }

        }
        return answer;

    }
    
    public static void main(String [] arg) {



        Five T = new Five();

        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int num = scanner.nextInt();
        int [] arr = new int [length];

        for (int i =0; i<length; i++){

            arr[i] = scanner.nextInt();
        }


        System.out.println(T.solution( num,  length,  arr ));
        scanner.close();


    }



}
