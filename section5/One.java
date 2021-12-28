package section5;

import java.util.*;

public class One {
    
    public String  solution( String str){

        String answer = "No";

        Stack <Character> stack = new Stack<>();

        for (char c : str.toCharArray()){

            // .empty : 비어있다면 true를 반환함
            if(stack.empty()){
                stack.push(c);
            }
            else{

                if( c ==')' && stack.peek()=='('){

                    stack.pop();
                }
                
                else{
                    
                    stack.push(c);

                }

            }


        }

        //stack.size==0    == stack.empty
        if (stack.size()==0) answer = "Yes"; 

        return answer;

    }

    public static void main(String [] arg){

        One T = new One ();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println( T.solution(str));
        scanner.close();
    
    }

}
