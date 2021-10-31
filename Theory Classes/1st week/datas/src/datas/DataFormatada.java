package datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataFormatada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		Date data = c.getTime();
		
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("Data brasileira: "+ f.format(data));
		
		f = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("Data sem o dia descrito: "+f.format(data));
		f = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("Data MÉDIA descrito: "+f.format(data));
		f = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("Data CURTA descrito: "+f.format(data));
		
		SimpleDateFormat datinha = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println("Data "+  datinha.format(data));

	}

}
