import java.util.ArrayList;


public class Stringlist {
	//String型listを作成
	public static void main(String[]args) {
		//リストを作成
		ArrayList<String>list =new ArrayList<String>();
		//リストの要素を追加
		list.add( "monday");
		list.add("tuesday");
		list.add("wednesday");
		list.add("thursday");
		list.add("friday");
		list.add("saturday");
		list.add("sunday");
		
		//リスト要素内（0～6）にあるときに引数iをループする
		for(int i =0;i <list.size();i++) {
			System.out.println(list.get(i));
		}
		//リストの要素数
		System.out.println("リストの要素"+ list.size());
	}
		
}

