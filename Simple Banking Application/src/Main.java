import java.util.*;
public class Main {
    public static void main(String[] args) {
        int accountNo;
        int password;
            do {
                Login log = new Login();
                Scanner acc = new Scanner(System.in);
                System.out.println("Enter the account number : ");
                accountNo = acc.nextInt();
                log.AccountCheck(accountNo);

                Scanner pin = new Scanner(System.in);
                System.out.println("Enter the password : ");
                password = pin.nextInt();
                log.Password(password);
            }while(accountNo!=123456 && password!=1234);

        int opt;
        System.out.println("Welcome to our Bank");
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Select any below options using numeric keys to proceed!");
        System.out.println("1. Check the Balance.");
        System.out.println("2. Withdraw.");
        System.out.println("3. Deposit.");
        System.out.println("4. Cancel.");
        int TotalBalance = 10000;
        opt = sc.nextInt();
        Detail details = new Detail();


    switch (opt) {
        case 1:
            details.display(TotalBalance);
            break;

        case 2:
            Scanner wd = new Scanner (System.in);
            System.out.println("Enter the Amount you want to withdraw : ");
            int WithdrawBalance = wd.nextInt();
            details.Withdraw(WithdrawBalance, TotalBalance);
            break;

        case 3:
            Scanner dep = new Scanner(System.in);
            System.out.println("Enter the amount to deposit : ");
            int DepositBalance = dep.nextInt();
            details.Deposit(DepositBalance, TotalBalance);
            break;

        case 4:
            System.out.println("Exiting the Program!");
            break;
    }

    }while (opt!=4);
    }
}