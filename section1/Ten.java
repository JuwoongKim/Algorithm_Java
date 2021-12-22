package section1;

import java.util.*;

public class Ten {

    
    public int [] solution( String str, String c){

  
        int length = str.length();
        int [] answerList= new int[length];

        Integer index =null;

        while(true){

            if(index==null){

                index = str.indexOf(c);
                answerList[index]=0;
            
                int lfc =1;
                for(int lf =index-1 ; lf>=0 ; lf--, lfc++ ){
                    answerList[lf]=lfc;
                }

                int ric =1;
                for(int ri =index+1; ri<=length-1; ri++, ric ++){
                    answerList[ri]=ric;
                }



            }
            else{

                index = str.indexOf(c,index+1);
                if(index == -1){
                    break;
                }
                else{

                    answerList[index]=0;

                    int lfc =1;
                    for(int lf =index-1 ; lf>=0 ; lf--, lfc++ ){
                        
                        if(answerList[lf]>lfc){
                            answerList[lf]=lfc;
                        }
                        else{
                            break;
                        }
                    }
    
                    int ric =1;
                    for(int ri =index+1; ri<=length-1; ri++, ric ++){
                        
                        if(answerList[ri]>ric){
                            answerList[ri]=ric;
                        }
                        else{
                            break;
                        }

                    }


                }

            }



        }




        return answerList;


    }

    public static void main(String [] arg ){


        Ten T = new Ten();

        Scanner scanner= new Scanner (System.in);

        String str = scanner.next();
        String c = scanner.next();

        int [] answerList = T.solution(str,c);
       
        for (Integer i : answerList){

            System.out.printf(i+" ");
        }
 
        





        /*
        String test = "edfklgjdeljlkje";
        Integer index =null;

        while(true){

            if (index==null){
                index = test.indexOf("e");
                System.out.println(index);
            }
            else{
            
                index = test.indexOf("e", index+1);
            
                if(index ==-1) break;
            
                else{
                    System.out.println(index);
                }
            }

        }
        */


    



     
    }

}
