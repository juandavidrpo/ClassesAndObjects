public class Restaurant {
    public String name;
    private int idEmployees;
    public String menu;
    protected float income;
    public boolean open;

    public Restaurant() {
    }

    public int getIdEmployees() {
        return idEmployees;
    }

    public void setIdEmployees(int idEmployees) {
        this.idEmployees = idEmployees;
    }

    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }
}
