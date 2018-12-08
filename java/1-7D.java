import java.io.*;
import java.util.Scanner;
class Sample7D{
	public static void main(String[] args) throws IOException{
		int n,m,l;
		int i,j,k;
		System.out.println("n,m,lを入力してください");
		//n個の数を含む列ベクトルをm個横に並べたもの
		Scanner scan= new Scanner(System.in);
		n=scan.nextInt();
		m=scan.nextInt();
		l=scan.nextInt();
		//列A n*m行列の入力
		int A[][] = new int[n][m];
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				A[i][j] = scan.nextInt();
			}
		}
		//列B　m*l行列の入力
		int B[][] = new int[m][l];
		for(i=0;i<m;i++){
			for(j=0;j<l;j++){
				B[i][j] = scan.nextInt();
			}
		}
		//列C n*1行列の計算
		int C[][] = new int[n][l];
		int ans;
		
		for(i=0;i<n;i++){
			ans=0;
			for(j=0;j<l;j++){
				ans=0;
				for(k=0;k<m;k++){
				ans += A[i][k]*B[k][j];
			}
			C[i][j] = ans;
		}
		}
		//出力
		System.out.println("答えは");
		for(i=0;i<n;i++){
			for(j=0;j<l;j++){
				System.out.print(" ");
				System.out.print(C[i][j]);
			}
			System.out.println();	
		}
		System.out.println();	
	}
}