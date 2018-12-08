import java.io.*;
import java.util.Scanner;
class Sample9B{
	public static void main(String[] args)throws IOException{
		String moji,st1,st2;
		int m,h;//m = シャッフル回数,h = 移動する列
		int i,j;
		String ans[] = new String[100];
		Scanner scan = new Scanner(System.in);
		j=0;
		moji = scan.next();//最初の並びを表す文字列
		while(!moji.equals("-")){
		m = scan.nextInt();//シャッフル回数
		for(i=1;i<=m;i++){
			h = scan.nextInt();//最後尾に持ってくる列
			st1= moji.substring(h,moji.length());//hからmojiの長さまでの文字をsr1に格納
			st2 = moji.substring(0,h);//0からhまでの文字をsr2に格納
			moji = st1 + st2;
			}
		ans[j] = moji;
		j++;
		moji = scan .next();
		}
		for(i=0;i<j;i++){
			System.out.println(ans[i]);
		}
 }
}