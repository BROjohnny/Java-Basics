
package array;

import java.util.Scanner;


public class Array {

   
    public static void main(String[] args) {
        int[] arrayname = new int[10];
        Scanner scnobjt = new Scanner(System.in);
        
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("Enter number for position "+ (i+1) + " ");
            arrayname[i] = scnobjt.nextInt();
           }
        
        for(int i = 0 ; i < 10 ; i++){
            System.out.println(arrayname[i]);
            
            }
    }
    
}
