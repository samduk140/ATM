import java.util.Scanner;
public class Factorial
{
    public static void main(String[]args)
    {
        int a,i=1, fact=1, j=1;
        System.out.println("enter number you want factorial of ");
        Scanner in= new Scanner(System.in);
       
        
        a=in.nextInt();
        while(i<=a)
        { fact=fact*i;
            i++;
            
        }
        System.out.println("the factorial of " +a+ " is" );
            System.out.print(+fact+ " ");
            
    }
}


            
            
        