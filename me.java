class me
{
public static void main(String[] args)
{
Mythread obj=new Mythread();
Thread t=new Thread(obj);
t.start();
System.in.read();
obj.stop=true;
}
}
class Mythread implements Runnable
{
boolean stop=false;
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println(Thread.currentThread().getId()+i);
if(stop)
return;
}
}
}