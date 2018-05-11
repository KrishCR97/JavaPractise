/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractise;

import java.util.Arrays;

/**
 *
 * @author GameS
 */

public class RemoveDuplicatesInArray {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        String word = "aaartuuiweeaa";
        char[] ch = word.toCharArray();
        Arrays.sort(ch);
        int counter = 0;
        //System.out.println(ch.length);
        for(int index = 0; index < ch.length - 1; index++){
            
            if(ch[index] != ch[index+1]){
               // System.out.println(ch[index]);
            ch[counter] = ch[index+1];
            counter++;
            }
  
            
        }
        for(int index = 0; index< counter;index++){
            System.out.println(ch[index]);
        }
        
    }
    
}
