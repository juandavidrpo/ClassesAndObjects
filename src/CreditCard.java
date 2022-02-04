/**
 * Importa la libreria de java que permite usar un tipo de dato Date.
 */
import java.util.Date;

/**
 * Representa la clase de una tarjeta de credito.
 * @author Juan David Rojas.
 */
public class CreditCard {
    /**
     * Representa las variables de la clase CreditCard.
     */
    public String entity;
    private int number;
    private String user;
    private Date expirationDate;
    protected boolean activated;

    /**
     * Representa el constructor de la clase CreditCard.
     */
    public CreditCard() {
    }

    public CreditCard(String entity, int number, String user, Date expirationDate, boolean activated) {
        entity = this.entity;
        number = this.number;
        user = this.user;
        expirationDate = this.expirationDate;
        activated = this.activated;
    }

    /**
     * Permite retornar un valor de tipo numero de la clase CreditCard por medio de un metodo.
     * @return número de la clase CreditCard.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Permite asignar un valor de tipo numero a la clase CreditCard.
     * @param number a ingresar.
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Permite retornar un valor de tipo string de la clase CreditCard por medio de un metodo.
     * @return user de la clase CreditCard.
     */
    public String getUser() {
        return user;
    }

    /**
     * Permite asignar un valor de tipo string a la clase CreditCard.
     * @param user a ingresar.
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * Permite retornar un valor de tipo date de la clase CreditCard por medio de un metodo.
     * @return expirationDate de la clase CreditCard.
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * Permite asignar un valor de tipo date a la clase CreditCard.
     * @param expirationDate a ingresar.
     */
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * Permite retornar un valor de tipo boolean de la clase CreditCard por medio de un metodo.
     * @return activated de la clase CreditCard.
     */
    public boolean getActivated() {
        return activated;
    }

    /**
     * Permite asignar un valor de tipo boolean a la clase CreditCard.
     * @param activated a ingresar.
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
