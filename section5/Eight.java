package section5;

import java.util.*;


class Person{

    int id;
    int priority;
    
    public Person( int id, int priority){

        this.id = id;
        this.priority =priority;

    }

}



public class Eight {
    

    public int solution(int num, int length, int [] arr){

        int answer = 0 ;
        Queue <Person> queue = new LinkedList<>();
        Integer priority= null;

        for( int i =0; i<length ; i++ ) queue.offer( new Person(i, arr[i]));

        while(true){

            Person mainPerson = queue.poll();            
            priority = mainPerson.priority;
            
            for ( Person subPerson : queue){

                if(priority < subPerson.priority){

                    priority = null;
                    queue.offer(mainPerson);
                    break;
                }

            }

            if(priority !=null){ 

                answer ++;
                if( mainPerson.id == num){
                    break;
                }

            }

        }
        

        return answer;
    }

    public static void  main( String [] arg){

        Eight T = new Eight();

        Scanner scanner= new Scanner (System.in);
        int lenght = scanner.nextInt();
        int num = scanner.nextInt();
        int [] arr = new int [lenght];

        for(int j =0 ; j <lenght ; j ++)
        {
            
            arr[j] = scanner.nextInt();
        }

        System.out.println(T.solution(num, lenght, arr));
        scanner.close();


    }
}
