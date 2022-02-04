/**
 * Representa la clase de una cuenta de banco.
 * @author Juan David Rojas.
 */
public class BankAccount {
    /**
     * Representa las variables de la clase BankAccount.
     */
    private int accountNumber;
    protected boolean activated;
    private  String nameUser;
    private int idUser;
    private float balance;
    public String entity;

    /**
     * Representa el constructor de la clase BankAccount.
     */
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

    /**
     * Permite retornar un valor de tipo boolean de la clase BankAccount por medio de un metodo.
     * @return activated de la clase BankAccount.
     */
    public boolean getActivated() {
        return activated;
    }

    /**
     * Permite asignar un valor de tipo boolean a la clase BankAccount.
     * @param activated a ingresar.
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}

