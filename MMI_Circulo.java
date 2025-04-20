public class MMI_Circulo {
    private int id;
    private double radio;
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    private String color;
    public MMI_Circulo(int id, double radio, String color) {
        this.id = id;
        this.radio = radio;
        this.color = color;
    }

    // Aquí van los constructores, getters/setters y toString
    
}
