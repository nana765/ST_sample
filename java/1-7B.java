import java.io.*;
import java.util.Scanner;
class Sample7B{
	public static void main(String[] args) throws IOException{
		int n,x;
		int i,j,k,l;
		int cnt;
		int data[]=new int[100];
		int ans[]=new int[100];
		//入力
		Scanner scan = new Scanner(System.in);
		 n = scan.nextInt();
		 x = scan.nextInt();
		 l=0;
		 while(n!=0&&x!=0){
		 	for(i=0;i<n;i++){
		 		data[i]=i+1;
		 	}
		 	//dataから３つを選び合計がｘになるものを探す
		 	cnt=0;
		 	for(i=0;i<n;i++){
		 		for(j=i+1;j<n;j++){
		 			for(k=j+1;k<n;k++){
		 				if(data[i]+data[j]+data[k]==x){
		 					cnt++;
		 				}
		 			}
		 		}
		 	}
		 	ans[l]=cnt;
		 	n = scan.nextInt();
		 	x = scan.nextInt();
		 	l++;
		 }
		 	
		 //出力
		 for(i=0;i<l;i++){
		 	System.out.println(ans[i]);
		}	
		
	}
}