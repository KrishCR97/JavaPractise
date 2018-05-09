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
public class BSArrayWithRecursion {

    /**
     * @param args the command line arguments
     */
    public static int findIndex(int[] arr,int left,int right,int mid,int elementToFind){
    
        if(left <= right){
        if(arr[mid] == elementToFind){
        return mid;
        }
        else if (left < right){
        if( elementToFind < arr[mid] ){
            findIndex(arr, left, mid-1, (left + mid -1)/2, elementToFind);
        }
        else if (elementToFind > arr[mid]){
            findIndex(arr, mid + 1, right, (mid + 1 + right)/2, elementToFind);
        }
        }
        }
        return -1;
    }
    
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
        int result = BSArrayWithRecursion.findIndex(arrToSort, 0, arrToSort.length - 1, (0 + arrToSort.length - 1)/2, elementToSearch);
            System.out.println(result);
        }
        catch(NullPointerException npe){
            System.out.println("Cannot create scanner");
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
