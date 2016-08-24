import java.util.Scanner;

  public class Check {

   public static void main(String[] args) { 
    Scanner sc= new Scanner(System.in);
   
    int nu = sc.nextInt();
    if(nu== 0)
    { 
        System.out.print("Number is zero");
        }
    else if(nu> 0)
    { 
        System.out.println("Number is positive");
        }
    else 
    { 
        System.out.println("Number is negative");
        }
  }
 }
