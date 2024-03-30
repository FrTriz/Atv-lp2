package questao3;

import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe sua idade:");
        int idade = teclado.nextInt();

        if(idade < 18){
            System.out.println("O usuário não pode tirar a carteira de motorista.");
        }
        else{
            System.out.println("O usuário pode tirar a carteira de motorista.");
        }
    }
}
