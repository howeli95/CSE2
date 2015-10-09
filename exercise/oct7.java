public class oct7{
    public static void main(String[] arugs){
        
        
        /*double sum=0;
        for(int i=1;i<100000;i++){

            if (i%2==0){
                sum += -1/(i*2-1);}
                else {
                    sum += 1/(i*2-1);
                }
            }
        sum *= 4;
        System.out.println(sum);*/
        
        /*double pie=0;
        for(int p=1;p<=50000;p+=4){
            pie += (1/p) - (1/(p+2));
        }
        System.out.println(4*pie);*/
        
        /*int i;
        int j;
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                System.out.print('#');
            }
            System.out.print(' ');
        }*/
        
        int i=1;
        int j=1;
        System.out.println("1 2 3 4 5 6 7 8 9");
        for(i=1;i<10;i++){
            System.out.print(i+"1");
            for(j=1;j<10;j++){
                int k = j* i;
                System.out.print(k+" ");
            }
            System.out.println(" ");
        }
        
    }
}