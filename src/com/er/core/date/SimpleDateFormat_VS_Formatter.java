package com.er.core.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_VS_Formatter {
    public static void main(String[] args)throws Exception {
        SimpleDateFormat forParse = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
        SimpleDateFormat forOut = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");
        Date curDate = new Date();
        Date setDate = forParse.parse("03:07:02 07.03.1254");
        System.out.println(String.format(getFormattedString(), curDate));
        System.out.println(String.format(getFormattedString(), setDate));
        System.out.println(forOut.format(setDate));
        //должен быть вывод аналогичный следующему
        //31:10:13 15:59:59 - dd:MM:yy hh:mm:ss
    }

    public static String getFormattedString() {
        return "%tI";
    }
}
/*
%tH		HH		Час (00 – 23)
%tI		hh		Час (01 – 12)
%tM		mm		Минуты как десятичное целое (00 – 59)
%tS		ss		Секунды как десятичное целое (00 – 59)
%tL		S		Миллисекунды (000 – 999)
%tY		yyyy	Год в четырехзначном формате
%ty		yy		Год в двузначном формате (00 – 99)
%tB		MMMM	Полное название месяца (“Январь”)
%tb/%th	MMM		Краткое название месяца (“янв”)
%tm		MM		Месяц в двузначном формате (1 – 12)
%tA		EEEE	Полное название дня недели (“Пятница”)
%ta		E		Краткое название дня недели (“Пт”)
%td		dd		День в двузначном формате (1 – 31)
%tR	= "%tH:%tM" 		HH:mm		(21:42)
%tT	= "%tH:%tM:%tS"		HH:mm:ss  	(21:42:22)
%tr	= "%tI:%tM:%tS %Tp" hh:mm:ss a	(09:42:22 PM)
%tD	= "%tm/%td/%ty"		MM/dd/yy
%tF	= "%tY–%tm–%td"		yyyy-MM-dd
%tc	= "%ta %tb %td %tT %tZ %tY"
						E MMM dd HH:mm:ss z yyyy
 */

