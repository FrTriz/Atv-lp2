package questao4;

import java.util.Scanner;
public class Questao4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe sua temperatura corporal:");
        double temp = teclado.nextDouble();

        if(temp > 37){
            System.out.println("O paciente está com febre.");
        }
        else{
            System.out.println("O paciente não está com febre.");
        }
    }
}

