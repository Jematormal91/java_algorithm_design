/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs_55_assignment.week5;

/**
 *
 * @author Jeanelle Torres 10/18/2021
 */
public class ItemToPurchase {
 
// Private fields  
    private String itemName;
    private String itemDescription;
    private int itemPrice;
    private int itemQuantity;

// string itemDescription - Initialized in default constructor to "none"
    
    public ItemToPurchase(){
        String itemName = "none";
        String itemDescription = "none";
        int itemPrice = 0;
        int itemQuantity = 0;  
    }

/* Parameterized constructor to assign: item name, item description, item price, 
* and item quantity (default values of 0).
*/
    public ItemToPurchase(String name, String description, int price, int quantity){
        itemName = name;
        itemDescription = description;
        itemPrice = price;
        itemQuantity = quantity;
    }

    // setDescription() mutator & getDescription() accessor
    public void setDescription(String description){
        itemDescription = description;
    }
    public String getDescription(){
        return itemDescription;
    }
    
    // getters and setters for name, price and quantity
    public void setName(String name){
        itemName = name;
    }
    public String getName(){
        return itemName;
    }
    
    public void setPrice(int price){
        itemPrice = price;
    }
    public int getPrice(){
        return itemPrice;
    }
    
    public void setQuantity(int quantity){
        itemQuantity = quantity;
    }
    public int getQuantity(){
        return itemQuantity;
    }

    // Outputs the item name followed by the quantity, price, and subtotal
    // i.e. Bottled Water 10 @ $1 = $10
    public void printItemCost(){
        
        int cost = getQuantity() * getPrice();
        System.out.println(getName() + " " + getQuantity() + " @ $" + getPrice() + " = $" + cost);
    }
    // Outputs the item name and description
    //i.e. Bottled Water: Deer Park, 12 oz.
    public void printItemDescription(){
        
        System.out.println(getName() + ": " + getDescription());   
    }
}
