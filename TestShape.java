

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jeanelle Torres 11/18/2021
 */

public class TestShape{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        ArrayList <Shape> shapes = new ArrayList<>();
        boolean loop = true;
        
        while(loop){
            System.out.println("Menu:\n" + "1: Create Rectangle\n" + "2: Create Square\n" + "3: Create Circle\n" + "4: Print Created Shapes\n" + "5: Exit");
            int choice = input.nextInt();
            
            switch(choice){
                case 1: Rectangle rect = new Rectangle();
                System.out.println("Enter length: ");
                double length = input.nextDouble();
                rect.setLength(length);
                System.out.println("Enter width: ");
                double width = input.nextDouble();
                rect.setWidth(width);
                shapes.add(rect);
                break;
                
                case 2: Square sq = new Square();
                System.out.println("Enter length of side: ");
                double side = input.nextDouble();
                sq.setSide(side);
                shapes.add(sq);
                break;
                
                case 3: Circle c = new Circle();
                System.out.println("Enter radius: ");
                double radius = input.nextDouble();
                c.setRadius(radius);
                shapes.add(c);
                break;
                
                case 4: 
                if (shapes.isEmpty()){
                System.out.println("No shapes created.\n");
                }
                else { 
                shapes.forEach(s -> {
                System.out.println(s.output());      
                });
                }
                break;
                
                case 5: loop = false;
                        break;

                default: System.out.println("Invalid entry.\n");
                break;
                  
            }
            
        }
    }
}

class Shape {
    public Shape(){
    }
    public double area(){
        return 0.0;
    }
    public String output(){
        return "none";
    }
}

class Rectangle extends Shape{
    private double length,width;
    
    public Rectangle(){
    }
    
    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    
    public void setLength(double length){
        this.length = length;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getLength(){
        return this.length;
    }
    
    public double getWidth(){
        return this.width;
    }
    
    @Override
    public double area(){
        return getLength() * getWidth();
    }
    
    @Override
    public String output(){
        return ("The area of the Rectangle = " + Double.toString(area())+"\n");
    }
}

class Square extends Shape{
    private double side;
    
    public Square(){
    }
    
    public Square(double side){
        this.side = side;
    }
    
    public void setSide(double side){
        this.side = side;
    }
    
    public double getSide(){
        return this.side;
    }
    
    @Override
    public double area(){
        return Math.pow(getSide(),2);
    }
    
    @Override
    public String output(){
        return ("The area of the Square = " + Double.toString(area()) + "\n");
    }
}

class Circle extends Shape{
    
    private double radius;
    
    public Circle(){
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    @Override
    public double area(){
        return 3.14 * Math.pow(getRadius(), 2);
    }
    
    @Override
    public String output(){
        return ("The area of the Circle = " + Double.toString(area()) + "\n");
    }
}

