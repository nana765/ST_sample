//素数
import java.io.*;
import java.util.Scanner;

class Sample1C{
    public static int isPrime(int x){
        int i;
        if(x<=1){
            return 0;
        }else{
            for(i=2;i<x-1;i++){
                if(x%i==0){
                    return 0;
                }
            }
        }
        return 1;
        
    }
    
    public static void main(String[] args){ 
        int n;
        int i;
        int cnt,a;
        Scanner scan = new Scanner(System.in);
         n = scan.nextInt();
         int data[]= new int[n];
         cnt=0;
         for(i=0;i<n;i++){
            data[i]=scan.nextInt();
            a=isPrime(data[i]);
            if(a==1){
                cnt++;
            }
         }    
         System.out.println(cnt); 
    }
    
    
}