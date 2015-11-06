import java.util.Arrays;

public class lab11{
    public static void main(String[] args){
        
        int[] array1 = new int[20];
        
        for(int i=0;i<=19;i++){
            array1[i] = (int)(Math.random()*100);
        }
        sort(array1);
        
        int[] array2 = new int[10];
        for(int j=0;j<=9;j++){
            array2[j] = (int)(Math.random()*100);
        }
        sort(array2);
        
        int[] array3 = new int[30];
        for(int k=0;k<=19;k++){
            array3[k] = array1[k];
        }
        for(int k=20;k<=29;k++){
            array3[k] = array2[k-20];
        }
        sort(array3);
        
    }
    
    public static void sort(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}