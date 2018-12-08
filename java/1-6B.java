import java.util.Scanner;
import java.io.*;
class Sample6B{
	public static void main(String[] args)throws IOException{
		int n;//枚数
		int cnt,cnt1;
		int moji;
		int a;
		int S[] = new int[13];
	    int H[] = new int[13];
		int C[] = new int[13];
		int D[] = new int[13];
		
		
		for(cnt=0;cnt<13;cnt++){
			S[cnt]=0;
			H[cnt]=0;
			C[cnt]=0;
			D[cnt]=0;	
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("持ってるカードの枚数と種類を入力してください");
		n = scan.nextInt();
		
		for( cnt1 = 1 ; cnt1 <= n; cnt1++ ){
		 moji=System.in.read();
		 a = scan.nextInt();
		 
		   if((char)moji=='S'){
		 		 for(cnt=0;cnt<13;cnt++){
		 		 	if(cnt == a){
		 		 		S[cnt] = 1;
		 		 		}
		 			 }
		 		 }else if((char)moji == 'H'){
		 			 for(cnt=0;cnt<13;cnt++){
		 		 		if(cnt+1 == a){
		 		 			H[cnt] = 1;
		 		 		}
					}	
				}else if((char)moji == 'C'){
		 		 	 for(cnt=0;cnt<13;cnt++){
		 		 		if(cnt+1 == a){
		 		 			C[cnt] = 1;
		 		 		}		 		 
				 }
			}else if((char)moji == 'D'){
					for(cnt=0;cnt<13;cnt++){
		 		 			if(cnt+1 == a){
		 		 				D[cnt] = 1;
		 		 			}	
				}
			}		 
		
		 }
		for(cnt=0;cnt<13;cnt++){
			if(S[cnt]==0){
		System.out.print('S'+" ");		
		 System.out.println(cnt+1);
			}
		}
		for(cnt=0;cnt<13;cnt++){
			if(H[cnt]==0){
		System.out.print('H'+" ");		
		 System.out.println(cnt+1);
			}
		}		 
		for(cnt=0;cnt<13;cnt++){
			if(S[cnt]==0){
		System.out.print('C'+" ");		
		 System.out.println(cnt+1);
				}
		}	 
		for(cnt=0;cnt<13;cnt++){
			if(S[cnt]==0){
		System.out.print('D'+" ");		
		 System.out.println(cnt+1);
			}
			}	 
			
	}
	
}