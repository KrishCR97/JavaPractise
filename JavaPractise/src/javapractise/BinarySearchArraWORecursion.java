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
public class BinarySearchArraWORecursion {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = null;
        int []arrToSort = null;
        System.out.println("Enter the number of ellements present in an array :");
        try{
        sc = new Scanner(System.in);
        arrToSort = new int[sc.nextInt()];
        int count = 0;
        int elementToSearch;
        
        while(count < arrToSort.length){
        System.out.println("Enter "+(count + 1)+" number");
        arrToSort[count] = sc.nextInt();
        count ++;
        }
        System.out.println("Enter an element to search :");
        elementToSearch = sc.nextInt();
        int left = 0,right = arrToSort.length-1;
        int mid = (left + right)/2;
        for(int index = left;index<=right && right >=0;){
        
        if(arrToSort[mid] == elementToSearch){
            System.out.println("Element found at index : " +mid );
            break;
        }
        else if(elementToSearch < arrToSort[mid]){
        right = mid - 1;
        }
        else if (elementToSearch > arrToSort[mid]){
        left = mid + 1;
        }
        //System.out.println(left);
        mid = (left + right)/2;
        index = left;
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
