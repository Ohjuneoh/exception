package util;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	private static SimpleDateFormat YYYYMMDD = new SimpleDateFormat("yyyymmdd");
	
	public static String toText(Date date){
	/**
	 * 날짜를 'yyyy-MM-dd;
	 */
		
		if(date == null) {
			return "";
		}
		String formattedText = YYYYMMDD.format(date);
		return formattedText;
	}
	

}
