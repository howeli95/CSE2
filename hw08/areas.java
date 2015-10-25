//Yunhao Li
//Oct. 25, 2015
//CSE 002
//HW 08 - areas program - overloading

import java.util.Scanner;

public class areas{
    //overloading, three methods with same name area()
    //that has different number of parameters
    public static double area(double x){
        return 3.14 * Math.pow(x,2.0);
    }
    public static int area(int x, int y){
        return x*y;
    }
    public static int area(int x, int y, int z){
        return (y+z)*x/2;
    }
    public static void main(String [] arugs){
        Scanner myScanner = new Scanner(System.in);
        
        while(true){
            //ask user to input number for shapes and parameters, 0 to stop the program
            System.out.println("Enter 1 for circle, 2 for rectangle, 3 for trapezoid, 0 to stop: ");
            int a = myScanner.nextInt();
            if(a == 1){
                System.out.println("Enter radius: ");
                int b = myScanner.nextInt();
                System.out.println("The area is: " + area(b));
            }
            if(a == 2){
                System.out.println("Enter length: ");
                int c = myScanner.nextInt();
                System.out.println("Enter width: ");
                int d = myScanner.nextInt();
                System.out.println("The area is: " + area(c,d));
            }
            if(a == 3){
                System.out.println("Enter height: ");
                int e = myScanner.nextInt();
                System.out.println("Enter base 1: ");
                int f = myScanner.nextInt();
                System.out.println("Enter base 2: ");
                int g = myScanner.nextInt();
                System.out.println("The area is: " + area(e,f,g));
            }
            //enter 0 to exit the loop
            if (a == 0){
                break;
            }
            //otherwise, continue prompting user to input numbers
            else{
                continue;
            }
        }
    }
}