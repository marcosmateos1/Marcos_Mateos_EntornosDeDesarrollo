public class MMI_Cuadrado {
    private int id;
    private double ladoA;
    private double ladoB;
    private String color;

    // Constructor con todos los argumentos (excepto id)
    public MMI_Cuadrado(double ladoA, double ladoB, String color) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.color = color;
    }

    // Getters
    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    @Override
    public String toString() {
        return "MMI_Cuadrado [ladoA=" + ladoA + ", ladoB=" + ladoB + ", color=" + color + "]";
    }
}
