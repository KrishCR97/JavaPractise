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
public class BubbleSortArray {

    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = null;
        int []arrToSort = null;
        System.out.println("Enter the number of ellements to sort :");
        try{
        sc = new Scanner(System.in);
        arrToSort = new int[sc.nextInt()];
        int count = 0;
        
        while(count < arrToSort.length){
        System.out.println("Enter "+(count + 1)+" number");
        arrToSort[count] = sc.nextInt();
        count ++;
        }
        int num = arrToSort.length;
        for(int index = num;num > 0;num--){
        for(int innerCount = 0;innerCount<index-1;innerCount++){
        if(arrToSort[innerCount] > arrToSort[innerCount+1]){
        int num1 = arrToSort[innerCount],num2 = arrToSort[innerCount+1];
        num1 = num1+num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        arrToSort[innerCount] = num1;
        arrToSort[innerCount+1] = num2;
        }
        }
        
        }
        for(int num12 : arrToSort){
            System.out.println(num12+" ");
        }
        
        }
        catch(NullPointerException npe){
            System.out.println("Not able to create scanner");
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        
    }
    
}
