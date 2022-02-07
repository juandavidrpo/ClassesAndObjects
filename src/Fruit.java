/**
 * Se importa la libreria que permite usar ArrayList.
 */
import java.util.ArrayList;

/**
 * Representa la clase de fruta.
 * @author Juan David Rojas.
 */
public class Fruit {
    /**
     * Representa las variables de la clase Fruit.
     */
    public String name;
    private float averageWeight;
    public ArrayList<String> colors = new ArrayList<String>();

    /**
     * Representa el constructor de la clase Fruit.
     */
    public Fruit() {
    }

    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        name = this.name;
        averageWeight = this.averageWeight;
        colors = this.colors;
    }

    /**
     * Permite retornar un arreglo de tipo string de la clase Fruit por medio de un metodo.
     * @return colors de la clase Fruit.
     */
    public ArrayList<String> colors() {
        return colors;
    }

    /**
     * Permite asignar un arreglo de tipo string a la clase Fruit.
     * @param colors a ingresar.
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}

