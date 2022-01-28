package assignment2_OOP;


public class BankAccounts {
    public  double totalAmount,savingsTotal,currentTotal = 0.0;
    public static void main(String[] args) {
        BankAccounts b1 = new BankAccounts();
        BankAccounts s1 = new SavingsAccount();
        BankAccounts c1 = new CurrentAccount();

        s1.deposit("savings",1000.0);
        s1.deposit("savings",1000.0);
        c1.deposit("current",1000.0);
        c1.deposit("current",1000.0);
        c1.deposit("current",1000.0);

        b1.getTotalBankAmount(s1.savingsTotal,c1.currentTotal);
    }

    public void deposit(String accountType, double amount){
//        System.out.println("Account Type: " +accountType);
//        currentTotal =+ amount;
    }
    public void getTotalBankAmount(double s,double c){
        System.out.println("\nTotal Savings Amount: " + s +" & Total Current Amount : "+ c);
        System.out.println("Total bank Amount is " + (s+c));
    }
}

class SavingsAccount extends BankAccounts{
    //method to deposit to Savings Account
    @Override
    public void deposit(String accountType, double amount) {
        savingsTotal = savingsTotal + amount;
        System.out.println("Account Type: " +accountType + ", Savings Total :" +savingsTotal + "\n");
    }
}
class CurrentAccount extends BankAccounts{
    //method to deposit to Current Account
    @Override
    public void deposit(String accountType, double amount){
        currentTotal = currentTotal+ amount;
        System.out.println("Account Type: " +accountType + ", Current Total :" +currentTotal + "\n");
    }
}
