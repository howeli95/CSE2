/*
overload(method)
1. different type
void method1(int x)
void method1(float x)
2. number of parameters
void method1(int x)
void method1(int x, int y)
3. 
void method1(intx, boolean bol)
void method1(boolean bol, int x)
*/

public class oct21{
    
    public static void overload1(int x){
        System.out.println("x = "+ x);
    }
    
    public static void overload1(double x){
        System.out.println("x = "+ x);
    }
    
    public static void overload3(int x, boolean y){
        System.out.println("x = "+ x + "," + "y = "+ y);
    }
    
    public static void overload3(boolean x, int y){
        System.out.println("x = "+ x + "," + "y = "+ y);
    }
    
    public static void main(String[] args){
        
        overload3(5, false);
        overload3(true, 10);
    }
    
}