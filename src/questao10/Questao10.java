package questao10;

import java.util.Scanner;
public class Questao10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número:");
        double num1 = teclado.nextDouble();

        System.out.println("Informe outro número:");
        double num2 = teclado.nextDouble();

        double soma = num1+num2;

        if(soma >= 10){
            System.out.println("O valor da soma é:" + soma);
        }
        else{
            System.out.println("O valor da soma é menor que 10");
        }
    }
}
