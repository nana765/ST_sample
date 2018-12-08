//最大公約数
import java.io.*;
import java.util.Scanner;
class Sample1B{
    
    static int GCD(int a,int b){
        int tmp; 
       if(a<b){
            tmp = a;
            a = b;
            b = tmp;       
        }
        if(b < 1){
            return -1;
        }
        if(a%b == 0){
            return b;
        }
        return GCD(b,a%b);
            }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a,b;
        int ans;
        a=scan.nextInt();
        b=scan.nextInt();
        if((ans=GCD(a,b))>0){
            System.out.println(ans);
        }
        
   }
    
}
