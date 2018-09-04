
package breakcontinue;

public class Breakcontinue {

    public static void main(String[] args) {
        int i;
        
        //break statement
         for(i = 1 ; 10 >= i ; ++i){
            System.out.println("this is for loop" + i);
            if(i == 6){
                break;
            }
        }
         
          System.out.println();
         //continue satatement
         for(i = 1 ; 10 >= i ; ++i){
            
            //continue;
           if(i == 6){
            continue;    
            }
           System.out.println("this is for loop" + i); //this statement will not print when i = 6 because of "continue satatment"
        }
         
         
    }
}
    

