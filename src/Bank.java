public class Bank {
    private String customerName;
    private double balance;

    public Bank(String customerName,double balance){
        this.customerName=customerName;
        this.balance=balance;
    }
    public String getCustomerName(){
        return customerName;
    }

    public double getBalance() {
        return balance;
    }
    public void checkBalance(){
        System.out.println("Account balance is : " + balance);
    }
    public void deposit(double amount){
        if(amount > 0){
            balance = balance+ amount;
            System.out.println("New balance is : "+ balance);
        }
        else {
            System.out.println("Deposit amount should be more than 0. ");
        }
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance = balance - amount;
            System.out.println("Withdrawal successful ");
            System.out.println("new balance is : "+ balance);
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
    public void transfer(double amount){
        if(amount > 0 && amount <= balance){
            balance = balance - amount;
            System.out.println("transfer successful");
            System.out.println("New balance is : " + balance);
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

}
