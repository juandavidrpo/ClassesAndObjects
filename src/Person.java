import java.util.Date;

public class Person {
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
    private int idNumber;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
}

