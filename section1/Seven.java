package section1;

import java.util.*;

public class Seven {
    


    public String solution(String str){


        String answer = "YES";

        str = str.toLowerCase();
        int hSize = str.length()/2;
        
        char [] charArr = str.toCharArray();
        int lf = 0 ;
        int ri = str.length()-1;


        for (int i =0; i<hSize ; i++){

            if(charArr[lf]!=charArr[ri]){
                answer = "NO";
                return answer;
            }
        }

        return answer;

    }

    public static void main(String [] arg){

        Seven T = new Seven();
        Scanner scanner= new Scanner(System.in);
        String str;

        str= scanner.next();

        System.out.println(T.solution(str));
        
        scanner.close();

    }
}
