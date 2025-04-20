public class MMI_Circulo {
    private int id;
    private double radio;
    private String color;

    // Constructor con todos los argumentos (excepto id)
    public MMI_Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    // Getter
    public double getRadio() {
        return radio;
    }

    @Override
    public String toString() {
        return "MMI_Circulo [radio=" + radio + ", color=" + color + "]";
    }
}
