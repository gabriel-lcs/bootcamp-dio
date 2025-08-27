// Exercício 1 - Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá:'Fulano' você tem 'X' anos".

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o seu nome? ");
        String nome  = scanner.next();

        System.out.print("Em que ano você nasceu? ");
        int ano = scanner.nextInt();

        int idade = OffsetDateTime.now().getYear() - ano;

        System.out.printf("Olá %s você tem %d anos.", nome, idade);
    }
}
