public class homework{
    public static void main(String[] args){
        
        int[] arr1 = new int[20];
        int[] arr2 = new int[20];
        
        for(int i=0;i<=19;i++){
            arr1[i] = (int)(Math.random()*100);
            arr2[i] = (int)(Math.random()*100);
        }

        for(int j=0;j<=19;j++){
            for(int k=0;k<=19;k++){
                if(arr1[j] == arr2[k]){
                    System.out.println(arr1[j]);
                }
            }
        }
        

    }
}