package questao;
import com.sun.nio.sctp.SctpSocketOption;

import java.util.Scanner;
public class Questao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = teclado.next();

        System.out.println("Digite a sua idade:");
        int idade = teclado.nextInt();

        System.out.println("Digite seu peso:");
        double peso = teclado.nextDouble();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
    }
}
