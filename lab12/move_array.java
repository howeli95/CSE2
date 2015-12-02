import java.util.*;
import java.lang.*;

public class move_array{
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Input a number for the size of the array: ");
        int size = myScanner.nextInt();
        int[] arr = null; 
        try{
           arr = new int[size];
        }
        catch(Exception e){
            System.out.println("Number entered was not greater than 0");
            System.exit(1);
        }
        
        for(int i=0;i<arr.length;i++){
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
        
        System.out.println("Enter an index number: ");
        int index = myScanner.nextInt();
        
        int last = arr[index];
        try{
            for(int i=index;i<arr.length-1;i++){
                arr[i] = arr[i+1];
                
            }
            arr[arr.length-1] = last;
        }
        catch(Exception e){
            System.out.println("Number entered was wrong");
            System.exit(1);
        }
        
        System.out.println(Arrays.toString(arr));
        
    }
}