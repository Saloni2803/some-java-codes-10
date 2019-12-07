class maiin
{
public static void main(String[] args)
{
animal a=new animal();
dog d=new dog();
cat c=new cat();
a.display();
d.display();
c.display();
}
}
class animal
{
void display()
{
System.out.println("animal is running");
}
}
class dog extends animal
{
void display()
{
System.out.println("dog is running");
}
}
class cat extends animal
{
void display()
{
System.out.println("cat is running");
}
}