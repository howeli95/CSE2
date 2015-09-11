public class sept9{
/*    //FIRST WAY
    public static void area(){
        float width = 5;
        float height = 8;
        float area = width * height;
        System.out.println(area);
    }
    public static void main(String [] args){
        area();
    }
    */
    /*
    //SECOND WAY
    public static void area (float width, float height){
        float area = width * height;
        System.out.println(area);
    }
    public static void main(String [] args){
        float width = 5;
        float height = 8;
        area (width, height);
    }
    */
    //THIRD WAY
    public static float area (float l, float w){
        float area = l * w;
        return area;
    }
    public static void main (String [] args){
        float w = 5;
        float l = 8;
        float area = area (w,l);
    }
    
}