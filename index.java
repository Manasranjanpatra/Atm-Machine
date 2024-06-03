import java.util.*;
 class  bank
{
     private double bal=5000;
     private   double pwd;

     public void deposite(double money)
     {
        System.out.println("Enter the password");
        Scanner sc=new Scanner(System.in);
        pwd=sc.nextDouble();
        if(pwd==1223)
        {
            bal=bal+money;
            System.out.println("the balance is" + bal );
        }
        else
        {
            System.out.println("incorect password .....");
        }
     }

     public void  withdraw(double money)
     {
        System.out.println("Enter the password");
        Scanner sc=new Scanner(System.in);
        pwd=sc.nextDouble();
        if(pwd==1223)
        {
            bal=bal-money;
            System.out.println(" the available balance is " + bal);
        }
        else
        {
            System.out.println(" the password is incorrect");
        }
     }

     public void checkbalance()
     {
        System.out.println("Enter the password");
        Scanner sc=new Scanner(System.in);
        pwd=sc.nextDouble();
        if(pwd==1223)
        {
            System.out.println(" the balance is " + bal);
        }
        else
        {
            System.out.println(" the password is incorrect");
        }
     }
}
class customer
     {
        public static void main(String[] args)
        {
            int ch;
            bank b=new bank();
            System.out.println("1:Deposite");
            System.out.println("2:Withdraw");
            System.out.println("3:Checkbalance");
            while(true)
            {
            System.out.println(" Enter the choice");
            Scanner sc2=new Scanner(System.in);
            ch=sc2.nextInt();
             switch(ch)
                {
                    case 1:b.deposite(1000);
                    break;
                    case 2:b.withdraw(3000);
                    break;
                    case 3:b.checkbalance();
                    break;
                    default :
                    System.out.println(" invalid choice");
                }
            }
        }
     }
    

