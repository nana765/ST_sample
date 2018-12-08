/*挿入ソート*/
import java.io.*;
import java.util.Scanner;
class Sample1A{
    public static void main(String[] args){
        int n;
        int i,j,k;
        int tmp;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int data[] = new int[n];
          for(i=0;i<n;i++){
                    data[i] = scan.nextInt();
                }

            for(i=1;i<n;i++){
                     tmp = data[i];
                      for( j = i-1 ; j >= 0 && data[j] > tmp ; j-- ){
                                data[j+1] = data[j];
                         }
                     data[j+1] = tmp;
              
                     for(k=0;k<n;k++){
                            System.out.print(data[k]);
                            }
                    System.out.println();
                }
    }
}
           
        
        
        
    
    
    
