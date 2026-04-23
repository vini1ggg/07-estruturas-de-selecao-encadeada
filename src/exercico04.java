import java.util.Scanner;

public class exercico04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sb, imposto, sl;

        System.out.print("Qual é seu salário bruto? --> ");
        sb = sc.nextDouble();

        if (sb <= 2112) {
            System.out.println("Salário bruto = "+sb);
            System.out.println("Alíquota aplicada = Isento");
            System.out.println("Imposto = 00");
            System.out.println("Salário líquido = "+sb);
        } 
        else if (sb <= 2826.65) {
            imposto = sb * 0.075;
            sl = sb - imposto;
            System.out.println("Salário bruto = "+sb);
            System.out.println("Alíquota aplicada = 7,5%");
            System.out.println("Imposto = "+String.format ("%.2f" , imposto));
            System.out.println("Salário líquido = " +sl);
        } 
        else if (sb <= 3751.05 ) {
            imposto = sb * 0.15;
            sl = sb - imposto;
            System.out.println("Salário bruto = "+sb);
            System.out.println("Alíquota aplicada = 15%");
            System.out.println("Imposto = "+String.format ("%.2f" , imposto));
            System.out.println("Salário líquido = " +String.format ("%.2f" , sl));
        }
        else if (sb <= 4664.68) {
            imposto = sb * 0.225;
            sl = sb - imposto;
            System.out.println("Salário bruto = "+sb);
            System.out.println("Alíquota aplicada = 22,5%");
            System.out.println("Imposto = "+String.format ("%.2f" , imposto));
            System.out.println("Salário líquido = "+String.format ("%.2f" , sl));
        }
        else {
            imposto = sb * 0.275;
            sl = sb - imposto;
            System.out.println("Salário bruto = "+sb);
            System.out.println("Alíquota aplicada = 27,5%");
            System.out.println("Imposto = "+String.format ("%.2f" , imposto));
            System.out.println("Salário líquido = "+String.format ("%.2f" , sl));
        }

    }
}
