абстрактный базовый класс
Reader				Writer
		подклассы
BufferedReader		BufferedWriter
//Буферизированный символьный поток
CharArrayReader		CharArrayWriter
//Поток, который читает из символьного массива
FileReader			FileWriter
//Поток, читающий файл
FilterReader		FilterWriter
//Фильтрующий читатель
InputStreamReader	OutputStreamWriter
//Поток, транслирующий байты в символы
StringReader		StringWriter
//Поток, читающий из строки
PipedReader			PipedWriter
//Входной/Выходной канал
LineNumberReader	
//Входной поток, подсчитывающий строки
PushbackReader		
//Входной поток, позволяющий возвращать символы обратно в поток
					PrintWriter
//Выходной поток, включающий методы print() и println()
http://developer.alexanderklimov.ru/android/java/io.php