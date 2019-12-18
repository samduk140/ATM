import java.util.Scanner;
public class ArmstrongNumber
{
   public static void main(String [] args)
   { int a,digits=0, sum=0, remainder, temp;
       Scanner in= new Scanner(System.in);
       System.out.println("enter number you want to check whether its armstrong or not");
       a= in.nextInt();
       temp=a;
       while(temp!=0)
       {
           digits++;
           temp=temp/10;
        }
        temp=a;
        while (temp!=0)
        {
            remainder=temp%10;
             sum= sum+ power(remainder, digits);
            temp=temp/10;
        }
        if(a==sum)
        System.out.println(+a+" is armstrong number");
    
    else 
        System.out.println(+a+ " is not an armstrong number");
    }
    static int power(int n, int r)
    {
        int c,p=1;
        for(c=1; c <=r; c++)
        p=p*n;
        return p;
}
    }

       
       