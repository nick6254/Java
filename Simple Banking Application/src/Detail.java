public class Detail {
    private int withdrawn;
    private int deposited;

    //Function to display the balance in the account.
    public void display(int TotalBalance){
        System.out.println("Your balance is "+TotalBalance);
    }
    //Function in which there is logic to withdraw the money from the account.
    public void Withdraw(int WithdrawBalance,int TotalBalance){

        if(WithdrawBalance<=TotalBalance){
            withdrawn = TotalBalance-WithdrawBalance;
            System.out.println("Cash has been withdrawn!");
            System.out.println("Your remaining balance is : "+withdrawn);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    //Function in which there is logic to deposit the money in the account.
    public void Deposit(int DepositBalance,int TotalBalance){
        deposited = TotalBalance + DepositBalance;
        System.out.println("Total amount after deposit is "+deposited);

    }
}

