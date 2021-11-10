import java.util.Scanner;

public class Practica2Ejercicio5 {

    public static void main(String[] args) {
        int totalmanzanas = 0;
        int maximo = 0;
        int i = 0;
        int quitas = 0;
        boolean turno = false;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido al juego de las mazanas");
        System.out.println("Con cuantas manzanas jugaremos");
        totalmanzanas = teclado.nextInt();
        System.out.println("Cuantas manzanas podremos quitar como máximo por turno?");
        maximo = teclado.nextInt();
        System.out.println("¿Quién empeiza? 1=Máquina 2=Humano");
        int primerturno = teclado.nextInt();
        if (primerturno == 1) {
            System.out.println("Me toca");
            turno = true;
        }
        do {
            do {
                if (turno == true) {
                    quitas = totalmanzanas - 1 % (maximo + 1);
                    if (quitas == 0)
                        quitas = 1;
                    System.out.println("He quitado:" + quitas);
                    totalmanzanas = totalmanzanas - quitas;
                    System.out.println("Quedan:" + totalmanzanas + " ¿Cuántas quitas?");
                } else {
                    quitas = teclado.nextInt();
                    totalmanzanas = totalmanzanas - quitas;
                    System.out.println("Quedan: " + totalmanzanas + " Me toca");
                }
                turno = !turno;
            } while (quitas > 0 && quitas <= maximo);
        } while (totalmanzanas > 0);
        if (turno = true)
            System.out.println("He perdido");
        else
            System.out.println("Has perdido");
    }
}