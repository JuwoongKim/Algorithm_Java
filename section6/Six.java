package section6;

import java.util.*;

public class Six {
    
    public List<Integer> solution(int length , int [] arr){
        
        List<Integer> answer = new ArrayList<>();

        int [] temp = arr.clone();
        Arrays.sort(temp);

        for(int i =0 ; i<length ; i++){
            if(temp[i]!=arr[i]) answer.add(i+1);
        }
        return answer;
    
    }


    public static void main(String [] arg){

        Six T = new Six();
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int [] arr = new int [length];

        for (int i =0 ; i <length ; i++) arr[i] = scanner.nextInt();

        for(int i : T.solution(length, arr)) System.out.print(i + " ");
        scanner.close();

    }
}
