public class ClassesChallenge {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println(account.getCustomerName());
        account.setBalance(100);
        System.out.println(account.getBalance());
        account.deposit(12);
        System.out.println(account.getBalance());
        account.withdraw(13);
        System.out.println(account.getBalance());
    }
}
