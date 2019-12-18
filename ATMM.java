import java.util.Scanner;
public class ATMM
{
    public static void main(String []args)
    {
        int a, pin=1234, count=0,i=0;
        Scanner in= new Scanner(System.in);
        System.out.println("plz enter password to continue");
        pin= in.nextInt();
        if (pin!=1234)
        
        {
        do
        {
            System.out.println("your password is wrong. plz enter again");
            pin= in.nextInt();
        i++;
        }
        while(i<2);
        System.out.println("your account is blocked");
        }
          else
         {
         
        System.out.println("Welcome to samduk world");
         
        int l, m, withdraw, balance=1000, depo,transfer_amt,ac_no;
        System.out.println("enter your choice no \n 1 for withdraw \n 2 for deposit  \n 3 for  transfer");
        
       
        m=in.nextInt();
        switch(m)
        {
        case 1:
        System.out.println("  you are about to  withdraw. plz enter your wish amount");
        withdraw= in.nextInt();
        System.out.println("now you have balance rs = " +(balance- withdraw));
        System.out.println("Thank you for banking with us");
        break;
        case 2:
        System.out.println("enter amount you want to deposit");
        depo= in.nextInt();
        System.out.println("now your actual  balance is = " + (balance+ depo));
        System.out.println("Thank you for banking with us");
        break;
        case 3:
        System.out.println("Enter amount you want to transfer");
        transfer_amt=in.nextInt();
        System.out.println("enter your destination account number");
        ac_no=in.nextInt();
        System.out.println("Money transfer has been success");
        System.out.println("THANK YOU for '\n' banking with us");
        break;
        default:
        System.out.println("plz select your choice");
    }
   }

 }
}

        
        
        
        
        
    

        