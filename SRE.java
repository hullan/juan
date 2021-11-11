import java.util.Scanner;

public class SRE {
    public static void main(String[] args) {

        Scanner lee = new Scanner(System.in);
        System.out.print("Introduce una secuencia de números: ");
        String entrada = lee.nextLine();

        String resultado = "ES una serie rítmica de enteros";
        if (!entrada.endsWith(" 0")) {
            resultado = "NO ES una serie rítmica de enteros";
        } else {
            String[] numeros = entrada.split("\\s");

            if (numeros.length <= 3) {
                resultado = "NO ES una serie rítmica de enteros";
            } else {
                int num1 = Integer.parseInt(numeros[0]);
                int num2 = Integer.parseInt(numeros[1]);

                int i = 2;

                while (i < numeros.length - 1) {
                    int num = Integer.parseInt(numeros[i]);
                    if ((num1 >= num && num2 <= num) || (num2 >= num && num1 <= num)) {
                        num1 = num2;
                        num2 = num;
                        i++;
                    } else {
                        resultado = "NO ES una serie rítmica de enteros";
                        break;
                    }
                }
            }

        }

        System.out.println(resultado);
    }
}
