import java.util.Scanner;
public class Matri
{
    public static void main(String [] args)
    {
    int a[][],b[][], i,j, sum[][] ; 
    Scanner in= new Scanner(System.in);
     
    a= new int [2][2];
    b= new int [2][2];
    sum= new int [2][2];
    System.out.println("enter the value of first matrix");
    for (i=0; i<2; i++)
    {
        for (j=0; j<2; j++)
        {
            a[i][j]= in.nextInt();
            System.out.println(" ");
        }
    }

    
     for (i=0; i<2; i++)
    {
        for (j=0; j<2; j++)
        {
            b[i][j]= in.nextInt();
            System.out.println(" ");
        }
    }
    System.out.println(b[2][2]);
     for (i=0; i<2; i++)
    {
        for (j=0; j<2; j++)
        {
           sum[i][j]= a[i][j]+ b[i][j];
        System.out.println(" ");
    }
    }
    System.out.println(" the sum of 2 matrix is = "+sum[2][2]);
      for (i=0; i<2; i++)
    {
        for (j=0; j<2; j++)
        {
           System.out.println(sum[i][j] + " ");
           System.out.println(" ");
        }
    }}
}
    
    
 