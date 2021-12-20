package section1;

import java.util.*;

public class Second {
    

    public String solution(String str){

        String answer ="";

        for ( char x : str.toCharArray())
        {
            if(Character.isUpperCase(x))
            {
                answer += Character.toLowerCase(x);
            }
            else{
                answer += Character.toUpperCase(x);
            }
        }


        return answer;
    }
    

    public static void main( String [] arg)
    {
        Second T  = new Second();
        Scanner scanner = new Scanner(System.in);
        String str ;

        str = scanner.next();

        System.out.println(T.solution(str));
        scanner.close();

        
    }
}
