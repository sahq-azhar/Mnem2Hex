/*
This is the main algorithm on which the app is running
i hope it gives you hint as on how the app is working
i made it using very basic and simple algo and i know its not effcient 

any one got any better algo let me know

Thanks in advance
happy CoDiNg

-----made by syed azhar----aka SAHQ----
*/

import java.util.*;

public class Main
{

  public static void main (String[]args)
  {
    Scanner User = new Scanner (System.in);
    String a = User.nextLine ();
    String b = "MOV A,B";
    String c = "MOV A,D";
    if (a.equals (b))
      {
	System.out.println ("78");
      }
    if (a.equals (c))
      {
	System.out.println ("7A");
      }
    else
      {
	System.out.println ("no record found");
      }



  }
}
