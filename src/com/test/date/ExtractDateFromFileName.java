package com.test.date;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDateFromFileName {

	public static void main(String[] args) throws ParseException {
		String file="aaa_bbb_ccc_ddd_eee_ZZ_E_20160801_20160831_v1-0.csv";
		extractDatesFromFileName(file);	
	}
	
	private static Date[] extractDatesFromFileName(String file) throws ParseException {
	    Date[] dates = new Date[2];

	    SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyyMMdd");

	    String regex = ".*(\\d{8})_(\\d{8}).*";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher m = pattern.matcher(file.getName());
	    if (m.find()) {
	        dates[0] = dateFormatter.parse(m.group(1));
	        dates[1] = dateFormatter.parse(m.group(2));
	    }
	    System.out.println(dates[0]);
	    System.out.println(dates[1]);
	    return dates;
	}


}
