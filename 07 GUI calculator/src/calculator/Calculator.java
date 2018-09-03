/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n1,n2,outpt;
		char asw = 'p',para;
		int[] array = new int[5];
		Scanner found = new Scanner(System.in);
		calculation methd = new calculation();
		System.out.println("Enter first number :");
		n1 = found.nextDouble();
	array[0] = 100;
		while(asw != 'y')
		{
			System.out.println("Enter next number :");
			n2 = found.nextDouble();
			System.out.println("Enter parameter to solve \\ ");
			//found.nextCharacter();
			para =  found.next().charAt(0);
			outpt = methd.selecting(para,n1,n2);
			System.out.println(outpt);
			System.out.println("if you wanna Exit from calculation press 'y' ");
			asw = found.next().charAt(0);
		}
    }
    
}


