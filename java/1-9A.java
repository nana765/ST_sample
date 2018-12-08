import java.io.*;
import java.util.Scanner;

class Sample9A{
	public static void main(String[] args) throws IOException{
		String w;
		String T;
	    String A = "END_OF_TEXT";
		int cnt;
		Scanner scan = new Scanner(System.in);
		//w = 一つの単語
		w = scan.next();
		//T=文章
		T= scan.next(); 
		cnt = 0;
		while(!T.equals(A)){ //String型同士の比較は◯.equals(△)で判定
			System.out.println(T);
			if(w.equals(T)){
				cnt++;
			}
		
		T = scan.next();
	}	
		System.out.println(cnt);
	}
}