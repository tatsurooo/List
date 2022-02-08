
public class Sum1 {
	public static void main (String[] args) {
		int sum =0;
		
		for(int i=1;i<=10;i++) {
			//繰り返しの中で実行される処理
			//System.out.println("i="+i);
			//i=1
			//i=2
			//i=3
			// ～i=10が表示される
			sum += i;
			//iが10以下の場合sum+iがループされる
			//System.out.println(sum);
			//sumにiが足される度に合計を表示する
		}
		System.out.println("1～10まで足した結果は"+sum+"になる");
		
		
	}

}
