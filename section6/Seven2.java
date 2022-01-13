package section6;

import java.util.*;


// Comparater를 활요한 정렬 

class Location{

    private int x ;
    private int y ; 

    public Location(int x, int y){
        this.x = x;
        this.y = y;
    }


    public int getEleX(){
        return x;
    }

    public int getEleY(){
        return y;
    }

    public void Print(){
        System.out.println(x + " " + y);
    }

}

public class Seven2 {

    
    public static void  main( String [] arg ){

        Seven2 T = new Seven2();
        List<Location> LocationList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);        
        int length  = scanner.nextInt();

        for( int i =0; i<length ; i++ ) LocationList.add(new Location(scanner.nextInt(), scanner.nextInt()));

        Comparator<Location> comparator = new Comparator<Location>() {

            @Override
            public int compare(Location o1, Location o2) {
                
                if(o1.getEleX()==o2.getEleX()){  
                
                    if(o1.getEleY()>o2.getEleY()) return 1;
                    else if(o1.getEleY()==o2.getEleY()) return 0;
                    else return -1;
                
                }else{
                    if(o1.getEleX()>o2.getEleX()) return 1;    
                    else return -1;
                }
                
            }
        };


        Collections.sort(LocationList, comparator);

        for( Location temp : LocationList) temp.Print();

        scanner.close();

    }
}
