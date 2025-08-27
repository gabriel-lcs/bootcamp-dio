import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe sua idade: ");
        int age = scanner.nextInt();

        if (age == 18){
            System.out.printf("%s você preicsa se apresentar no exército", nome);
        } else if (age > 18){
            System.out.println("Você já passou da hora de se apresentar no exército");
        } else {
            System.out.println("Ainda não está na hora de se apresentar");
        }
    }
}