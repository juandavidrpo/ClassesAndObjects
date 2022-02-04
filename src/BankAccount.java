public class BankAccount {
    private int accountNumber;
    protected boolean activated;
    private  String nameUser;
    private int idUser;
    private float balance;
    public String entity;

    public BankAccount(){
    }

    public boolean getActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}

