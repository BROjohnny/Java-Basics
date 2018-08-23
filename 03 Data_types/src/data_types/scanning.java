
package data_types;
import java.util.Scanner;
public class scanning {
    public void method_scan(){
        String name;
        int age;
        double marks;
        char grade;
        Scanner bro = new Scanner(System.in);
        
        System.out.print("type your name : ");
        name =  bro.nextLine();
        System.out.print("type your age : ");
        age =  bro.nextInt();
        System.out.print("type your marks(with desimal points) : ");
        marks =  bro.nextDouble();
        System.out.print("type your grade(Ltter of alphabut) : ");
        grade =  bro.next().charAt(0);
        
        
        System.out.println("Your name is "+name);
        System.out.println("Your age is "+age);
        System.out.println("Your marks is "+marks);
        System.out.println("Your grade is "+grade);
    
}
}

