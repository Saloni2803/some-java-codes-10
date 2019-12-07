import java.io.*;
public class mcqs
{
      public static void main(String[] args)
      {
           try {
               StringReader st=new StringReader("Hi 1 Examly");
               StreamTokenizer strT=new StreamTokenizer(st);
               while(strT.nextToken()!=StreamTokenizer.TT_EOF)
               {
                   System.out.println(strT.sval +" "+strT.nval);                                
               } 
           }
           catch(Exception e) {System.out.println(e);}
     }
 } 
