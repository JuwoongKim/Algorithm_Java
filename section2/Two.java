package section2;

import java.util.*;


public class Two {
    

    public int solution(int length, int [] intArr){

        int answer =0;

        int temp = -1;

        for (int i =0; i <length ; i++){

            if(intArr[i]>temp){
                answer++;
                temp = intArr[i];
            }

        }


        return answer;

    }


    public static void main(String [] arg){

        Two T = new Two();

        Scanner scanner= new Scanner(System.in);
        int length = scanner.nextInt();
        int [] intArr = new int[length];

        for( int i =0; i <length ; i++){
            intArr[i] = scanner.nextInt();
        }

        System.out.println(T.solution(length, intArr));

        scanner.close();
    }
}
