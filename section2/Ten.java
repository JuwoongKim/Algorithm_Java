package section2;

import java.util.*;


public class Ten {

    
    public int solution ( int length , int [][] arr){

        int answer =0;

        int [] arrI = { 0, -1 ,0,  1};
        int [] arrJ = { -1, 0, 1, 0 };

        int checkBit = 1 ;

        for ( int i =1; i <=length ; i ++){

            for( int j =1 ; j <=length; j ++){

                checkBit = 1;
                for(int k =0; k<4; k++){
                    if( arr[i][j] < arr[i+arrI[k]][j+arrJ[k]])
                        checkBit =0;
                }

                if(checkBit==1) answer ++;
            }
        }
        
        return answer ; 
    } 



    public static void main( String [] arg){


        Ten T = new Ten();
        Scanner scanner = new Scanner (System.in);

        int length =  scanner.nextInt();

        int [][] arr = new int [length+2][length+2];

        for ( int i =0; i <length+2 ; i++){

            for( int j =0 ; j <length+2 ; j ++){

                if(i ==0 || i ==length+1 || j==0 || j == length+1) arr[i][j]=0;
                else{
                    arr[i][j] = scanner.nextInt();
                }

            }
        }

        System.out.println(T.solution(length,arr));

        scanner.close();


    
        /*  나중에 출력시 참고할 것 
        for ( int i =0; i <length+2 ; i++){
            System.out.println( Arrays.toString(arr[i]));
        }
        */

    }
}
