import java.util.Scanner;

class ATM{
    float Balance;
    int PIN = 4682;

    public void checkpin(){
        System.out.println("Enter you PIN: ");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if(enteredPin == PIN){
            menu();
        }
        else {
            System.out.println("Please Enter valid PIN");
        }
    }
    public void menu(){
        System.out.println("Enter your choice :");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT ");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
         if(opt == 1){
             checkBal();
         } else if (opt==2) {
             withdrawMoney();

         } else if (opt == 3) {
             depositMoney();

         } else if (opt==4) {
            return;
         }
         else {
             System.out.println("Please enter a valid choice");
         }
    }

    public void checkBal(){
        System.out.println("Balance : " +Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter your amount :");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance !");
        }
        else {
            Balance = Balance-amount;
            System.out.println("Withdraw Money Successfully !");
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter Amount for Deposit:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance+amount;
        System.out.println("Amount Deposit Successfully!");
        menu();

    }

}

public class ATMMACHINE {

    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();

    }
}
