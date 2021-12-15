public class Main {
    public static void main (String[] args ){
        BankAccount thoybur = new BankAccount("Thoybur" , 2000);
        System.out.println(thoybur.getBalance());
        thoybur.deposit(1000);
        System.out.println(thoybur.getBalance());
        thoybur.getOnwer();
        thoybur.withdraw(500);
        System.out.println(thoybur.getBalance());

    }


}
