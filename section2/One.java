package section2;

import java.util.*;



public class One {
    

    public List<Integer> solution (int length, int [] intArr){

        List<Integer> answer = new ArrayList<Integer>();

        for(int i =0; i <length; i++){
            if(i==0) answer.add(intArr[i]);
            else{
                if(intArr[i]> intArr[i-1] ){
                    answer.add(intArr[i]);
                }
            }
        }

        return answer;

    }


    public static void main (String [] arg){

        One T = new One();
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int [] intArr = new int[length];

        for (int i =0 ; i <intArr.length;i++){
            intArr[i]= scanner.nextInt();
        }

        for( int i : T.solution(length, intArr)){

            System.out.print(i +" ");
        }

        scanner.close();



    }

}
