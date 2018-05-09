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
public class CheckPrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = null;
        try{
        sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factCount = 0;
        for(int count = 1;count <= num;count++){
        if(factCount>2){
            System.out.println("Given number is not a prime number");
            break;
        }
        if(num%count == 0){
        factCount++;    
        }
        }
        
        
        }
        catch(NullPointerException npe){
            System.out.println("Not able to create scanner object");
        }
        catch(NumberFormatException nfe){
            System.out.println("Invalid number");
        }
        
    }
    
}
