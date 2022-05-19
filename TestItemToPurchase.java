/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs_55_assignment.week5;

import java.util.Scanner;

/**
 *
 * @author Jeanelle Torres 10/18/2021
 */

/* Write a class called TestItemToPurchase. 
 * In the main create a few object of ItemToPurchase 
 * and show  its methods works.
*/
public class TestItemToPurchase {
     
    
    public static void main(String[] args){
         
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter item name: ");
        String itemName = input.nextLine();
  
        System.out.println("Enter item description: ");
        String itemDescription = input.nextLine();
        
        System.out.println("Enter item price: ");
        int itemPrice = input.nextInt();
        
        System.out.println("Enter item quantity: ");
        int itemQuantity = input.nextInt();
        
        ItemToPurchase item = new ItemToPurchase();
        item.setName(itemName);
        item.setDescription(itemDescription);
        item.setPrice(itemPrice);
        item.setQuantity(itemQuantity);
        
        //output of results
        item.printItemDescription();
        item.printItemCost();   
    }
}
        
