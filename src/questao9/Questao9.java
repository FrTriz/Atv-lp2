package questao9;

import java.util.Scanner;
public class Questao9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade de horas trabalhadas por mês:");
        double horas = teclado.nextDouble();

        System.out.println("Informe o valor de cada hora trabalhada:");
        double valor_H = teclado.nextDouble();

        System.out.println("Informe o percentual de desconto do INSS:");
        double inss = teclado.nextDouble();

        double salario_B = (horas*valor_H);
        double salario_L = salario_B - ((inss/100)*salario_B);

        System.out.println("O valor do salário líquido é: " + salario_L);
    }
}

