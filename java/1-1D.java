import java.io.*;
import java.util.Scanner;
class Sample1D{
	public static void main(String[] args){
		int n ;//整数n
		int i,j;
		int max,minus;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int r[] = new int[n];
		for(i=0;i<n;i++){
			r[i]=scan.nextInt();
		}
		max = r[1]-r[0];
	
		 for(i=1;i<n;i++){
		 	for(j=0;j<i;j++){
							minus = r[i]-r[j];
				if(max<minus){
							max = minus;
				}
			}
		}
		System.out.println(max);
		
	}
}
	