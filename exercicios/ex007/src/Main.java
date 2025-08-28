// Exercício 7 - Escreva um código que o usuário entre com o primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os número pares ou ímpares (de acordo com a seleção inicial) no intervalos de números informados, incluindo os número informados em ordem decrescente.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int n1 = scanner.nextInt();
        int n2 = 0;

        while (true){
            System.out.print("Segundo número: ");
            n2 = scanner.nextInt();

            if (n2 > n1){
                break;
            }

            System.out.println("Número inválido, escolha um número maior que " + n1);
        }

        System.out.print("Escolha entre ímpar ou par [I/P]: ");
        String option = scanner.next();

        System.out.printf("%d ",n2);
        for (int i = n2 - 1; i > n1; i--){
            if (option.equalsIgnoreCase("p")){
                if (i % 2 == 0){
                    System.out.printf("%d ",i);
                }
            } else if (option.equalsIgnoreCase("i")) {
                if (i % 2 != 0) {
                    System.out.printf("%d ",i);
                }
            }
        }
        System.out.printf("%d ",n1);
    }
}