public class BankAccount {
    private int accountNumber;
    protected boolean activated;
    private  String nameUser;
    private int idUser;
    private float balance;
    public String entity;

    public BankAccount(){
    }

    public BankAccount(int accountNumber, boolean activated, String nameUser, int idUser, float balance, String entity) {
        accountNumber = this.accountNumber;
        activated = this.activated;
        nameUser = this.nameUser;
        idUser = this.idUser;
        balance = this.balance;
        entity = this.entity;
    }

    public boolean getActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}

