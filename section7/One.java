package section7;

import java.util.*;

public class One {

    
    public void DFS(int num){

        if(num ==1){
            System.out.print(num +" ");
            return;
        }


        DFS(num-1);
        System.out.print(num + " ");
        return ;

    }

    public void solution( int num){
        
        DFS(num);
        return;
    }

    public static void main(String []arg){

        One T = new One();
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        T.solution(num);        

        scanner.close();
    }
}
