package AryanATM;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Account{
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    /*set the customer number */

    public int setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
        return customerNumber;
    }
    /*Get the customer number */
    public int getCustomerNumber(){
        return customerNumber;
    }
   /*Set the pin number*/
    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    /* get the pin number*/
    public int getpinNUmber(){
        return pinNumber;
    }

    /*get checking account balance*/
    public double getCheckingBalance(){
        return checkingBalance;
    }
    /*Get saving account balance*/
    public double getSavingBalance(){
        return savingBalance;

    }
    /*Calculate Checking Account Withdraw*/
    public double calcCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance -amount);
        return checkingBalance;
    }
    /* Calculate Saving account withdrawl*/
    public double calcSavingWithdraw(double amount){
        savingBalance = ( savingBalance - amount);
        return savingBalance;
    }
    /*Calculate saving account deposite*/
    public double calcSavingDeposite(double amount)
    {
         savingBalance = (savingBalance + amount);
        return savingBalance;
    }
    public double calccheckingDeposit(double amount)
    {
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }
    /*Customer Checking Account withDraw input*/
    public void getCheckingWithdrawInput(){
        System.out.println("Checeking Account Balance" + moneyFormat.format(getCheckingBalance()));
        System.out.println("Amount you want to withdraw from checking Amount");
        double amount = menuInput.nextDouble();

        if((checkingBalance - amount)>=0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account balance" +moneyFormat.format(getCheckingBalance()));
        } else{
            System.out.println("Balance cannnot be negative"+ "\n");
        }
    }
    /*Customer Scving Acount withdraw input*/
    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance" + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from saving Amount");

        double amount = menuInput.nextDouble();
        if((checkingBalance - amount)>=0){
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account balance " + savingBalance +"\n");
        } else{
            System.out.println("Balance cannnot be negative"+ "\n");
        }
}
 public void getCheckingDepositInput(){
     System.out.println("Checeking Account Balance" + moneyFormat.format(checkingBalance ));
     System.out.println("Amount you want to withdraw from checking Amount");
     double amount = menuInput.nextDouble();
     if((checkingBalance + amount)>=0){
         calccheckingDeposit(amount);
         System.out.println("New Checking Account balance " + moneyFormat.format(checkingBalance) +"\n");
     } else{
         System.out.println("Balance cannnot be negative"+ "\n");
     }
    }
    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance" + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to deposite from saving Amount");
        double amount = menuInput.nextDouble();

        if((savingBalance + amount)>=0){
            calcSavingDeposite(amount);
            System.out.println("New Saving Account balance " + moneyFormat.format(savingBalance) +"\n");
        } else{
            System.out.println("Balance cannnot be negative"+ "\n");
        }
    }

    private int customerNumber;
    private int pinNumber;
    private double checkingBalance=0;
    private double savingBalance=0;

}