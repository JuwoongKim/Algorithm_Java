package section1;

import java.util.*;

public class Four {


    public List<String> solution (List<String> strArr){

        List<String> result = new ArrayList<String>();

        for ( String str : strArr){

            String temp =""; 

            for (int i = str.length()-1; i>-1; i--){
                temp +=  str.charAt(i);
            }
            result.add(temp);
        }

        System.out.println("=========");

        return result;
    }


    public static void main(String [] arg){

        Four T = new Four();
        Scanner scanner = new Scanner (System.in);
        int num;
        List <String> strArr = new ArrayList<String>();
        List <String> result;

        num = scanner.nextInt();

        for (int i =0 ; i < num; i++){
            strArr.add(scanner.next());
        }


        for (String str : T.solution(strArr)){
            
            System.out.println(str);
        }
        

        scanner.close();

    }
    
}
