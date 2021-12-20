package section1;

import java.util.*;



public class Third {

    public String solution(String str){


        String [] strArr;
        String answer ="";
        int min = 0;

        strArr = str.split(" ");

        for (String x : strArr){

            if(min < x.length()){
                min = x.length();
                answer = x;

            }
            else continue;

        }

        return answer;
    }
    
    public static void main( String [] arg){

        Third T = new Third();
        Scanner scanner =  new Scanner(System.in);
        String str;

        str = scanner.nextLine();

        System.out.println(T.solution(str));


        scanner.close();
    }
}
