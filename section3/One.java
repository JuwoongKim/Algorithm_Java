package section3;

import java.util.*;


public class One {

    
    public List<Integer> solution ( int firstLength, int secondLength, int [] arr1, int [] arr2){

        List <Integer> answer = new ArrayList<Integer>();

        int first =0;
        int second = 0;

        while ( first < firstLength && second <secondLength){

            if(arr1[first]>= arr2[second]){
                answer.add(arr2[second]);
                second ++;
            }else{
                answer.add(arr1[first]);
                first++;
            }
        }
        while(first !=firstLength){
            answer.add(arr1[first]);
            first++;
        }
        while(second != secondLength){
            answer.add(arr2[second]);
            second ++;
        }

        return answer;
     
    }



    public static void main(String [] arg){

        One T = new One();
        Scanner scanner = new Scanner(System.in);

        int firstLength = scanner.nextInt();
        int [] arr1 = new int [firstLength];
        for( int i=0; i <firstLength ; i++){
            arr1[i] = scanner.nextInt();
        }

        int secondLength = scanner.nextInt();
        int [] arr2 = new int [secondLength];
        for( int i =0; i <secondLength ; i++){
            arr2[i] = scanner.nextInt();
        }

        for ( int i : T.solution(firstLength, secondLength, arr1, arr2) ){
            System.out.print(i + " ");
        }


        scanner.close();


    }
}
