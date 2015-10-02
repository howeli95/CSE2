//Yunhao LI
//hw05
//Sept 27, 2015
//CSE 002
//averageGrade Program

import java.util.Scanner;

//  define a class
public class averageGrade{
    //main method
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        //initiate all the variables
        double totalGrade = 0;
        double counts = 0;
        double grade = 0;
        double avgGrade = 0;
        //keep the loop running until indicate otherwise
        while(true){
            //prompt user to enter a grade
            System.out.print("Enter a valid grade: ");
            grade = myScanner.nextDouble();
            //if input is 999, out of the loop and print out the average score
            if (grade == 999){
                System.out.println("Average grades is " + avgGrade);
                break;
                }
                //inform user if input score is invalid
            if (grade <0 || grade >100){
                System.out.print("Please enter a valid grade.\n");
                continue;
                }
            //calculate total grades, total counts and average grades
            totalGrade = totalGrade + grade;
            counts += 1;
            avgGrade = totalGrade / counts;
            
        }
    }//end of method
}//end of class