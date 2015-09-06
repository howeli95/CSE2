//  define a class
public class sept2b{
    
//add main method
    public static void main(String[] args) {
    
    float principle = 150;
    //with decimal places, add f to the end of number for float
    //no need for double in this case however
    float rate = 0.075f;
    float interest = principle * rate;
    //(int) only gives the integral part, (round) gives rounded number
    float result = principle + (int)interest;
    System.out.println ( "balance with interest is " +  result );
    }
}