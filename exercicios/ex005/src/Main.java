// Exercício 5 - Escreva um código onde o usuário entra com um número e seja gerada a tabuda de 1 até 10 desse número.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de entrada: ");
        int num = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d * %d = %d\n", num, i, num*i);
        }
    }
}