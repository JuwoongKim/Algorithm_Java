package section2;

import java.util.*;


public class Five {
    

    public int solution (int num){

        int answer =0;

        List <Integer> decimalList = new ArrayList<Integer>();
        decimalList.add(2);

        for( int i = 2;  i<= num; i++){
            if(i ==2) continue;

            int checkBit =0;
            
            for ( Integer j : decimalList){
                if(i%j==0 &&i!=j) {
                    checkBit =1 ;
                    break;
                }
            }

            if (checkBit ==0) decimalList.add(i);

        }
        /*
        for ( int i : decimalList){
            System.out.print(i + " ");
        }
        System.out.println();
        */
        answer = decimalList.size();

        return answer;
    }


    public static void main(String [] arg ){

        Five T = new Five();
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        System.out.println(T.solution(length));

        scanner.close();


    }
}
