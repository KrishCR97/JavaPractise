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
public class LinerarSearchArray {

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
            for(int index = 0; index<arrToSort.length; index++){
            if(arrToSort[index] == elementToSearch){
                System.out.println("Element found at index : " + index);
                break;
            }
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
