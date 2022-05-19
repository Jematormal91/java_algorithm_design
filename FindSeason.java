/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Jeanelle Torres / CS_55 / Assignment 3
 */
public class FindSeason {
    
    public static void main(String[] args) {
        showSeason();
    }
    
    public static void showSeason() {
        
/** 
* 
Spring: March 20 - June 20
Summer: June 21 - September 21
Autumn: September 22 - December 20
Winter: December 21 - March 19 */
        
        String temp = "";      
        
        while (!temp.equalsIgnoreCase("QUIT")){
            
            Scanner input = new Scanner (System.in);

            String thirtyDayMonths = "April June September November";
        
            String thirtyOneDayMonths = "January March May July August October December";
            
            System.out.println("Enter month and day (or QUIT to exit): ");
            
            temp = input.nextLine();
            
            if (temp.equalsIgnoreCase("QUIT")) {
                break;
            }
            
            String[] date = temp.split(" ");
            
            String month = date[0];
            
            int day = Integer.parseInt(date[1]);
            
                    
            if ((thirtyDayMonths.contains(month) && (day >= 1 && day <= 30)) || (thirtyOneDayMonths.contains(month) && (day >=1 && day <= 31)) || month.equals("February") && (day >= 1 && day <= 28)){

                if ((month.equals("December") && day >= 21) || month.equals("January") || month.equals("February") || (month.equals("March") && day <= 19)){
                    System.out.println("Winter");
                }

                else if ((month.equals("March") && day >= 20) || month.equals("April") || month.equals("May") || (month.equals("June") && day <= 20)){
                    System.out.println("Spring");   
                }  

                else if ((month.equals("June") && day >= 21) || month.equals("July") || month.equals("August") || (month.equals("September") && day <= 21)){
                    System.out.println("Summer");
                }
                else if ((month.equals("September") && day >= 22) || month.equals("October") || month.equals("November") || (month.equals("December") && day <= 20)){
                    System.out.println("Autumn");
                }
            }

            else {
                System.out.println("Invalid");  
            }
        }
    }
}
