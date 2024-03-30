package questao5;

import java.util.Scanner;
public class Questao5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número:");
        int num1 = teclado.nextInt();

        System.out.println("Informe outro número:");
        int num2 = teclado.nextInt();

        if(num1 < num2){
            System.out.println(num2 + " é maior que " + num1);
        }
        else if(num2 < num1){
            System.out.println(num1 + " é maior que " + num2);
        }
        else{
            System.out.println(num1 + " é igual a " + num2);
        }
    }
}

