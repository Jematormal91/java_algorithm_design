/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;


/**
 *
 * @author jematormal91
 */
public class FormatName {

    public static void main(String[] args) {
        
    showNames();

    }
    public static void showNames() {
            Scanner input = new Scanner (System.in);
    System.out.println("Enter your first name, middle name(if any), and last name"+
            "\n(separated by at least one space): ");
    
    //create input and remove leading spaces from first name
    String name = input.nextLine().trim();
    
    int space = name.indexOf(" ");
    
    String firstName = name.substring(0,space);
    
    // create substring without first name and remove any leading spaces from substring
    
    String substringName = name.substring(space+1, name.length()).trim();
    
    // if another space present (>= 0), then there is a middle name, if not skip to last name
    
    if (substringName.indexOf(" ") >= 0) {
        int space2= substringName.indexOf(" ");
        String middleName = substringName.substring(0,space2);
        // define last name and remove any leading spaces
        String lastName = substringName.substring(space2+1, substringName.length()).trim();
         System.out.println(lastName+", "+firstName.charAt(0)+"."+middleName.charAt(0)+".");
        }
    
    else {
        String lastName = substringName;
         System.out.println(lastName+", "+firstName.charAt(0)+".");
        }
    }
}
