package section4;

import java.util.*;


public class Three {
    
    public List <Integer> solution(int length, int unit, int []arr){

        List<Integer> answer = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

     
        for( int i =0 ; i<length-unit+1 ; i++){

            for(int j=i ; j<i+unit; j++){
                set.add(arr[j]);
            }
            answer.add(set.size());
            set.clear();
        }


        return answer;
    }

    public static void main (String [] arg){

        Three T = new Three();
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int unit = scanner.nextInt();
        int [] arr = new int [ length];

        for( int i =0 ; i <length; i++){
            arr[i] = scanner.nextInt();
        }

        for( int i : T.solution(length, unit, arr)){
            System.out.print(i + " ");
        }

        scanner.close();

    }
}
