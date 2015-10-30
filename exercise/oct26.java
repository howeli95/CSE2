//recursion

public class oct26{
    
    public static int fac(int x){
        
        if(x ==0)
        return 1;
        else
        return x * fac(x-1);
        
    }
    
    public static void main(String[] args){
        System.out.println(fac(5));
    }
    
}