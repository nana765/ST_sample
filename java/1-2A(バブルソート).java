//バブルソート
import java.io.*;
import java.util.Scanner;

class Sample2A{
   static int bubble_sort(int[] data){
        int i,j;
        int cnt;
        int tmp;
        cnt =0;
        for(i=data.length-1;i>0;i--){
            for(j=0;j<i;j++){
                if(data[j]>data[j+1]){
                    tmp = data[j];
                    data[j]=data[j+1];
                    data[j+1]=tmp;
                    cnt++;
                }else{
                    
                }
            }   
        }    
        return cnt;    
    }
    public static void main(String[] args){
        int n;
        int i,j;
        int a;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int data[]=new int[n];
        for(i=0;i<n;i++){
            data[i] = scan.nextInt();
        }
        a = bubble_sort(data);
               for(i=0;i<n;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("");
        System.out.println(a);
        
    }
}