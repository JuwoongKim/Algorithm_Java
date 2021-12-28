package section5;

import java.util.*;

public class Two {
    

    public String solution(String str){

        String answer = "";

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()){

            if(stack.empty()){

                stack.push(c);
            }else{

                if(c ==')'){

                    while(stack.peek()!='(')
                    {
                        stack.pop();
                    }
                    stack.pop();
                }
                else{
                    stack.push(c);
                }

            }

        }

        for (int i = 0; i<stack.size(); i++) answer +=stack.get(i);

        return answer;
        
    }

    public static void main(String [] arg){

        Two T= new Two();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        
        System.out.println( T.solution(str) );
        scanner.close();

    }
}
