package section2;


import java.util.*;


public class Eleven {


    public int solution (int row, int col ,int [][] arr)
    {
        
        int answer=0;
        int answerScore=0;
 
        int score=0;

        for (int i =0; i <row; i ++){
            score = 0;

            for( int j=0; j <row ; j++){

                if(i==j) continue;
                else{


                    for(int k=0; k<col; k++){
                        if(arr[i][k]==arr[j][k])
                        {
                            score ++;
                            break;
                        }
                    }

                }
            }

            if(score>answerScore){
                answer = i+1;
                answerScore = score;
            }
        }


        return answer;

    }
    public static void main(String [] arg){

        Eleven T = new Eleven();
        Scanner scanner = new Scanner (System.in);

        int row = scanner.nextInt();
        int col = 5;
        int [][] arr = new int [row][col];
        
        
        for(int i =0; i<row; i ++){
            for(int j =0; j <col ; j ++){

                arr[i][j] = scanner.nextInt();

            }
        }


        System.out.println( T.solution(row,col, arr));


        scanner.close();


    }


}
