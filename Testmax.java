import java.util.Scanner;
public class Testmax
{
    public static void main(String[] args)
    {
        int a[],i,sum=0, len, avg=0;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the no of input you want to enter");
        len=in.nextInt();
        a= new int [len];
        System.out.println("enter the "+len+ "number");
        for(i=0;i<len;i++)
        {
            a[i]= in.nextInt();
        }
        System.out.println("enter the " +len+ "number");
        for(i=0; i<len; i++)
        { 
           System.out.println(+ a[i]);
        } 
        for(i=0; i<len; i++)
        {
            
           
            sum+=a[i];
        
    }
        System.out.println("The sum is" +sum);
        avg= sum/len;
        System.out.println("average is " +avg);
        
    }
}
