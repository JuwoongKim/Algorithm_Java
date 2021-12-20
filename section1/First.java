package section1;

import java.util.*;

public class First{


    public int solution(String str, char c){

        int answer =0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

       
        for (char x :  str.toCharArray()){
            if(x ==c){
                answer ++;
            }
        }


        return answer;
    }


    public static void main(String [] arg){

        First T = new First();

        Scanner scanner = new Scanner(System.in);
        String str;
        char c;

        str= scanner.next();
        c = scanner.next().charAt(0);

        System.out.println(T.solution(str, c));

        scanner.close();

    }


}