
package loops;

public class Loops {

    public static void main(String[] args) {
        
        int x = 0;
        int i;
        
        //while loop
        while(10 > x){
            System.out.println(x);
            ++x; //this means x = x + 1
        }
        
        
        //for loop
        for(i = 1 ; 10 >= i ; ++i){
            System.out.println("this is for loop" + i);
        }
        
         int y = 0;
        //do while loop
        do{
            y++;
            System.out.println("this is do while loop " + y);
        }while(10 > y);
        
    }
    
}
