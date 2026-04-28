import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        double  a, b, c, delta;
        double x1, x2;

        System.out.print("a ---> ");
        a = sc.nextDouble();

        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau!");
        }
        else {
            System.out.print("b ---> ");
            b = sc.nextDouble();
            System.out.print("c ---> ");
            c = sc.nextDouble();
            delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Equação não tem raiz real");
            }
            else {
                x1 = (-b +Math.sqrt(delta))/(2 * a);
                x2 = (-b -Math.sqrt(delta))/(2 * a);
                System.out.printf("x1 = %.2f", x1);
                System.out.println("");
                System.out.printf("x2 = %.2f", x2);
            }
        }
    }
}
