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
public class SelectionSortArray {

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
        for(int index = 0;index<arrToSort.length;index++){
            int minNum = arrToSort[index];
            int inIndex = index;
            System.out.println("Index :"+index);
        for(int innerIndex = index;innerIndex<arrToSort.length;innerIndex++){
            System.out.println("InnerIndex" + innerIndex);
        if(minNum > arrToSort[innerIndex]){
        int num1 = minNum,num2 = arrToSort[innerIndex];
        num1 = num1+num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        arrToSort[index] = num1;
        arrToSort[innerIndex] = num2;
        minNum = num1;
        }
        
        }
        }
        for(int num12 : arrToSort){
            System.out.println(num12+" ");
        }
    }
        catch(NullPointerException npe){
            System.out.println("Cannot create scanner");
     }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
