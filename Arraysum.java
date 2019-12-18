import java.util.Scanner;
public class Arraysum

{
    public static void main(String[] args)
    {
        int i,a, sum=0 , avg=0, num[];
       
        Scanner in= new Scanner(System.in);
        System.out.println("enter number of data you want to enter");
        a=in.nextInt();
        num=new int  [a];
        System.out.println("enter " +a+ "you want to input");
        for (i=0; i<a; i++)
        {num[i]=in.nextInt();
        }
        System.out.println("the number you input are");
        for(i=0; i<a; i++)
        {
            System.out.println(+num[i]);
        }
        for (i=0;i<a;i++)
        { sum+=num[i];
        }
        
        System.out.println("sum of " +a+" number is ;" + sum);
         avg= sum/a;
         System.out.println("the average is "+avg);
        
    }
}

            
 