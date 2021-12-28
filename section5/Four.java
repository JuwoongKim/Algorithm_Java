package section5;

import java.util.*;

public class Four {
    

    public int solution (String str){

        int answer=0;
        Stack<Integer> stack = new Stack<>();

        for ( char c : str.toCharArray()){

            if(Character.isDigit(c)){

                stack.push(c-48);
            }
            else{

                int rt = stack.pop();
                int lt = stack.pop();

                switch(c){

                    case '+': stack.push( lt +rt); break;

                    case '-': stack.push( lt -rt); break;

                    case '*': stack.push( lt *rt); break;

                    case '/': stack.push( lt /rt); break;

                }

            }
        }


        answer = stack.pop();
        return answer;


    }

    public static void  main( String [] arg){

        Four T = new Four ();
        Scanner scanner = new Scanner (System.in);
        String str = scanner.next();

        System.out.println(T.solution(str));
        scanner.close();

    }


}
