package AryanATM;
// main class
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class option extends Account{
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    /* validate the login information customer number and pin number*/
    public void getLogin() throws IOException {
        int x = 1;
        do {
            try{
                data.put(9876543, 9876);
                data.put(8989898, 1890);
                System.out.println("Welcome to my ATM project");

                System.out.println("Enter your customer number");
                setCustomerNumber(menuInput.nextInt());

                System.out.println("Enter your pin number");
                setPinNumber(menuInput.nextInt());
            }
            catch (Exception e) {
                System.out.println("\n"+"Invalid Character(s). Only numbers." +"\n");
                x=2;
            }
            for (Map.Entry<Integer, Integer> entry: data.entrySet()){
                if(entry.getKey() == getCustomerNumber() && entry.getValue()==getpinNUmber()){
                    getAccountType();
                }
            }
            System.out.println("\n"+ "Wrong customer Number or pin Number" +"\n");
        }while (x==1);
    }

    /*Display Account Type Menu with selection */

    public void getAccountType(){
        System.out.println("Select the Account you want to access:");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");

       int selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                 getChecking();
                 break;
            case 2 :
                getSaving();
            case 3:
                System.out.println("Thank you for trusting us");
                break;
            default:
                System.out.println("\n" + "Invalid Choice" +"\n");
                getAccountType();
        }
    }
    /* Display Checking Account Menu wuth Selection*/

    public void getChecking(){
        System.out.println("Checking Account: ");
        System.out.println("Type 1 -View Balance");
        System.out.println("Type 2 -WithDraw Funds");
        System.out.println("Type 3 -Deposite Funds");
        System.out.println("Type 4 -Exit");
        System.out.println("Choice :");

       int selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Checking Account Balance"+ moneyFormat.format(getCheckingBalance()));
                break;
            case 2 :
                getCheckingWithdrawInput();
                getAccountType();
                break;

            case 3:
               getCheckingDepositInput();
               getAccountType();
                break;
            case 4 :
                System.out.println("Thank you for using this ATM , bye");
            default :
                System.out.println("\n" + "Invalid choice"+ "\n");
                getChecking();
        }
    }
    public void getSaving(){
        System.out.println("Checking Account: ");
        System.out.println("Type 1 -View Balance");
        System.out.println("Type 2 -WithDraw Funds");
        System.out.println("Type 3 -Deposite Funds");
        System.out.println("Type 4 -Exit");
        System.out.println("Choice :");

        int selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Saving Account Balance"+ moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2 :
                getSavingWithdrawInput();
                getAccountType();
                break;

            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            default :
                System.out.println("\n" + "Invalid choice"+ "\n");
                getSaving();
        }
    }
}


