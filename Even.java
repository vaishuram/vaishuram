import java.util.Scanner;
 class Even
{
  public static void main(String args[])
  {
    int num;
    System.out.println("Input an integer");
    Scanner in = new Scanner(System.in);
    num = in.nextInt();
 
    if ( (num/2)*2 == num )
      System.out.println("Even");
    else
      System.out.println("Odd");
  }
}
