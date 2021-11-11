import java.util.Scanner;

public class SRE {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una secuencia de números: ");
        String entrada = teclado.nextLine();
        String resultado = "";
        String[] numeros = entrada.split("\\s");

        if (numeros.length <= 3) {
            resultado = "NO ES una serie rítmica de enteros";
        } else {
            int numero1 = Integer.parseInt(numeros[0]);
            int numero2 = Integer.parseInt(numeros[1]);

            int i = 2;

            while (i < numeros.length - 1) {
                if (resultado == "") {
                    int numero = Integer.parseInt(numeros[i]);
                    if ((numero1 >= numero && numero2 <= numero) || (numero2 >= numero && numero1 <= numero)) {
                        numero1 = numero2;
                        numero2 = numero;
                        i++;
                    } else {
                        resultado = "NO ES una serie rítmica de enteros";
                    }
                }
            }

            if (resultado == "") {
                int numero = Integer.parseInt(numeros[i]);
                if (numero != 0) {
                    resultado = "NO ES una serie rítmica de enteros";
                } else {
                    resultado = "ES una serie rítmica de enteros";

                }
            }

        }

        System.out.println(resultado);
    }
}
