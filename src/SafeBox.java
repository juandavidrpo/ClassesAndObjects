/**
 * Representa la clase de una caja fuerte.
 * @author Juan David Rojas.
 */
public class SafeBox {
    /**
     * Representa las variables de la clase SafeBox.
     */
    public String material;
    protected String content;
    private int password;
    private boolean key;

    /**
     * Representa el constructor de la clase SafeBox.
     */
    public SafeBox() {
    }

    public SafeBox(String material, String content, int password, boolean key) {
        material = this.material;
        content = this.content;
        password = this.password;
        key = this.key;
    }

    /**
     * Permite retornar un valor de tipo string de la clase SafeBox por medio de un metodo.
     * @return content de la clase SafeBox.
     */
    public String getContent() {
        return content;
    }

    /**
     * Permite asignar un valor de tipo string a la clase SafeBox.
     * @param content a ingresar.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Permite retornar un valor de tipo int de la clase SafeBox por medio de un metodo.
     * @return password de la clase SafeBox.
     */
    public int getPassword() {
        return password;
    }

    /**
     * Permite asignar un valor de tipo int a la clase SafeBox.
     * @param password a ingresar.
     */
    public void setPassword(int password) {
        this.password = password;
    }

    /**
     * Permite retornar un valor de tipo boolean de la clase SafeBox por medio de un metodo.
     * @return key de la clase SafeBox.
     */
    public boolean getKey() {
        return key;
    }

    /**
     * Permite asignar un valor de tipo boolean a la clase SafeBox.
     * @param key a ingresar.
     */
    public void setKey(boolean key) {
        this.key = key;
    }
}
