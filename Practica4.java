import java.util.Scanner;

public class Practica4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Num: ");

        int num = keyboard.nextInt();

        System.out.print("(" + num + " %9)=" + num % 9 + " ");

        while (num >= 10) {
            int num2 = num;
            int sum = 0;
            System.out.print("(");
            while (num2 >= 10) {
                System.out.print(num2 % 10);
                sum = sum + (num2 % 10);
                num2 = num2 / 10;
                System.out.print("+");
            }
            sum = sum + num2;
            System.out.print("" + num2 + ") % 9 = " + sum);
            num = num2;
            System.out.print(" % 9 = ");
        }

        System.out.print(num % 9);

    }

}
