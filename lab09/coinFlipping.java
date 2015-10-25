import java.util.Scanner;
import java.util.Random;

public class coinFlipping{
    
    public static int flip(int x){
        int b;
        int m=0;
        int n=0;
        for(int i=0;i<x;i++){
            
            int a = (int) (Math.random() + 0.5);
        
            if(a==0){
                b = 1;
            }
            else{
                b = 0;
            }
            m += a;
            n += b;
        }
        
        return m;
        return n;
        
    }
    
    public static void flip(){
        
        System.out.println(flip(5));
        
        
    }
    
    public static void main(String[] arug){
        /*Scanner myScanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int x = myScanner.nextInt();*/
        flip();
        
    }
    
}