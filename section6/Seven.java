/*


package section6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Comparable interface를 사용하여  비교하는 프로그램입니다.


class Location implements Comparable<Location>{

    private int x;
    private int y;

    public Location(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void Print(){
        System.out.println(x + " " + y);
    }

    @Override
    public int compareTo(Location o){

        if(x ==o.x){
            if(y>o.y) return 1;
            else if( y ==o.y) return 0;
            else return -1;

        }else{
            if(x >o.x) return 1;
            else return -1;
        }
    }
}

public class Seven {

    public static void main(String [] arg){

        Seven T = new Seven();
        List<Location> LocationList = new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        int length = scanner.nextInt();
     
        for( int i =0 ; i <length ; i ++) LocationList.add(new Location(scanner.nextInt(), scanner.nextInt()));

        Collections.sort(LocationList);
        System.out.println();

        for( Location temp : LocationList) temp.Print();

        scanner.close();



    }
}


*/