package section2;

import java.util.*;


public class Six {
    

    public List<Integer> solution (int length, String [] strArr){

        List<Integer> answer = new ArrayList<Integer>();
   
        // 소수 판별을 위한 boolean 배열을 만드는 작업 
        // 초기화 
        int maxRange= 100000;     
        boolean [] primeArr = new boolean [maxRange+1];
        Arrays.fill(primeArr, true);
        primeArr[0]= false;
        primeArr[1]= false;

        // 값대입 
        for(int i =2; i<primeArr.length;i++){
            if(primeArr[i]==false) continue;
            else{
                int max = maxRange/i;
                for ( int j =2; j<=max ; j++){
                    int index = i*j;
                    primeArr[index]= false;
                }
            }
        }


        for(String str : strArr){

            String tempStr= "";
            int tempInt;

            for(int i = str.length()-1 ; i>=0 ; i --){
                tempStr +=str.charAt(i);
            }

            tempInt = Integer.parseInt(tempStr);
            
            if(primeArr[tempInt]) answer.add(tempInt);

        }

        return answer;
    }


    public static void main(String [] arg){

        Six T = new Six();
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        String [] strArr = new String [length];

        for( int i =0 ; i <length ; i++){
            strArr[i] = scanner.next();
        }


        for ( int i : T.solution(length, strArr)){
            System.out.print(i + " ");
        }
        
        scanner.close();


    }

}
