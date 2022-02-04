/**
 * Representa la clase de un restaurante.
 * @author Juan David Rojas.
 */
public class Restaurant {
    /**
     * Representa las variables de la clase Restaurant.
     */
    public String name;
    private int idEmployees;
    public String menu;
    protected float income;
    public boolean open;

    /**
     * Representa el constructor de la clase Restaurant.
     */
    public Restaurant() {
    }

    public Restaurant(String name, int idEmployees, String menu, float income, boolean open) {
        name = this.name;
        idEmployees = this.idEmployees;
        menu = this.menu;
        income = this.income;
        open = this.open;
    }

    /**
     * Permite retornar un valor de tipo int de la clase Restaurant por medio de un metodo.
     * @return idEmployees de la clase Restaurant.
     */
    public int getIdEmployees() {
        return idEmployees;
    }

    /**
     * Permite asignar un valor de tipo int a la clase Restaurant.
     * @param idEmployees a ingresar.
     */
    public void setIdEmployees(int idEmployees) {
        this.idEmployees = idEmployees;
    }

    /**
     * Permite retornar un valor de tipo float de la clase Restaurant por medio de un metodo.
     * @return income de la clase Restaurant.
     */
    public float getIncome() {
        return income;
    }

    /**
     * Permite asignar un valor de tipo float a la clase Restaurant.
     * @param income a ingresar.
     */
    public void setIncome(float income) {
        this.income = income;
    }
}
