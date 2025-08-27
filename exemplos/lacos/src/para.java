import java.util.Scanner;

public class para {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 10; i += 2){
            System.out.println(i);
        }
        for (; ; ) {
            System.out.println("Digite algo: ");
            String algo = scanner.nextLine();

            if (algo.equalsIgnoreCase("Exit")){
                break;
            }
        }

        System.out.println("Fim do programa");
    }
}