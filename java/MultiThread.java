class hi extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("Hi");
try{Thread.sleep(500);} catch(Exception e){}
}
}
}

class hello extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("Hello");
try{Thread.sleep(500);} catch(Exception e){}
}
}
}

public class MultiThread
{
public static void main(String[] args)
{
hi obj = new hi();
hello obj1 = new hello();
obj.start();
obj1.start();
}
}




