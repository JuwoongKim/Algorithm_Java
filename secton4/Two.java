package secton4;


import java.util.*;


public class Two {
    

    public String solution ( String str1, String str2){

        String answer = "YES";

        HashMap <Character, Integer> map1 = new HashMap<>();
        HashMap <Character, Integer> map2 = new HashMap<>();

        for( char c : str1.toCharArray()){

            map1.put(c, map1.getOrDefault(c, 0)+1);
        }


        for( char c : str2.toCharArray()){

            map2.put(c, map2.getOrDefault(c, 0)+1);
        }

        


        // 왜 object로 해도 되는 것일까 
        Object [] mapKeyArr1 = map1.keySet().toArray();
        Object [] mapKeyArr2 = map2.keySet().toArray();

        Arrays.sort(mapKeyArr1);
        Arrays.sort(mapKeyArr2);



        Object tempKey = null;
        for(int i=0 ; i< mapKeyArr1.length; i++){

            tempKey = mapKeyArr1[i];

            if(tempKey!=mapKeyArr2[i]){
                answer = "NO";
                break;
            }else{
                
                if(map1.get(tempKey)!=map2.get(tempKey)){
                    answer = "NO";
                    break;
                }
            }
        }

        return answer;

    }


    public static void main(String [] arg){

        Two T = new Two();
        Scanner scanner= new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        System.out.println(T.solution(str1, str2));

        scanner.close();

    }
}
