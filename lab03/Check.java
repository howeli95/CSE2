//Yunhao LI
//lab03
//Sept 11, 2015
//CSE 002
//Check Program

import java.util.Scanner;

//  define a class
public class Check{
    //main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in);
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        double checkCost = myScanner.nextDouble();
        //prompt user for tip percentage
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
        double tipPercent = myScanner.nextDouble();
        tipPercent /= 100; //convert percentage into a decimal value
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt();
        
        double totalCost;
        double costPerPerson;
        int dollars; //whole dollar amount of cost
        int dimes;//for storing digits
        int pennies;//to the right of the decimal point for the cost$
        totalCost = checkCost * (1 + tipPercent);
        costPerPerson = totalCost / numPeople;
        //get the whole amount, dropping decimal fraction
        dollars = (int) costPerPerson;
        //get dimes amount
        //(int) (6.73 * 10) % 10 -> 67 % 10 -> 7
        //the % (mod) operator returns the remainder after division
        dimes = (int) (costPerPerson * 10) % 10;
        pennies = (int) (costPerPerson * 100) % 100;
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
        
        
    }//end of main method
}//end of class