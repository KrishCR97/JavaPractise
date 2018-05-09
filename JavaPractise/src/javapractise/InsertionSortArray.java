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
public class InsertionSortArray {

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
        for(int index = 1;index<arrToSort.length;index++){
        int key = arrToSort[index];
        int keyIndex = index;
            for(int innerIndex = index;innerIndex>=0;innerIndex--){
            if(arrToSort[innerIndex]>key){
            
            int num1 = arrToSort[innerIndex];
            arrToSort[innerIndex] = key;
            arrToSort[keyIndex] = num1;
            keyIndex = innerIndex;
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
