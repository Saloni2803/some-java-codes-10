class minne
{
public static void main(String args[])
{
Reserve obj=new Reserve(2);
Thread t1=new Thread(obj);
Thread t2=new Thread(obj);
t1.setName("First Thread");
t2.setName("Second Thread");
t1.start();
t2.start();
}
}
class Reserve extends Thread
{
int avail=1;
int want;
Reserve(int x)
{
want=x;
}
public void run()
{
System.out.print("Available Ticket"+avail);
if(avail>=want)
{
String s=Thread.currentThread().getName();
System.out.print(want+" "+s);
try
{
Thread.sleep(100);
avail=avail-want;
}
catch(InterruptedException e)
{}
}
else
{
System.out.print("Sorry not available");
}
}
}