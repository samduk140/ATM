import java.util.Scanner;
public class Armstrong 
    {
        public static void main(String[] args)
        {
            int a , count=0,number,remain, num;
            double  sum=0;
            Scanner in= new Scanner(System.in);
            System.out.println("enter number you want to check ");
            a= in.nextInt();
            number=a;
            
            while(number!=0)
            {
                number=number/10;
                count++;
            }
            num=a;
            while(num!=0)
            {
                remain=num%10;
                sum=sum + Math.pow(remain, count);
                num=num/10;
            }
            if(number == sum)
            {
                System.out.println("it is armstrong number");
            }
            System.out.println("it is not armstrong number");
            
        }
    }




                
            
          
        