// two dimensional array

public class nov4{
    public static void main(String[] args){
        
        /*int [][] arr;
        arr = new int[5][5];
        
        for(int i = 0; i<=4; i++){
            for(int j = 0; j<=4; j++){
                if((i+j)%2 ==0){
                    arr[i][j] = i+j;
                }
                else{
                    arr[i][j] = -1;
                }
                System.out.print(arr[i][j]+ "\t");
            }
            System.out.println(" ");
        }*/
        
        //place 3 bombs
        String[][] arr;
        arr = new String[5][5];
        for(int i = 0; i<=4; i++){
            for(int j = 0; j<=4; j++){
                arr[i][j] = "o";
            }
        }
        int numBomb = 0;
        while(numBomb < 3){
            int x = (int) Math.random()*5;
            int y = (int) Math.random()*5;
            
            if(arr[x][y].equals("M")){
                arr[x][y]="M";
                numBomb += 1;
            }
        }
    }
}