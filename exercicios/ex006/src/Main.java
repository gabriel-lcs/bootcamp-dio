// Exercício 6 - Escreva um código onde o usuário entra com sua altura e peso, seja feito o cálculo do seu IMC e seja exibido a seguinte mensagem de acordo com resultado.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual seu peso?Kg ");
        float peso = scanner.nextFloat();

        System.out.print("Qual sua altura?M ");
        float altura = scanner.nextFloat();

        float imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.printf("Seu IMC deu %.2f. Abaixo do peso", imc);
        } else if (imc > 18.5 && imc < 25) {
            System.out.printf("Seu IMC deu %.2f. Peso Ideal", imc);
        } else if (imc >= 25 && imc < 30) {
            System.out.printf("Seu IMC deu %.2f. Levemente acima do peso", imc);
        } else if (imc >= 30 && imc < 35) {
            System.out.printf("Seu IMC deu %.2f. Obesidade Grau I", imc);
        } else if (imc >= 35 && imc < 40) {
            System.out.printf("Seu IMC deu %.2f. Obesidade Grau II (Severa)", imc);
        } else {
            System.out.printf("Seu IMC deu %.2f. Obesidade III (Mórbida)", imc);
        }

    }
}