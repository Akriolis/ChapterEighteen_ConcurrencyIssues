public class RyanAndMonicaJob implements Runnable{
    private final String name;
    private final BankAccount account;
    private final int amountToSpend;

     RyanAndMonicaJob(String name, BankAccount account, int amountToSpend){
        this.name = name;
        this.account = account;
        this.amountToSpend = amountToSpend;
    }

    @Override
    public void run() {
        goShopping (amountToSpend);
    }

    private void goShopping (int amount){
        // you can lock an object for only one thread -  synchronized (account) {}
            if (account.getBalance() >= amount) {
                System.out.println(name + " is about to spend");
                account.spend(name, amount);
                System.out.println(name + " finishes spending");
            }
    }

}
