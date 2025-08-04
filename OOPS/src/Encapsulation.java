
    class Account {
        private String accountholder;
        private double balance;

        public String getAccountholder() {
            return accountholder;
        }

        public void setAccountholder(String accountholder) {
            this.accountholder = accountholder;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited amount is " + amount + " and total balance is " + balance);
            }else {
                System.out.println("Invalid amount");
            }
        }

        public void withdraw(double amount) {
           if (amount>0){
               balance -= amount;
               System.out.println("Withdrawn amount is " + amount + " and total balance is " + balance);
           }
           else {
               System.out.println("Invalid Amount");
           }
        }
    }
    public class Encapsulation {
        public static void main(String[] args) {
            Account account = new Account();
            account.setAccountholder("Abhishek");
            account.deposit(10000);
            account.withdraw(-2000);
            account.deposit(-2000);
    }
}
