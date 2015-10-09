//Yunhao Li
//Oct. 3, 2015
//CSE 002
//HW 06 - pyramid program

import java.util.Scanner;

public class pyramid{ //define a class
    public static void main(String[] arug){ //define a method
        Scanner myScanner = new Scanner(System.in);
        //ask user to enter size of the pyramid
        System.out.print("What size pyramid? ");
        double s = myScanner.nextDouble();
        
        for(int a=0;a<s;a++){
            for(int b=0; b<=s-a;b++){
                System.out.print(" ");
            }
            for (double c=0;c<=a;c+=0.5){
                System.out.print("*");
            }
        System.out.println();
        }
        
    }//end of the method
}//end of the class