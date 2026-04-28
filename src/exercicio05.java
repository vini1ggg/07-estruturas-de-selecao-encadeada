import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v1, v2, v3;

        System.out.print("informe o valor 1 --> ");
        v1 = sc.nextInt();
        System.out.print("informe o valor 2 --> ");
        v2 = sc.nextInt();
        System.out.print("informe o valor 3 --> ");
        v3 = sc.nextInt();

        if (v1 == v2 || v1 == v3 || v2 == v3) {
            System.out.println("Há repetição entre os valores");
        }
        else if (v1 < v2 && v1 < v3){
            System.out.print(v1);
        }
        else if (v2 < v1 && v2 < v3) {
            System.out.print(v2);
        }
        else {
            System.out.println(v3);
        }
    }
}
