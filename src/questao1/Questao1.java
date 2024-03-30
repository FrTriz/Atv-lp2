package questao1;

import java.util.Scanner;
public class Questao1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de horas trabalhadas no mês:");
        double horas = teclado.nextDouble();

        double salario = horas*20;

        System.out.println("O salário do operário por mês é: " + salario);
    }

}
