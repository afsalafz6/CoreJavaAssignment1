package assignment4_Exception;

import java.util.Scanner;

public class InsufficiantBalance_Exception {

    public static void main(String[] args) {
        double accountBalance,withdrawAmount, depositAmount;

        Scanner dep = new Scanner(System.in);
        System.out.println("Enter the Amount to Deposit :");
        depositAmount = dep.nextDouble();

        accountBalance =+ depositAmount;


        System.out.println("Your Account Balance is "+ accountBalance);

        Scanner wid = new Scanner(System.in);
        System.out.println("Enter the Amount to Withdraw :");
        withdrawAmount = wid.nextDouble();

        try {
            if(withdrawAmount <= 0){
                throw new IllegalBankTransactionException("Entered Withdraw Amount is Invalid");
            } else {
                if (withdrawAmount > accountBalance) {
                    throw new InsufficientBalanceException("INSUFFICIENT BALANCE");
                } else {
                    accountBalance = -withdrawAmount;
                    System.out.println("Your Account Balance iss " + accountBalance);
                }
            }
        } catch (InsufficientBalanceException e){
            e.printStackTrace();
        } catch (IllegalBankTransactionException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Your Account Balance is "+ accountBalance);
        }
    }
}

class InsufficientBalanceException extends Exception {

    String message;

    public InsufficientBalanceException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}

class IllegalBankTransactionException extends Exception {

    String message;

    public IllegalBankTransactionException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
