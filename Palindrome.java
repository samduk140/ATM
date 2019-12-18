import java.util.Scanner;
public class palindrome
{
    public static void main(String[] args)
    {
        int a, sum=0, remainder=0;
        Scanner in=new Scanner(System.in);
       
        System.out.println("enter any number you want to checek");
         a=in.nextInt();
         int s=a;
          while(a!=0)
          { remainder=a%10;
            a=a/10;
            sum=sum*10+remainder ;
          }
          if (s==sum)
          {
              System.out.println("it is palindrome number");
            }
            else
            {
                System.out.println("it is not palindrome number");
            }
        }
    }


            
          
       