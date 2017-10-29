package syntax.MySystemOut;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class mySystemOutPrintLn {

    public static void main(String[] args) {
/*      забрать поток предназначенный для вывода на консоль, в свой ByteArrayOutputStream & String
        System - class in java.lang
        static final PrintStream out = инициализированное и статический объект класса Printstream
        1. сохранить System.out в спец переменную
        2. создать ByteArray для подмены консоли
        3. создать адаптер, myOut перехватывающий поток байтов предназначенный для System.out
                    metod System.setOut(ByteArray myBuffer);
        4. считать поток в ByteArray (либо sout в main, либо отдельным методом любого класса)
        5. вернуть как было (из спец переменной вернуть в класс system оригинальный out
        6. получить proffit из ByteArray
*/
        PrintStream originalOut = System.out;                               //1
        ByteArrayOutputStream byteOutStream = new ByteArrayOutputStream();  //2
        PrintStream myOut = new PrintStream(byteOutStream);                 //3
        System.setOut(myOut);
        System.out.println("вжух");                                         //4
        System.setOut(originalOut);                                         //5

        String proffit = byteOutStream.toString();
        System.out.println(proffit);
    }
}
