package section1;

import java.util.*;

public class Eleven {
    


    public String solution (String str){

        String answer = "";
        
        char [] charArr = str.toCharArray();
        int cnt=0;

        for (int i =0 ; i <charArr.length ; i++)
        {
            if( i==0){
                answer += charArr[i];
                cnt++;
            }
            else{

                if( charArr[i-1] == charArr[i]){
                    cnt++;
                }
                else{

                    if(cnt>1) answer += String.valueOf(cnt);
                    
                    answer +=charArr[i];
                    cnt=1;
                }

            }
        }


        return answer; 

    }

    public static void main(String [] arg){

        Eleven T = new Eleven();
        Scanner scanner = new Scanner (System.in);
        String str = scanner.next();


        System.out.println(T.solution(str));

  





    }


}
