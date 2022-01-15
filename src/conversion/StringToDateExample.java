package conversion;

import java.util.Date;
import java.text.SimpleDateFormat;

public class StringToDateExample {

	public static void main(String[] args) throws Exception{
		
		String sDate = "16/12/2021";
		Date date1 = new SimpleDateFormat("DD/MM/yyyy").parse(sDate);
		System.out.println(sDate +"\t" +date1);

	}

}
