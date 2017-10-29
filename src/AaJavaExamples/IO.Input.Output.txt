	абстрактный базовый класс
InputStream				OutputStream
			  подклассы
BufferedInputStream		BufferedOutputStream
//Буферизированный поток
ByteArrayInputStream	ByteArrayOutputStream
//Позволяет использовать буфер в памяти (массив байтов) в качестве источника данных 
DataInputStream			DataOutputStream
//Поток, включающий методы для чтения/записи стандартных типов данных Java
FileInputStream			FileOutputStream
//Для чтения/записи информации из файла
ObjectInputStream		ObjectOutputStream
//Поток для объектов
PipedInputStream		PipedOutputStream
//Реализует понятие входного/выходного канала.
FilterInputStream		FilterOutputStream
//Абстрактный класс, предоставляющий интерфейс для классов-надстроек, 
//которые добавляют к существующим потокам полезные свойства.
StringBufferInputStream
//Превращает строку (String) во входной поток данных InputStream
						PrintStream
//Выходной поток, включающий методы print() и println()
PushbackInputStream
//Входной поток, поддерживающий однобайтовый возврат во входной поток
SequenceInputStream
//Сливает два или более потока InputStream в единый поток
http://developer.alexanderklimov.ru/android/java/io.php

Как я понял, считывать и записывать по байту не является хорошей практикой, 
потому что это сказывается на производительности. Необходимо использовать обертку Buffered

Разбор концепта обертки в Buffered:
http://stackoverflow.com/questions/9648811/specific-difference-between-bufferedreader-and-filereader

В чем преимущество обертки:
http://stackoverflow.com/questions/18600331/why-is-using-bufferedinputstream-to-read-a-file-byte-by-byte-faster-than-using-f

В чем отличие inputstreamreader от filereader:
http://stackoverflow.com/questions/7991770/inputstreamreader-vs-filereader
http://stackoverflow.com/questions/5155226/fileinputstream-vs-filereader