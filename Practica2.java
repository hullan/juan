import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.println("Introduce un valor para la aproximación=>");
        double x = lee.nextDouble();
        newton n1 = new newton(x);
        double r = n1.calcRaiz();
        System.out.println("Raiz=" + r);
    }
}
