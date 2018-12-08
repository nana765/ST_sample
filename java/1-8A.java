//文字列の小文字と大文字を入れ替える
import java.io.*;
import java.util.Scanner;
class Sample8A{
	public static void main(String[] args) throws IOException{
			Scanner scan = new Scanner(System.in);
			String moji = scan.next();
			char [] moji2 = moji.toCharArray();			
			int i;
			for(i=0;i<moji2.length;i++){
			if(Character.isUpperCase(moji2[i])){
				moji2[i]=Character.toLowerCase(moji2[i]);
			}else{
				moji2[i]=Character.toUpperCase(moji2[i]);
			}
		}
		
		for(int j=0;j<moji2.length;j++){
		System.out.print(moji2[j]);
		}
	System.out.println();	
		
	}
}