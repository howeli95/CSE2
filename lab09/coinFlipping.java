import java.util.Scanner;
import java.util.Random;

public class coinFlipping{
    
    public static int flip(){
        
        int head=0;
        int tail=0;
        
        int a = (int) (Math.random() + 0.5);
        
        if(a==0){
            head++;
        }
        else{
            tail++;
        }
        return head;
    }
    
    public static void flip(int times){
        int head = 0;
        for(int i=0;i<times;i++){
            head += flip();
        }
        System.out.println("Number of head is " + head);
        System.out.println("Number of tail is " + (times-head));
    }
    
    public static void main(String[] arug){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int x = myScanner.nextInt();
        if(x == 0){
            flip();
        }
        else if(x > 100){
            System.out.println("End the program.");
        }
        else{
            flip(x);
        }
        
    }
    
}