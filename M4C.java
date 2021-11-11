import java.util.Scanner;

public class M4C {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.print("Introduce una secuencia de números: ");
        String entrada = lee.nextLine();

        String resultado = "";

        if (!entrada.endsWith(" 0")) {
            resultado = "formato incorrecto la secuencia no termina en 0";
        } else {
            String[] numeros = entrada.split("\\s");

            if (numeros.length % 4 != 1) {
                resultado = "formato incorrecto la secuencia no es múltiplo de 4";
            } else {
                resultado = "Secuencia correcta";
                int i = 0;
                int suma = 1;
                int sumaOld = 0;
                while (i < numeros.length - 1) {
                    int numero = Integer.parseInt(numeros[i]);
                    if ((i + 1) % 4 == 0) {
                        if (suma < sumaOld) {
                            resultado = "formato incorrecto los valores-4p no estan ordenados correctamente";
                            break;
                        }
                        if (suma != numero) {
                            resultado = "formato incorrecto, el producto de los 3 numeros no es igual al valor 4P";
                            break;
                        }
                        sumaOld = suma;
                        suma = 1;
                    } else {
                        suma = suma * numero;
                    }
                    i++;
                }
            }
        }

        System.out.println(resultado);
    }
}
