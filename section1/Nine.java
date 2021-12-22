package section1;

import java.util.*;


public class Nine {
    

    public int solution (String str){

        int answer =0;
        int limit = 100000000;
        
        String result ="";
        

        for (int i =0 ; i < str.length()-1 ; i++){

            if( Character.isDigit( str.charAt(i) ))  result +=str.charAt(i);
        }


        if( Integer.parseInt(result) ==limit)
        {
            answer = limit;
            return answer;
        }
        else{
            result = Integer.toString(Integer.parseInt(result)%limit);
            answer = Integer.parseInt(result);
        }

        return answer;
    }



    public static void main(String [] arg){


        Nine T = new Nine();
        Scanner scanner= new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(T.solution(str));
        scanner.close();
    }
}
