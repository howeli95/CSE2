import java.util.Scanner;

public class lab08{
    public static double mean(double x){
        return x/10;
        
    }
    
    public static double median(int y, int z){
        return (y+z)/2.0;
    }
    
    public static void main(String[] arug){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Input ten numbers: ");
        int m=0;
        int n=0;
        double c = 0;
        for(int a=1;a<=10;a++){
            int b = myScanner.nextInt();
            c += b;
            if(a==5){
                m=b;
            }
            if(a==6){
                n=b;
            }
        }
        System.out.println(mean(c));
        System.out.println(median(m,n));
    }
}
