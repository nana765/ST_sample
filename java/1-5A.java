import java.util.Scanner;	
class Sample5A{
	public static void main(String[] args){
		int i=0;
		int cnt,cnt2,cnt3;
		int h[] = new int[100];
		int w[] = new int[100]; 
		Scanner scan1 = new Scanner(System.in);
		System.out.println("数値を入力してください");
		  h[0] = scan1.nextInt();//h=縦
		 w[0] = scan1.nextInt();//w=横
		while(h[i]!=0&&w[i]!=0){
			i += 1;
		 h[i] = scan1.nextInt();//h=縦
	     w[i] = scan1.nextInt();//w=横
		}
for(cnt=0;cnt<=i;cnt++){
	for(cnt2=0;cnt2<h[cnt];cnt2++){
		for(cnt3=0;cnt3<w[cnt];cnt3++){
		System.out.print('#');
		}	
	System.out.println();
	}
	System.out.println();
    }
			
   }
}
