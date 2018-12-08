import java.io.*;
import java.util.Scanner;
class Sample8B{
	public static void main(String[] args) throws IOException{
		int x;
		int sum,i,j;
		int a,b,c,d;
		int ans[]=new int[100];
		j=0;
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		while(x!=0){
			a = x/1000;
			b = (x%1000)/100;		
			c =((x%1000)%100)/10;
			d =((x%1000)%100)%10	;	
			ans[j] = a+b+c+d;
			j++;
			x=scan.nextInt();
		}
		for( i = 0 ; i < j ; i++ ){
			System.out.println(ans[i]);
		}
			
	}
}