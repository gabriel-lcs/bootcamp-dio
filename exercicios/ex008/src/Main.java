//Exercício 8 - Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = scanner.nextInt();

        while (true){
            System.out.print("Digite outro número: ");
            int n2 = scanner.nextInt();

            if (n2 < n1){
                System.out.println("Número inválido. Muito pequeno!");
                continue;
            }

            System.out.printf("%s %% %s = %s\n", n2, n1, n2 % n1);
            if (n2 % n1 != 0){
                break;
            }
        }
        System.out.println("Programa finalizado");
    }
}