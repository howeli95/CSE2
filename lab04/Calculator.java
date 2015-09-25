//Yunhao LI
//lab04
//Sept 18, 2015
//CSE 002
//Calculator Program

import java.util.Scanner;

//  define a class
public class Calculator{
    //main method
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //prompt user to input intergers a, b, and operator
        System.out.println("Enter an interger a:");
        int a = scan.nextInt();
        System.out.println("Enter an interger b:");
        int b = scan.nextInt();
        System.out.println("Enter an operator +-*/:");
        String op = scan.next();
        
        //return results in accordance with operator input
        //return illegal operator when operator being neither of +-*/
        switch(op){
            case "+"://check if "+"" is true
            System.out.println(a + b);
            break;//break from this case if this statement is false
            case "-":
            System.out.println(a - b);
            break;
            case "*":
            System.out.println(a * b);
            break;
            case "/":
            System.out.println(a / b);
            break;
            default:
            System.out.print("Illegal operator \n");
            break;
        }
        
    }//end of main method
}//end of class