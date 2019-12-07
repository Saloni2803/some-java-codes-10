class maiinn
{
public static void main(String[] args)
{
derived d=new derived();
d.getdata(5,6);
d.display();
d.area();
d.showarea();
}
}
class base
{
int i,j;
void getdata(int i,int j)
{
this.i=i;
this.j=j;
}
void display()
{
System.out.print(i+""+j);
}
}
class derived extends base
{
int area;
void area()
{
area=i*j;
}
void showarea()
{
System.out.print(+area);
}
}
