//引数が０なら偽。引数が1なら真
public class Authenticity {
	public static void main(String[]argw) {
		int i=1;
		//i=0のときは「偽」と表示
		if (i==0) {
			System.out.println("偽");
		//i=1のときは「真」と表示
		}else if(i==1) {
			System.out.println("真");
		//i≠1及びi≠2のときは何も表示しない
		}else {
			System.out.println();
		}
	}
}
