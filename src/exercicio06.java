import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v1, v2, v3;

        System.out.println("Digite três valores --> ");
        v1 = sc.nextInt();
        v2 = sc.nextInt();
        v3 = sc.nextInt();

        if (v1 != v2 && v1 != v3 && v3 != v2) {
            if (v1 < v2 && v1 < v3 && v2 < v3) {
                System.out.println(v1);
                System.out.println(v2);
                System.out.println(v3);
            } else if (v1 < v2 && v3 < v2 && v1 < v3) {
                System.out.println(v1);
                System.out.println(v3);
                System.out.println(v2);
            } else if (v2 < v1 && v2 < v3 && v3 < v1) {
                System.out.println(v2);
                System.out.println(v3);
                System.out.println(v1);
            } else if (v2 < v1 && v2 < v3 && v1 < v3) {
                System.out.println(v2);
                System.out.println(v1);
                System.out.println(v3);
            } else if (v3 < v1 && v3 < v2 && v2 < v1) {
                System.out.println(v3);
                System.out.println(v2);
                System.out.println(v1);
            } else if (v3 < v1 && v3 < v2 && v1 < v2) {
                System.out.println(v3);
                System.out.println(v1);
                System.out.println(v2);
            }
        } else {
            System.out.println("Erro!");
        }

    }
}