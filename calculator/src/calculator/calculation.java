/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author dell
 */
public class calculation {
    public double selecting(char par,double no1,double no2){
		double poop = 1;
		//System.out.println(par);
		//System.out.println(no2);
		//System.out.println(no1);
		if(par == '+')
			poop = no1 +no2;
		else if(par == '-')
			poop = no1-no2;
		else if(par == '/')
			poop = no1/no2;
		else if(par == '*')
			poop = no1*no2;
		else if(par == '%')
			poop = no1%no2;
		
		return poop;
	}
}
