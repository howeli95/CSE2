public class homework{
    public static double multiply(double a, double b){
        double output = a*b;
        return output;
    }
   public static double multiply(int a, double b){
        double output = a*b*2;
        return output;
    }
    public static void main(String[] args){
        int x=4, y=5;
        double z = multiply(x,y);
        System.out.println(z);
    }
}