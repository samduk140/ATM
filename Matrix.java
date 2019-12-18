import java.util.Scanner;
public class Matrix
{
    public static void main(String [] args)
    {
        int a[][], j,i, b,c;
        Scanner in=new Scanner(System.in);
        System.out.println("enter how many row and column of input you want to print");
        i= in.nextInt();
        j=in.nextInt();
        a= new int [i][j];
        System.out.println("enter the value of " +i+ "*" +j+  "matrix" );
        for ( b=0; b<i; b++)
        {
            for( c=0; c<j; c++)
            {
                a[b][c]=in.nextInt();
            }
        }
        System.out.println("matrix " +i+ "*" +j+ "are" );
        
        for ( b=0; b<i; b++)
        {
            for( c=0; c<j; c++)
            {
                System.out.print(a[b][c] +" ");
            }
            System.out.println();
        }
    }
}

                
                
                