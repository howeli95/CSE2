//Yunhao LI
//hw03
//Sept 11, 2015
//CSE 002
//Timer Program

import java.util.Scanner;

//  define a class
public class Timer{
    //main method
    public static void main(String[] args){
        //prompt user to imput current time and dinner time
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the current time in form of HHMM: ");
        double currentTime = myScanner.nextDouble();
        System.out.print("Enter the time that you will be eating dinner in form of HHMM: ");
        double dinnerTime = myScanner.nextDouble();

        double hours;
        double minutes;
        //calculate hour part of remaining time
        hours = (int)((dinnerTime - currentTime) / 100);
        //calculate minute part of remaining time
        if (dinnerTime % 100 > currentTime % 100){
            minutes = (dinnerTime % 100) - (currentTime % 100);
        } else{
        minutes = (dinnerTime % 100) + 60 - (currentTime % 100);
        }
        //print out the result
        System.out.println("You have " + (int) hours + " hours and " + (int) minutes + " minutes until dinner");
        
    }//end of method
}//end of class