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

    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height, int idNumber) {
        name = this.name;
        lastName1 = this.lastName1;
        lastName2 = this.lastName2;
        dateBirth = this.dateBirth;
        height = this.height;
        idNumber = this.idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
}

