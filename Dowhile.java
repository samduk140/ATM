import java.util.Scanner;
public class Dowhile
{
    public static void main(String [] args)
    {
        int i=1, a;
        Scanner in= new Scanner(System.in);
        System.out.println("enter the any no");
        a= in.nextInt();
        do 
        {
            System.out.println(a);
           i++;
        }while(i<a); 
       
        
    }
}
            
    