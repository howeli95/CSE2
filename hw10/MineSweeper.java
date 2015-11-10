import java.util.*;

public class MineSweeper{
    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a number N between 2 and 30: ");
        int n = myScanner.nextInt();
        
        char [][] arr = new char [n][n];
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = '0';
            }
        }
        System.out.print("Enter number of bombs: ");
        int numBomb = myScanner.nextInt();
        int x,y,i=0;
        
        
       for(;i<numBomb;i++){
            x = (int) (Math.random()*n);
            y = (int) (Math.random()*n);
            
            while(arr[x][y]==('M')){
                x = (int) (Math.random()*n);
                y = (int) (Math.random()*n);
            }
           arr[x][y]='M';
       }
         
        /*for(int a = 0;a<=n-1;a++){
            for (int b=0;b<=n-1;b++){
                if(arr[a][b] == 'M'){
                    if(a==0 && b==0){
                        arr[a+1][b] += 1;
                        arr[a][b+1] += 1;
                        arr[a+1][b+1] += 1;
                    }
                    else if(a==0 && b==n-1){
                        arr[a+1][b] += 1;
                        arr[a+1][b-1] += 1;
                        arr[a][b-1] += 1;
                    }
                    else if(a==n-1 && b==n-1){
                        arr[a-1][b] += 1;
                        arr[a-1][b-1] += 1;
                        arr[a][b-1] += 1;
                    }
                    else if(a==n-1 && b==0){
                        arr[a-1][b] += 1;
                        arr[a-1][b+1] += 1;
                        arr[a][b+1] += 1;
                    }
                    else if(a==0 && b!=0 && b!= n-1){
                        arr[a+1][b] += 1;
                        arr[a+1][b-1] += 1;
                        arr[a+1][b+1] += 1;
                        arr[a][b-1] += 1;
                        arr[a][b+1] += 1;
                    }
                    else if(b==0 && a!=0 && a!= n-1){
                        arr[a-1][b] += 1;
                        arr[a+1][b] += 1;
                        arr[a][b+1] += 1;
                        arr[a-1][b+1] += 1;
                        arr[a+1][b+1] += 1;
                    }
                    else if(a==n-1 && b!=0 && b!= n-1){
                        arr[a][b+1] += 1;
                        arr[a][b-1] += 1;
                        arr[a-1][b] += 1;
                        arr[a-1][b-1] += 1;
                        arr[a-1][b+1] += 1;
                    }
                    else if(b==n-1 && a!=0 && a!= n-1){
                        arr[a-1][b] += 1;
                        arr[a+1][b] += 1;
                        arr[a][b-1] += 1;
                        arr[a-1][b-1] += 1;
                        arr[a+1][b-1] += 1;
                    }
                    else{
                        arr[a-1][b-1] += 1;
                        arr[a-1][b] += 1;
                        arr[a-1][b+1] += 1;
                        arr[a][b-1] += 1;
                        arr[a][b+1] += 1;
                        arr[a+1][b-1] += 1;
                        arr[a+1][b] += 1;
                        arr[a+1][b+1] += 1;
                    }
                }
                if(arr[a][b] != 'M' && arr[a][b] != '0'){
                    arr[a][b] +=1;
                }
            }
        }*/
        
        for(int a = 0;a<arr.length;a++){
            for (int b=0;b<arr[a].length;b++){
                if(arr[a][b]=='M'){
                    if(a-1>=0&&b-1>=0&&arr[a-1][b-1]!='M') arr[a-1][b-1]+=1;
                    if(a-1>=0&&/*b-1>=0&&*/arr[a-1][b]!='M') arr[a-1][b]+=1;
                    if(a-1>=0&&b+1<=n-1&&arr[a-1][b+1]!='M') arr[a-1][b+1]+=1;
                    if(/*a-1>=0&&*/b-1>=0&&arr[a][b-1]!='M') arr[a][b-1]+=1;
                    if(/*a-1>=0&&*/b+1<=n-1&&arr[a][b+1]!='M') arr[a][b+1]+=1;
                    if(a+1<=n-1&&b-1>=0&&arr[a+1][b-1]!='M') arr[a+1][b-1]+=1;
                    if(a+1<=n-1/*&&b-1>=0*/&&arr[a+1][b]!='M') arr[a+1][b]+=1;
                    if(a+1<=n-1&&b+1<=n-1&&arr[a+1][b+1]!='M') arr[a+1][b+1]+=1;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}