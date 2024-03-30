package questao8;

import java.util.Scanner;
public class Questao8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o raio da circunferência em centímetros:");
        double raio = teclado.nextInt();

        double area = 3.14*(raio*raio);

        System.out.println("A área da circunferência é de " + area + "cm");

    }
}
