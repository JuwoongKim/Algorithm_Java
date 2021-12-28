package section5;

import java.util.*;


public class Five {

    public int solution(String str){

        int answer =0;

        Stack <Character> stack = new Stack<>();

        for (int i =0; i<str.length(); i++){

            if( str.charAt(i) == '('){
                stack.push(str.charAt(i));
            }
            else{

                if(str.charAt(i-1) =='(') {
                    stack.pop();
                    answer += stack.size();
                }
                else{

                    stack.pop();
                    answer +=1;
                }
            }
        }


        return answer;
    }
    

    public static void main ( String [] arg){


        Five T = new Five();

        Scanner scanner = new Scanner (System.in);
        String str = scanner.next();

        System.out.println(T.solution(str));
        scanner.close();


    }
}
