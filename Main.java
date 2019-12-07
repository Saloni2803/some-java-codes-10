import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
      int t,n;
      Scanner sc=new Scanner (System.in);
      t=sc.nextInt();
      for(int i=0;i<t;i++)
      {
        n=sc.nextInt();
        int rev=0,num=n,r;
        while(n!=0)
        {
          r=n%10;
          n=n/10;
          rev=(rev*10)+r;
        }
        if(num==rev)
          System.out.println("Equal");
        else
          System.out.println("Not Equal");
      }
        // Write your code here
    }
}