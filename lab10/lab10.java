//CSE 002
//lab 10
//Oct. 30
//Average(Arrays)

import java.util.Scanner;

public class lab10{
    
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the number of values to be stored: ");
        int n = myScanner.nextInt();
        
        int[] arr;
        arr = new int[n];
        int sum = 0;
        
        for(int i = 0 ;i<=n-1;i++){
            arr[i] = (int)(Math.random() * 100);
            System.out.println(arr[i]);
        }
        
        for(int i = 0 ;i<=n-1;i++){
            sum += arr[i];
        }
        
        double average = sum/n;
        
        System.out.println("Sum is " + sum);
        System.out.println("Average is " + average);
        
        for(int i = 0;i<=n-1;i++){
            
            if(arr[i]>=average){
                System.out.println(arr[i]);
            }
            else{}
            
        }
        
        
    }
}