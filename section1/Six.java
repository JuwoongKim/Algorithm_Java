package section1;

import java.util.*;


public class Six {

    
    public String solution (String str){


        String answer = "";

        for (char c : str.toCharArray()){

            if(!answer.contains(String.valueOf(c))){
                answer += c;
            }
        }

        return answer;
    }


    public static void main( String [] arg ){


        Six T = new Six();

        Scanner scanner = new Scanner (System.in);
        String str;

        str = scanner.next();
        System.out.println(T.solution(str));
        scanner.close();



    }
}
