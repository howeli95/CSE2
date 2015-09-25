//Yunhao LI
//lab05
//Sept 25, 2015
//CSE 002
//CalculatorSpecial Program

import java.util.Scanner;

//  define a class
public class CalculatorSpecial{
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
        //type n or N to stop
        System.out.println("Type n or N to stop: ");
        String stop=scan.next();
        
        //return results in accordance with operator input
        //return illegal operator when operator being neither of +-*/
        //while it is not n nor N, proceed
        while (!stop.equals("n") && !stop.equals("N")){
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
         System.out.println("Type n or N to stop: ");
          stop = scan.next();
          if(stop.equals("n") || stop.equals("N")) break;
        
          System.out.println("Enter an interger a:");
        a = scan.nextInt();
        System.out.println("Enter an interger b:");
        b = scan.nextInt();
        System.out.println("Enter an operator +-*/:");
        op = scan.next();
        
         
        }
        
    }//end of main method
}//end of class