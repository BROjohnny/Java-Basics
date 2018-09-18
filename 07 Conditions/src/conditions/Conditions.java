
package conditions;


public class Conditions {

    
    public static void main(String[] args) {
      int no1 = 10;
      int no2 = 23;
      
      //if statement
      if (no2 > no1){
          System.out.println("ohh shit no1 grater than no2");
      }
      
      //if else statement
      if (no1 > no2){
          System.out.println("ohh shit no1 grater than no2");
      }
      else{
          System.out.println("ohh shit no2 grater than no1");
      }
      
      
      //elseeif statement
      if (no1 > no2){
          System.out.println("ohh shit no1 grater than no2");
      }
      else if(no1 == no2){
          System.out.println("ohh shit no2 & no1 equal");
      }
      else if(no1 != no2){
          System.out.println("ohh shit no2 & no1 not equal");
      }
      else{
          System.out.println("whta kind of numbers are these");
      }
      
      
      //switch
      switch(no1){
          case 2 : System.out.println("ohh shit no1 grater than 2");break;
          case 10 : System.out.println("ohh shit no1 equal to 10");break;
          case 24 : System.out.println("ohh shit no1 less than 24");break;
          default : System.out.println("what kind of number is that");
          
      }
      
   }
 }