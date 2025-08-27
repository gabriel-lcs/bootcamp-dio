
public class Main {
    public static void main(String[] args) {

        var value1 = 5;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("%d em binário é %s \n", value1, binary1);

        var value2 = 4;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("%d em binário é %s\n", value2, binary2);

        var result1 = value1 & value2;
        var binaryResult1 = Integer.toBinaryString(result1);

        var result2 = value1 | value2;
        var binaryResult2 = Integer.toBinaryString(result2);

        var result3 = value1 ^ value2;
        var binaryResult3 = Integer.toBinaryString(result3);

        var result4 = value1 << value2;
        // Empurra os binários para a esquerda do valor 1 a quantidede de vezes do valor 2
        var binaryResult4 = Integer.toBinaryString(result4);

        var result5 = value1 >> value2;
        // Empurra os binários para a direita do valor 1 a quantidede de vezes do valor 2
        var binaryResult5 = Integer.toBinaryString(result5);

        System.out.printf("%d & %d = %d (%s)\n",value1, value2, result1, binaryResult1);
        System.out.printf("%d | %d = %d (%s)\n",value1, value2, result2, binaryResult2);
        System.out.printf("%d ^ %d = %d (%s)\n",value1, value2, result3, binaryResult3);
        System.out.printf("%d << %d = %d (%s)\n",value1, value2, result4, binaryResult4);
        System.out.printf("%d >> %d = %d (%s)\n",value1, value2, result5, binaryResult5);

        }
    }