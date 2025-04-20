public class Main {
    public static void main(String[] args) {
        MMI_Cuadrado cuadrado1 = new MMI_Cuadrado(3, 3, "rojo");
        MMI_Circulo circulo1 = new MMI_Circulo(3, "verde");

        imprimirResultados(cuadrado1, circulo1);
    }

    public static double calcularAreaCuadrado(MMI_Cuadrado c) {
        return c.getLadoA() * c.getLadoB();
    }

    public static double calcularAreaCirculo(MMI_Circulo c) {
        return c.getRadio() * c.getRadio() * 3.14;
    }

    public static double calcularDiferencia(double area1, double area2) {
        return area1 - area2;
    }

    public static void imprimirResultados(MMI_Cuadrado cuadrado, MMI_Circulo circulo) {
        double areaCuadrado = calcularAreaCuadrado(cuadrado);
        double areaCirculo = calcularAreaCirculo(circulo);
        double diferencia = calcularDiferencia(areaCuadrado, areaCirculo);

        System.out.println("Área cuadrado: " + areaCuadrado);
        System.out.println("Área círculo: " + areaCirculo);
        System.out.println("Diferencia áreas: " + diferencia);
        System.out.println("Cuadrado: " + cuadrado);
        System.out.println("Círculo: " + circulo);
    }
}
