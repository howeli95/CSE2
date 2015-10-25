public class oct14{
    
    public static void hw(){
        System.out.println("Hello World");
        
    }
    //when the return type is not void, rather is an int, "return" is expected
    public static int add(int a, int b){
        //System.out.println("add = " + (a+b) );
        int c = a+b;
        return c;
    }
    public static boolean isMulti2(int a){
        if (a%2 == 0){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static String hello(String s){
        return "Hello " + s;
        
    }
    public static void main(String[] arugs){
        hw();
        System.out.println(add(1,2));
        System.out.println(isMulti2(3));
        System.out.println(hello("world"));
    }
}