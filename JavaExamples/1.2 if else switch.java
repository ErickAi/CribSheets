public class Home{
    public static void main(String[] args){
    int num1 = 6;
	int num2 = 8;
				//фигурные скобки после оператора выставляются для блока команд. если команда одна, скобки не нужны.
		if(num1>num2){
		System.out.println("Первое число больше второго");
			}
		else if(num1<num2){
		System.out.println("Первое число меньше второго");
			}
		else{
		System.out.println("Числа равны");
			}
	}
}

//Также мы можем соединить сразу несколько условий, используя логические операторы:
public class Home{
    public static void main(String[] args){
     int num1 = 8;
	int num2 = 6;
		if(num1 > num2 && num1>7){
		System.out.println("Первое число больше второго и больше 7");
		}
    }
}

/*Конструкция switch/case аналогична конструкции if/else, так как позволяет обработать сразу несколько условий.
После ключевого слова switch в скобках идет сравниваемое выражение. 
Значение этого выражения последовательно сравнивается со значениями, 
помещенными после оператора сase. 
И если совпадение будет найдено, 
то будет выполняться определенный блок сase.
*/
public class Home{
    public static void main(String[] args){
		int num = 8;
		switch(num){
        case 1: 
        System.out.println("число равно 1");
        //оператор break, чтобы избежать выполнения других блоков.
		break;			
		case 8: 
        System.out.println("число равно 8");
        num++;
        break;
		case 9: 
        System.out.println("число равно 9");
        break;
		/*Если мы хотим также обработать ситуацию, когда совпадения не будет найдено, 
		то можно добавить блок default, как в примере выше. Хотя блок default необязателен.*/
		default:
		System.out.println("число не равно 1, 8, 9");
		}
    }
	
	
}