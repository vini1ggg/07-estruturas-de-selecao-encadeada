import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String turno;

        System.out.print("Olá, qual é o seu turno? --> ");
        turno = sc.next().toUpperCase();

         if (turno.equals("MANHA")) {
            System.out.println("Seu horário é das 07h00 às 12h00.");
         }
         else if (turno.equals("TARDE")) {
             System.out.println("Seu horário é das 13h00 às 18h00.");
         }
         else if (turno.equals("NOITE")) {
             System.out.println("Seu horário é das 19h00 às 23h00.");
         }
         else {
             System.out.println("Turno inválido!");
         }
    }
}
