/*типы исключений в пакете java.lang.:
RuntimeException e					общий класс исключений
ArithmeticException e				арифметические
NumberFormatException				числовые
NullPointerException e				строковые
ArrayIndexOutOfBoundsException e	массивы
IndexOutOfBoundsException			коллекции List
NullPointerException				коллекции Map
FileNotFoundException
URISyntaxException
*/
try (OutputStream stream = openOutputStream()) {
    // что-то делаем со stream
}
try (final AutoCloseableITextRenderer iTextRenderer = new AutoCloseableITextRenderer()) {
            ByteArrayOutputStream out; // contains the data to be converted to PDF, not shown here.
            iTextRenderer.setDocumentFromString(new String(out.toByteArray()));
            iTextRenderer.layout();
            iTextRenderer.createPDF(pdfOutputStream);
            pdfOutputStream.flush();
        }

//перехват выборочных исключений: task09.task0915
public class Solution {
    public static void main(String[] args) throws Exception {
	
		try {
			int a = 42 / 0;
		}
		catch (RuntimeException e){
			System.out.println(e);
		}
		System.out.println(e.toString());
			System.out.println(e.getMessage());
    }
}