Interface Runnable{
void	run()
}
java.lang.Tread extends Object,implements Runnable{
//Nested Classes
	static class 		Thread.State						
	static interface 	Thread.UncaughtExceptionHandler		
//fields and states										
	static int	MAX_PRIORITY,	MIN_PRIORITY,	NORM_PRIORITY;
	boolean interrupt;
//constructors
	Thread()/	
	Thread(Runnable target)/	(String name)/	(Runnable target, String name)/		
	Thread(ThreadGroup group, Runnable target)/	(ThreadGroup group, String name)/
											/	(ThreadGroup group, Runnable target, String name)/
	Thread(ThreadGroup group, Runnable target, String name, long stackSize)
//methods	
	setName(String)			/	getName()	
	setPriority(int)		/	getPriority()	
	setDaemon(boolean on)	/	isDaemon()		
	long	getId()			
	void	start()
	static void	sleep(long millis)	/(long millis, int nanos)
	void	join()/	(long millis)/	(long millis, int nanos)
		static void	yield()	//A hint to the scheduler that the current thread is willing to yield 
						//its current use of a processor.
	void	interrupt()		//остановка потока извне, путем изменения переменной isInterrupt на тру.
	boolean	isInterrupted()			//Tests whether this thread has been interrupted.
	static Thread	currentThread()	//Returns a reference to the currently executing thread object.void	run()
	static boolean	interrupted()	//Tests whether the current thread has been interrupted.
	boolean	isAlive()				//Tests if this thread is alive.
	
	void	setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler eh)
	static void	setDefaultUncaughtExceptionHandler(Thread.UncaughtExceptionHandler eh)
	static boolean	holdsLock(Object obj)		//Returns true if and only if the current 
						//thread holds the monitor lock on the specified object.
	StackTraceElement[]	getStackTrace()	//Returns an array of stack trace representing the stack dump of thread.
	Thread.State	getState()			//Returns the state of this thread.
	ThreadGroup	getThreadGroup()		//Returns the thread group to which this thread belongs.
	Thread.UncaughtExceptionHandler	getUncaughtExceptionHandler()	//Returns the handler invoked 
						//when this thread abruptly terminates due to an uncaught exception.
	static int	activeCount()
		//Returns an estimate of the number of active com.er.threads in the current thread's thread group and its subgroups.
	void	checkAccess()
		//Determines if the currently running thread has permission to modify this thread.
	protected Object	clone()
		//Throws CloneNotSupportedException as a Thread can not be meaningfully cloned.
	void	setContextClassLoader(ClassLoader cl)
					//Sets the context ClassLoader for this Thread.

	static void	dumpStack()
			//Prints a stack trace of the current thread to the standard error stream.
	static int	enumerate(Thread[] tarray)
			//Copies into the specified array every active thread in the current thread's thread group and its subgroups.
	static Map<Thread,StackTraceElement[]>	getAllStackTraces()
			//Returns a map of stack traces for all live com.er.threads.
	ClassLoader	getContextClassLoader()
			//Returns the context ClassLoader for this Thread.
	static Thread.UncaughtExceptionHandler	getDefaultUncaughtExceptionHandler()
			//Returns the default handler invoked when a thread abruptly terminates due to an uncaught exception.
	String	toString()	//including the thread's name, priority, and thread group.
}
class Printer implements Runnable{	//Класс, который реализует интерфейс Runnable.
private String name;
public Printer(String name){
	this.name = name;
	}
public void run(){
	System.out.println("I’m " + this.name);
	}
}

class Printer extends Thread{		//extends от Thread, который implements Runnable, и override метод run.
private String name;
public Printer(String name){
	this.name = name;
	}
public void run(){
	System.out.println("I’m " + this.name);
	}
}
