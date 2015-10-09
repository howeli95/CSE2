//Yunhao Li
//lab07
//Oct. 9, 2015
//CSE 002
//encrypted_x Program

import java.util.Scanner;

public class encrypted_x{ //a new class
    public static void main(String[] arugs){ //a new method
        Scanner myScanner = new Scanner(System.in);
        //ask user to input the size of the square
        System.out.print("Enter the size of the square: ");
        int x = myScanner.nextInt();
        
        //first two for loops are to print a square x by x
        for(int i=0;i<=x;i++){
            for(int j=0;j<=x;j++){
                //if statement is to print a space for encrpyted x
                if(j==i||j==x-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                
            }
            //print out the shape
            System.out.println();
        }
        
    }//end of the method
}//end of the class