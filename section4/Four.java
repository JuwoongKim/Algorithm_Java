package section4;

import java.util.*;
public class Four {


    public int solution(String unit, String str){

        int answer = 0;

        Map <Character, Integer> unitMap = new HashMap<>();
        Map <Character, Integer> strMap = new HashMap<>();

        int length = str.length() - unit.length() ;

        for (char c : unit.toCharArray()){
            unitMap.put(c, unitMap.getOrDefault(c, 0)+1);
        }

        for (int i =0 ; i <=length ; i ++){


            for(int j = i ;  j <i +unit.length() ; j++){
                strMap.put(str.charAt(j), strMap.getOrDefault(str.charAt(j),0)+1);
            }
            
            if(unitMap.equals(strMap)) answer ++;

            strMap.clear();

        }
    
        return answer ; 

    }

    public static void main(String [] arg){

        Four T = new Four();
        Scanner scanner = new Scanner (System.in);
        String str = scanner.next();
        String unit = scanner.next();

        System.out.println(T.solution(unit, str));
        scanner.close();
        

    }

}
