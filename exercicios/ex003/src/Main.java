// Exercício 3 - Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na rela.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Base do retângulo: ");
        var base = scanner.nextFloat();

        System.out.print("Altura do retângulo: ");
        var altura = scanner.nextFloat();

        System.out.printf("A área de um retângulo com %.1f de base e %.1f de altura é: %.1f", base, altura, base * altura);
    }
}
