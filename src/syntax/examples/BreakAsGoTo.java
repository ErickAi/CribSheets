package syntax.examples;

/**
 */
public class BreakAsGoTo {
    public static void main(String args[]) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("third block Предшествует оператору break.");
                    if (t) break second; // выход из блока second
                    System.out.println("third block Оператор недостижим.");
                }
                System.out.println("seccond block Оператор недостижим.");
            }
            System.out.println("first block Возврат к блоку по метке для break");
        }
    }
}

