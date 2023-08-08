public class Login {
    private int accountNo;
    private int password;

    public void AccountCheck(int accountNo) {
        if (accountNo == 123456) {
            System.out.println("You can proceed further to enter password!");
        } else {
            System.out.println("Invalid Credentials!");
        }
    }
    public void Password(int password){
        if(password == 1234){
            System.out.println("Your Password is correct !");
        }
        else{
            System.out.println("Incorrect Password try again !");
        }
    }
}

