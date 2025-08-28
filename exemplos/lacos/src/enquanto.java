import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.util.Scanner;

public class enquanto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = " ";
        while (true){
            System.out.println("Informe um nome: ");
            name = scanner.nextLine();

            if (name.equalsIgnoreCase("Exit")){
                break;
            }

            System.out.println(name);
        }

    }
}
