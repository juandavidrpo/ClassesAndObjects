/**
 * Importa la libreria de java que permite usar un tipo de dato Date.
 */
import java.util.Date;

/**
 * Representa la clase de una persona.
 * @author Juan David Rojas.
 */
public class Person {
    /**
     * Representa las variables de la clase Person.
     */
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
    private int idNumber;

    /**
     * Representa el constructor de la clase Person.
     */
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

    /**
     * Permite retornar un valor de tipo string de la clase Person por medio de un metodo.
     * @return nombre de la clase Person.
     */
    public String getName() {
        return name;
    }

    /**
     * Permite asignar un valor de tipo string a la clase Person.
     * @param name a ingresar.
     */
    public void setName (String name) {
        this.name = name;
    }
}

