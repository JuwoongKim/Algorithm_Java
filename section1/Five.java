package section1;

import java.util.*;



public class Five{


    public char [] solution ( String str){

        char [] answer = str.toCharArray();

        int lf = 0;
        int rf = str.length()-1;

        while(lf<rf){

            if(!Character.isAlphabetic(answer[lf])) lf ++;
            else if(!Character.isAlphabetic(answer[rf])) rf --;
            else{

                char temp = answer[lf];
                answer[lf] = answer[rf];
                answer[rf] = temp;
                lf ++;
                rf --;

            }


        }


        return answer;
    }


    public static void main (String [] arg){

        Five T = new Five();

        Scanner scanner = new Scanner( System.in);

        String str = scanner.next();

        System.out.println(T.solution(str));


    }


    

}