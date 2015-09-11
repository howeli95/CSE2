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
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the current time in form of HHMM: ");
        double currentTime = myScanner.nextDouble();
        //prompt user for tip percentage
        System.out.print("Enter the time that you will be eating dinner in form of HHMM: ");
        double dinnerTime = myScanner.nextDouble();

        int hours;
        int minutes;
        hours = (int)((dinnerTime - currentTime) / 100);
        System.out.println(hours);
        
    }//end of method
}//end of class