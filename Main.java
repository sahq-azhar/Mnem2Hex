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
