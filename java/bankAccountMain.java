import java.lang.*;
import java.util.*;

class Account{
    String holder_name;
    int ac_num;
    String ac_type;
    double balance;

    Account(){
        holder_name = "XXXXXX";
        ac_num = 1000099;
        ac_type = "Savings";
        balance = 0;
    }

    void setVal(String h_name, int a_number, String a_type, double blnc){
        holder_name = h_name;
        ac_num = a_number;
        ac_type = a_type;
        balance = blnc;
    }

    void depositMoney(double depo_amount){
        System.out.println("Amount deposited: "+depo_amount);
        balance = balance + depo_amount;
        System.out.println("Total balance: "+balance);
        System.out.println("Thanks for banking with us!");
    }

    void withdrawMoney(double withdraw_amount){
        if (withdraw_amount > balance){
            System.out.println("Withdrawal request rejected!");
            System.out.println("Thanks for banking with us!");
        }
        else{
            System.out.println("Amount withdrawn: "+withdraw_amount);
            balance = balance - withdraw_amount;
            System.out.println("Total balance: "+balance);
            System.out.println("Thanks for banking with us!");
        }
    }

    void displayDetails(){
        System.out.println("A/c Holder Name: "+holder_name);
        System.out.println("A/c Number: "+ac_num);
        System.out.println("A/c type: "+ac_type);
        System.out.println("A/c balance: "+balance);
        System.out.println("Thanks for banking with us!");
    }
}

class BankAccountMain{
    public static void main(String[] args){
        Account account1 = new Account();
        int ch;
        System.out.println("Menu:\n1.Assign initial value to the account\n2.Deposit money\n3.Withdraw money\n4.Display account details\n5.Exit");
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            sc.nextLine();
            switch(ch){
                case 1:
                    String h_name;
                    int a_number;
                    String a_type;
                    double blnc;
                    System.out.println("Enter the name of A/c holder:");
                    h_name = sc.nextLine();
                    System.out.println("Enter the A/c number:");
                    a_number = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter A/c type:");
                    a_type = sc.nextLine();
                    System.out.println("Enter opening balance:");
                    blnc = sc.nextDouble();
                    account1.setVal(h_name, a_number, a_type, blnc);
                    break;

                case 2:
                    double depo_amount;
                    System.out.println("Enter the amount to deposit:");
                    depo_amount = sc.nextDouble();
                    account1.depositMoney(depo_amount);
                    break;
                
                case 3:
                    double withdraw_amount;
                    System.out.println("Enter amount to withdraw: ");
                    withdraw_amount = sc.nextDouble();
                    account1.withdrawMoney(withdraw_amount);
                    break;

                case 4:
                    account1.displayDetails();
                    break;

                case 5:
                    System.exit(0);

                sc.close();
            }
        }
    }
}
