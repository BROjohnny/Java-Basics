/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_class;

/**
 *
 * @author dell
 */
public class Java_class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // in this main class we can call all sub classes in this package 
        // if you want call class which outside of package but we should import package before do that
        
        //create object
        NewClass objct = new NewClass();
        
        // call object
        objct.firstmethod();
    }
    
}
