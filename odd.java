import java.util.Scanner;
 class OddOrEven
{
   public static void main(String args[])
   {
      int num;
      System.out.println("Enter an integer ");
      Scanner in = new Scanner(System.in);
      num = in.nextInt();
 
      if ( num % 2 == 0 )
         System.out.println("You entered an even number.");
      else
         System.out.println("You entered an odd number.");
   }
}
