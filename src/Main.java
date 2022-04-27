import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double dato;
        System.out.println("Hello world!");
        Scanner radio = new Scanner(System.in);
        dato = radio.nextDouble();



        Esfera esfera = new Esfera(dato);
        System.out.println("Radio" + esfera.getRadio());
        System.out.println("Radio" + esfera.getDiametro());
        System.out.println("Radio" + esfera.getArea());
        System.out.println("Radio" + esfera.getCircunferencia());
        System.out.println("Radio" + esfera.getDiametro());
        System.out.println("Radio" + esfera.getVolumen());


    }
}