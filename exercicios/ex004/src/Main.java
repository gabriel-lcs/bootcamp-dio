// Exercício 4 - Escreva um código que recebe o nome e a idade de duas pessoas e imprima a diferença de idade entre elas.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome da primeira pessoa: ");
        var nome1 = scanner.next();
        System.out.print("Idade da primeira pessoa: ");
        var idade1 = scanner.nextInt();

        System.out.print("Nome da segunda pessoa: ");
        var nome2 = scanner.next();
        System.out.print("Idade da segunda pessoa: ");
        var idade2 = scanner.nextInt();

        System.out.printf("A diferença da idade entre %s e %s é %d anos.", nome1, nome2, idade1 - idade2);


    }
}