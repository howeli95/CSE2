//linear search
public class nov2{
    
    public static int linSearch(int[] arr, int target, int pos){
        
        if(pos==arr.length){
            return -1;//target no found
        }
        else if(arr[pos] == target){
            return pos;//target found
        }
        else
        return linSearch(arr,target,pos +1);//recursive call
    }
    
    public static void main(String[] args){
        
    /*
    //linear search
    int[] arr = {10,9,8,7,6,5,4,3,2,1};
    for(int i=0;i<arr.length;i++){
        if(arr[i] == 2){
            System.out.println(i);
        }
    }*/
    
    int[] array1 = {2,4,5,6,7,12,15,17};
    System.out.println(linSearch(array1,6,0));
        
    }
}