import java.util.Scanner;

public class timeSheets{ //define a class
    public static void main(String[] args){ //define a method
        
        Scanner myScanner = new Scanner(System.in);
        
        double hourlyPay;
        double a;
        double b;
        double c;
        double d;
        double e;
        double totalPay;
        double totalPayroll = 0;
        
        while(true){
            //prompt to enter the hourly pay in units of cents
            System.out.print("Enter a valid hourly pay in cents: ");
            hourlyPay = myScanner.nextDouble();
            
            if(hourlyPay <= 0){ 
            //the system will break and stop asking
            //when input hourly pay is negative
                break;
            }
            //ask to enter number of hours worked on each day of the week
            System.out.print("Enter number of hours worked on Monday: ");
            a = myScanner.nextDouble();
            System.out.print("Enter number of hours worked on Tuesday: ");
            b = myScanner.nextDouble();
            System.out.print("Enter number of hours worked on Wednesday: ");
            c = myScanner.nextDouble();
            System.out.print("Enter number of hours worked on Thursday: ");
            d = myScanner.nextDouble();
            System.out.print("Enter number of hours worked on Friday: ");
            e = myScanner.nextDouble();
            
            //calcualte the pay for this person in a week
            totalPay = (a + b + c + d + e) * hourlyPay / 100;
            //add this person's to the total payroll
            totalPayroll = totalPayroll + totalPay;
            
        }
        //print out the total payroll number
        System.out.println("Total payroll is " + totalPayroll);
        
    }//end of method
}//end of class