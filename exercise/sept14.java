import java.util.Scanner;
public class sept14{
    public static void main(String [] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float number = myScanner.nextFloat();
        if ((number = 10) && (number = 11)){
            System.out.print("Your number is either 10 or 11");
        }   else{
            System.out.print("Your number is not smaller than 10");
        }
    }
}