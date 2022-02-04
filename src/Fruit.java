public class Fruit {
    public String name;
    private float averageWeight;
    public String[] colors;

    public Fruit() {
    }

    public Fruit(String name, float averageWeight, String[] colors) {
        name = this.name;
        averageWeight = this.averageWeight;
        colors = this.colors;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }
}

