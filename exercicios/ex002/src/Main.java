// Exercício 2 - Escreva um código que receba o tamanho do lado de um quadraro, calcule sua área e exiba na tela.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lado do quadrado: ");
        var lado = scanner.nextFloat();

        System.out.printf("A área do quadrado é: %.1f", Math.pow(lado, 2));
    }
}