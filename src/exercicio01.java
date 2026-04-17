import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valortotal, tdd;

        System.out.print("Olá, seja bem vindo ao Hotel 1G, qual seria o total de diárias que você vai ficar? --> ");
        tdd = sc.nextDouble();

        System.out.println("Obrigado pela preferência!...");

        if (tdd > 15) {
            valortotal= tdd * 15.50 + (tdd * 250);
            System.out.println("O valor total ficou de --> " +valortotal);
        }
        else if (tdd == 15) {
            valortotal = tdd * 36 + (tdd * 250);
            System.out.println("O valor total ficou de --> " +valortotal);
        }
        else {
            valortotal = tdd * 58 + (tdd * 250);
            System.out.println("O valor total ficou de --> " +valortotal);
        }

            }
    }

