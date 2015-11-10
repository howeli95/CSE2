//package exception;
import java.util.Scanner;

public class nov9{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        //int a = scan.nextInt();
        int b;
        /*try{
            b = (int) 10/a;
        }
        catch(Exception a){
            System.out.println("You entered zero");
            b = (int)10/2;
        }
        System.out.println("b= " + b);*/
        
        int[] c = new int[10];
        for(int i=0;i<10;i++){
            c[1] = 1*2;
        }
        int a = scan.nextInt();
        System.out.println("the value at position" + a + "=" + c[a]);
        
    }
}