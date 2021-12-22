package section1;

import java.util.*;

public class Eight {


    public String solution(String str){

        String answer ="YES";

        
        char [] charArray = str.toUpperCase().toCharArray();
        int lf= 0;
        int ri = charArray.length-1;

        while(lf<ri){

            if( !Character.isAlphabetic(charArray[lf])) lf++;
            else if ( !Character.isAlphabetic(charArray[ri])) ri--;
            else{

                if(charArray[lf]!=charArray[ri]){
                    answer ="NO";
                    return answer;
                }

                lf++;
                ri--;

            }
        }


        return answer;

    }

    
    public static void main(String [] arg){

        
        Eight T = new Eight();

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(T.solution(str));


        scanner.close();


    }
}
