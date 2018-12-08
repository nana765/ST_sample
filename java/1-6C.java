import java.util.Scanner;
import java.io.*;
class Sample6C{
	public static void main(String[] args) throws IOException{
		int n;  //情報の件数
		int i;
		//b棟f階のr番目の部屋にv人が追加入居した
		int b;
		int f;
		int r;
		int v;
		//出力の配列
		int ans1[][] = new int[3][10];//1棟[３階分][10部屋分]
		int ans2[][] = new int[3][10];//2棟
		int ans3[][] = new int[3][10];//3棟
		int ans4[][] = new int[3][10];//4棟
		
		Scanner scan =new Scanner(System.in);
		System.out.println("情報の件数を入力してください");
		n = scan.nextInt(); //入力
			
		//出力の配列の初期化
		for( i=0;i<3;i++){
			for(int j=0;j<10;j++){
				ans1[i][j] = 0;
				ans2[i][j] = 0;
				ans3[i][j] = 0;
				ans4[i][j] = 0;
				}
			}
		//情報の入力＋出力の配列に格納	
		for(i=0;i<n;i++){
			b = scan.nextInt();
			f = scan.nextInt();//階
			r = scan.nextInt();//番目
			v = scan.nextInt();
				if(b==1){
					ans1[f-1][r-1] = v;			
				}else if(b==2){
					ans2[f-1][r-1] = v;	
				}else if(b==3){
					ans3[f-1][r-1] = v;	
				}else if(b==4){
					ans4[f-1][r-1] = v;	
				}
			}		
		//出力1棟
		for(i=0;i<3;i++){
			for(int j=0;j<10;j++){
				System.out.print(" ");
				System.out.print(ans1[i][j]);
				}
			System.out.println();	
		}
		for(int cnt=1;cnt<=20;cnt++){
			System.out.print('#');
		}	
		System.out.println();		
		//出力２棟
		for(i=0;i<3;i++){
			for(int j=0;j<10;j++){
				System.out.print(" ");
				System.out.print(ans2[i][j]);
				}
			System.out.println();	
			}
		for(int cnt=1;cnt<=20;cnt++){
			System.out.print('#');
		}	
		System.out.println();		
		//出力３棟
		for(i=0;i<3;i++){
			for(int j=0;j<10;j++){
				System.out.print(" ");
				System.out.print(ans3[i][j]);
			}
			System.out.println();	
		}
		for(int cnt=1;cnt<=20;cnt++){
			System.out.print('#');
		}	
		System.out.println();
		//出力４棟
		for(i=0;i<3;i++){
			for(int j=0;j<10;j++){
				System.out.print(" ");
				System.out.print(ans4[i][j]);
			}
			System.out.println();	
		}		
	}
}