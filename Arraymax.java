import java.util.Scanner;
public class Arraymax

{
    public static void main(String [] args)
    {
        int num[], max;
        Scanner input=new Scanner(System.in);
        System.out.println("enter number of item you want to store; ");
        int len =input.nextInt();
        num=new int[len];
        System.out.println("enter "+len+"items");
        for (int i=0; i<len; i++)
        {
            num[i]=input.nextInt();
        }
        System.out.println("item store in array are; ");
        for (int i =0; i<len; i++)
        {
            System.out.println("Item at num[ "+i+" ]= "+num[i]);
        }
        max= num[0];
        for (int i=1; i<len; i++)
        { if (  max< num[i])
            {
                max=num[i];
            }
        }
        System.out.println("the largest number is ; "+max);
        
            
    }
}

        