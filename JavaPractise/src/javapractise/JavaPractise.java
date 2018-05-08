/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractise;

import java.util.Scanner;

/**
 *
 * @author GameS
 */
public class JavaPractise {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Hello");
        
        Scanner sc = null;
        int range = 0;
        //while(true){
        try{
        sc = new Scanner(System.in);
        System.out.println("What");
        String input = sc.next();
        range = Integer.parseInt(input);
        int num1 = 0;
        int num2 = 1;
        int result = 0;
        
        
        if(range == 1){
        System.out.print("0");
        }
        else if(range == 2){
        System.out.print("0 1");
        //break;
        }
        else if(range <0){
        throw new Exception();
        }
        else{
        System.out.print("0 1");
        range = range - 2;
        while(range != 0){
        result = num1 + num2;
        System.out.print(" "+result);
        num1 = num2;
        num2 = result;
        range--;
        }
        //break;
        }
        }
        
        catch(NumberFormatException nfe){
            System.out.println("Enter a valid number");
        }
        catch(Exception ex){
            System.out.println("Enter a valid range");
        }
        finally{
        sc.close();
        }
   // }
    }
    
}
