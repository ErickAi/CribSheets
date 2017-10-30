
public HasHeight castToHasHeight() {	//локальный анонимный класс, объявленный в методе, расширяющий интерфейс
	return new HasHeight(){				//объявление класса-наследника, создание объекта класса
	@Override							//без объявления переменной.
		public double getHeight(){		//(переопределение) метода 
          return Math.abs(point1.getY() - point2.getY());
          }
    };
}
public HasWidth castToHasWidth() {		//то же самое через лямбду. 
    return () -> Math.abs(point1.getX() - point2.getX());	//передаваемые аргументы -> процедура
}

		
Thread thread = new Thread(){		//объявление класса-наследника, создание объекта класса-наследника
 public void run(){					//объявление переменной
  tigerRun();						//переопределение метода
 } 
};

class Tiger extends Cat{
 
 public void tigerRun(){
  ..
 }
 
 public void startTiger(){
  TigerThread thread = new TigerThread();
  thread.start();
 }

 class TigerThread extends Thread{
  public void run(){
   tigerRun();
  } 
 }
}

class Tiger extends Cat{
 public void tigerRun(){
  .....
 }

 public void startTiger(){
  thread.start();
 }
 private TigerThread thread = new TigerThread();

 private class TigerThread extends Thread{
  public void run(){
   tigerRun();
  } 
 }
}

