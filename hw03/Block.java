//Yunhao LI
//hw03
//Sept 12, 2015
//CSE 002
//Block Program

import java.util.Scanner;

//  define a class
public class Block{
    //main method
    public static void main(String[] args){
         //prompt user to imput current length, width, and height 
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the length of the block: ");
        double length = myScanner.nextDouble();
        System.out.print("Enter the width of the block: ");
        double width = myScanner.nextDouble();
        System.out.print("Enter the height of the block: ");
        double height = myScanner.nextDouble();
        
        //define volume and area
        double volume;
        double area;
        
        volume = length * width * height;//calculate volume
        area = 2 * (length * width + length * height + width * height);//calculate area
        
        //print out results
        System.out.printf("The volume of the block is %6.2f\n" ,volume);
        System.out.printf("The surface area of the block is %6.2f\n" ,area);
    }//end of method
}//end of class