class MyClass{									class MyClass{
	private static String name1 = "Оля";			private static String name1 = "Оля";
	private static String name2 = "Лена";			private static String name2 = "Лена";

	public synchronized void swap(){				public void swap(){
														synchronized (this){
	String s = name1;										String s = name1;
	name1 = name2;											name1 = name2;
	name2 = s;												name2 = s;
														}
	}												}
													
	public static synchronized void swap2(){		public static void swap2(){
														synchronized (MyClass.class){
	String s = name1;										String s = name1;
	name1 = name2;											name1 = name2;
	name2 = s;												name2 = s;
	}													}
}													}

class Clock implements Runnable{
	private volatile boolean isCancel = false;
	
	public void cancel(){
		this.isCancel = true;
		}
		
		public void run(){
			while (!this.isCancel)
			{
				Thread.sleep(1000);
				System.out.println("Tik");
				}
			}
		}

