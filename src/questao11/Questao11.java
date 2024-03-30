package questao11;

import java.util.Scanner;
public class Questao11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número:");
        double num1 = teclado.nextDouble();

        System.out.println("Informe outro número:");
        double num2 = teclado.nextDouble();

        double soma = num1+num2;

        if(soma >= 10){
            double num3 = soma + 5;
            System.out.println("O valor do novo número é:" + num3);
        }
        else{
            double num3 = soma - 7;
            System.out.println("O valor do novo número é:" + num3);
        }
    }
}
