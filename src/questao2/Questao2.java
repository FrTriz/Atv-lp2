package questao2;

import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a distância que será percorrida em quilometros:");
        double km = teclado.nextDouble();

        System.out.println("Digite o preço do litro da gasolina:");
        double preco_G = teclado.nextDouble();

        double quant_G = km/12;
        double custo = quant_G*preco_G;

        System.out.println("Para a distância de " + km + "km, será utilizado " + quant_G + "litros com custo de " + custo + "reais.");

    }
}
