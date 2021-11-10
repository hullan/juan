import java.util.Random;
import java.util.Scanner;

public class JuegoDeManzanas {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("* Juego de las manzanas *");
        System.out.println("**************************");

        System.out.print("Empiezo yo (S/N): ");
        String empieza = keyboard.next();
        System.out.print("Total manzanas en el cesto: ");
        int totalManzanas = keyboard.nextInt();
        System.out.print("Máximo a quitar por turno: ");
        int manzanasturno = keyboard.nextInt();

        while (totalManzanas > 0) {
            if (manzanasturno > totalManzanas) {
                manzanasturno = totalManzanas;
            }
            if ("S".equals(empieza)) {
                System.out.print("¿Cuantas quitas?");
                int quitas = keyboard.nextInt();
                if (quitas > 0 && quitas <= manzanasturno) {
                    totalManzanas = totalManzanas - quitas;
                    System.out.println("Quedan " + totalManzanas);
                    empieza = "N";
                }

            } else {
                int quitas = (totalManzanas - 1) % (manzanasturno + 1);
                if (quitas == 0) {
                    quitas = 1;
                }
                totalManzanas = totalManzanas - quitas;
                System.out.println("Quito " + quitas + " y quedan " + totalManzanas);
                empieza = "S";
            }

        }

        if ("S".equals(empieza)) {
            System.out.print("Has ganado");
        } else {
            System.out.print("Has perdido");
        }
    }
}
