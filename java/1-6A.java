import java.util.Scanner;
class Sample6A{
	public static void main(String[] args) {
		int cnt,i;
		Scanner scan = new Scanner(System.in);
		System.out.println("配列の大きさと要素を入力してください");
		cnt = scan.nextInt();
		int data[] = new int[cnt];
		for( i = 0 ; i < cnt ; i++ ){
			data[i] = scan.nextInt();
			}
		for( i = cnt-1 ; i >= 0 ; i-- ){
			System.out.print(data[i]);
		}		
	System.out.println();
	}
}	
			