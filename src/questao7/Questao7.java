package questao7;

import java.util.Scanner;
public class Questao7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe sua altura em metros:");
        double altura = teclado.nextDouble();

        System.out.println("Informe seu peso:");
        double peso = teclado.nextDouble();

        double imc = peso/(altura*2);

        if(imc > 30){
            System.out.println("o paciente está obeso.");
        }
        else{
            System.out.println("O paciente não está obeso.");
        }
    }
}

