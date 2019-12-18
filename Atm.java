import java.util.Scanner;
public class Atm
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        int pin=0;
        int count=0;
        do{
            if(count<=3){
            System.out.println("Enter your pin number");
            pin=input.nextInt();
        }
        else{
            System.out.println("Blocked");
        }
    }while(pin!=123);
    
}
}
        