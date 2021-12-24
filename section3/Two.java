package section3;

import java.util.*;

public class Two {
    

    public List<Integer> solution(int length1, int length2, int[] arr1, int []arr2){

        List <Integer> answer = new ArrayList<Integer>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int idx1=0;
        int idx2=0;

        while(idx1<length1 && idx2<length2){

            if(arr1[idx1]>arr2[idx2]) idx2++;
            else if (arr1[idx1]<arr2[idx2]) idx1++;
            else{

                answer.add(arr1[idx1]);
                idx1++;
                idx2++;
            }

        }

        return answer;
    }

    public static void main(String [] arg){

        Two T = new Two();
        Scanner scanner = new Scanner (System.in);

        int length1 = scanner.nextInt();
        int [] arr1 = new int [length1];
        for (int i =0; i<length1; i++){
            arr1[i] = scanner.nextInt();
        }

        int length2 = scanner.nextInt();
        int [] arr2 = new int [length2];
        for(int i =0; i<length2 ; i ++){
            arr2[i] = scanner.nextInt();
        }

        for(int i : T.solution(length1, length2, arr1, arr2)){
            System.out.print(i + " ");
        }

        scanner.close();


    }



}
