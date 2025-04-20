public class Main {
    public static void main(String[] args) {

        // Instanciamos un cuadrado y un círculo
        Circulo circulo1 = new Circulo(3, "verde");
        Cuadrado cuadrado1 = new Cuadrado(3, 3, "rojo");

        // Calcula área cuadrado LadoA * LadoB
        double ladoA = cuadrado1.getLadoA();
        double ladoB = cuadrado1.getLadoB();
        double area1 = ladoA * ladoB;
        System.out.println("Área cuadrado: " + area1);

        // Calcula área círculo pi*R²
        double radio1 = circulo1.getRadio();
        double area2 = radio1 * radio1 * 3.14;
        System.out.println("Área círculo: " + area2);

        // Diferencia entre áreas
        double diferencia = area1 - area2;
        System.out.println("Diferencia áreas: " + diferencia);

        // Imprimir datos
        System.out.println("Cuadrado: " + cuadrado1);
        System.out.println("Círculo: " + circulo1);
        System.out.println("Diferencia: " + diferencia);
    }
}
