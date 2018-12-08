import java.io.*;
import java.util.Scanner;
class Sample6D{
	public static void main(String[] args) throws IOException{
		int n,m;
		int i,j;
		System.out.println("n,mを入力してください");
		//n個の数を含む列ベクトルをm個横に並べたもの
		Scanner scan= new Scanner(System.in);
		n=scan.nextInt();
		m=scan.nextInt();
		//列A n*m行列の入力
		int A[][] = new int[n][m];
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				A[i][j] = scan.nextInt();
			}
		}
		//列B　m*1行列の入力
		int B[][] = new int[m][1];
		for(i=0;i<m;i++){
			for(j=0;j<1;j++){
				B[i][j] = scan.nextInt();
			}
		}
		//列C n*1行列の計算
		int C[][] = new int[n][1];
		int ans;
		
		for(i=0;i<n;i++){
			ans=0;
			for(j=0;j<m;j++){
				ans += A[i][j]*B[j][0];
			}
		C[i][0] = ans;
		}
		//出力
		System.out.println("答えは");
		for(i=0;i<n;i++){
				System.out.println(C[i][0]);
			}
		System.out.println();	
	}
}