import java.util.Scanner;
public class Case
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter one number");
        int a=input.nextInt();
        System.out.println("enter your operation");
        String operation=input.next();
        System.out.println("enter one number");
        int b=input.nextInt();
        int result=0;
        char operation1=operation.charAt(0);
        switch(operation1)
        {
        case '+':
            result=a+b;
            
            break;
        
        case '-':
            result=a-b;
            
        break;
        case '*':
            result=a*b;
           
        break;
        case '/':
            result=a/b;
            
        break;
        default:
        System.out.println("enter valid operation");
            break;
        }
        System.out.println("result "+result);
    }
}
        
        
        
        