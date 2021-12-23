package section2;

import java.util.*;

public class Three {
    

    public char []  solution ( int lenght, int [] a, int [] b){

        char [] answer = new char [lenght];

        for (int i =0 ; i <lenght ; i ++){

            switch(a[i] - b[i]){
                case 2: 
                    answer[i] = 'B';
                    break;
                
                case 1:
                    answer[i] = 'A';
                    break;

                case -1: 
                    answer[i] = 'B';
                    break;
                
                case -2:
                    answer[i] = 'A';
                    break;

                default:
                    answer[i] = 'D';
                    break;

            }

        }

        return answer;
    }


    public static void main(String [] arg){

        Three T = new Three();
        Scanner scanner = new Scanner (System.in);

        int length = scanner.nextInt();

        int [] a = new int [length];
        int [] b = new int [length];

        for (int i =0; i<length ; i++){
            a[i] = scanner.nextInt();
        }
        
        for (int i =0; i<length ; i++){
            b[i] = scanner.nextInt();
        }


        for ( char c : T.solution(length, a, b)){
            System.out.println(c);
        }


        scanner.close();

    }

}
