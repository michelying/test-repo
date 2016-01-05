package test.test.test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestJRE {

	public static void main(String[] args) {

		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			PrintWriter writer = new PrintWriter("test.txt");
			
			Date date = sdf.parse("2015-31-12");
			
			writer.append(date.toString());
			writer.append("hello");
			writer.close();
			
			
		} catch (ParseException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
