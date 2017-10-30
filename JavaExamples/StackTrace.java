StackTraceElement[] el = Thread.currentThread().getStackTrace();
for (int i=0;i<el.length; i++){
            System.out.print("index - "+i);
        System.out.print("\tname - "+Thread.currentThread().getStackTrace()[i].getMethodName());
        System.out.println("\tclass - "+Thread.currentThread().getStackTrace()[i].getClassName());}

Thread.currentThread().getStackTrace()[2].getMethodName();
Thread.currentThread().getStackTrace()[2].getClassName();
Thread.currentThread().getStackTrace()[2].getLineNumber();