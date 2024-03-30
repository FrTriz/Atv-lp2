package questao6;

import java.util.Scanner;
public class Questao6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a nota da prova 1:");
        double prova1 = teclado.nextDouble();

        System.out.println("Informe a nota da prova 2:");
        double prova2 = teclado.nextDouble();

        System.out.println("Informe a nota do trabalho:");
        double trab = teclado.nextDouble();

        double media = (prova1 + prova2 + trab)/3;

        if(media >= 7 ){
            System.out.println("o aluno está aprovado.");
        }
        else{
            System.out.println("O aluno está reprovado.");
        }
    }
}

