import java.util.Scanner;
public class BankTest {
    static void main() {
        Scanner scanner =new Scanner(System.in);
        Bank bank = new Bank("Emma", 10000.0);

        int choice = 0;
        do {

            System.out.println("=====BANK APP====");
            System.out.println("1. Check Balance ");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");

            System.out.println("Enter one operation you want to perform");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    bank.checkBalance();
                    break;
                case 2:
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    bank.withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("Enter Transfer amount: ");
                    double transferAmount = scanner.nextDouble();
                    bank.transfer(transferAmount);
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice from 1-5.");
            }
        }
        while (choice != 5);
    }

}
