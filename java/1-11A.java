import java.io.*;
import java.util.Scanner;
//サイコロクラス
class Dice{
		int dice[] = new int[6];
}
//mainクラス
class Sample11A{
	public static void main(String[] args)throws IOException{
		Scanner scan = new Scanner(System.in);
		String moji;
		int i,j;
		int ans;
		j=0;
		Dice dice1;
		dice1 = new Dice();//1つ目のオブジェクト
		for(i=0;i<6;i++){
			dice1.dice[i] = scan.nextInt();
			}
			
		moji = scan.next();//２行目の入力(E,N,S,W)
		
		for(i=0;i<moji.length();i++){
			//文字列mojiから1文字ずつ取り出していく
		char moji2 = moji.charAt(i);
			
			if(j==0){
				if(moji2 == 'E'){
					j=3;
				}else if(moji2 =='N'){
					j=1;
				}else if(moji2 =='S'){
					j=4;
				}else if(moji2 == 'W'){
					j=2;
				}
			}else if(j==1){
					if(moji2 == 'E'){
						j=3;
					}else if(moji2 =='N'){
						j=5;
					}else if(moji2 == 'S'){
						j=0;
					}else if(moji2 == 'W'){
						j=2;
					}
			}else if(j==2){
					if(moji2 == 'E'){
						j=0;
					}else if(moji2 =='N'){
						j=1;
					}else if(moji2 == 'S'){
						j=4;
					}else if(moji2 == 'W'){
						j=5;
					}
			}else if(j==3){
					if(moji2 == 'E'){
						j=5;
					}else if(moji2 =='N'){
						j=1;
					}else if(moji2 == 'S'){
						j=4;
					}else if(moji2 == 'W'){
						j=0;
					}
			}else if(j==4){
					if(moji2 == 'E'){
						j=2;
					}else if(moji2 =='N'){
						j=5;
					}else if(moji2 == 'S'){
						j=0;
					}else if(moji2 == 'W'){
						j=3;
					}
			}else if(j==5){
					if(moji2 == 'E'){
						j=2;
					}else if(moji2 =='N'){
						j=1;
					}else if(moji2 == 'S'){
						j=4;
					}else if(moji2 == 'W'){
						j=3;
					}
				}
				ans = dice1.dice[j];	
		System.out.println(ans);	
			}
		ans = dice1.dice[j];	
		System.out.println(ans);	
	}
}
