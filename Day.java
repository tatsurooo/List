import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Day {
	public static void main(String[]args) {
		 //現在日時を取得
		//LocalDateTime now =LocalDateTime.now();
	    //3年後の今日
		LocalDateTime three = LocalDateTime.parse("2025-01-28T10:11:11");
	    //3年後の今日の曜日
		DayOfWeek dayofweek = three.getDayOfWeek();
	    
        System.out.println("3年後の今日は" + dayofweek + "です");
       
        //フォーマットを指定
        //DateTimeFormatter f=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        //mmは分に表示され、MMは日付で表示される
        //hhは1～12時表示？ HHは24時間表示？
        //System.out.println(now.format(f));
			
		}
	}

