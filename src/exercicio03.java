import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha, nome;

        System.out.print("Olá, digite seu nome de usuário --> ");
        nome = sc.next();

        System.out.print("Agora por favor, digite a sua senha --> ");
        senha = sc.next();

        if (nome.equals("admin") && senha .equals("fiap2026")) {
            System.out.println("Acesso liberado!");
        }
        else if (nome.equals("admin")) {
            System.out.println("Senha incorreta");
        }
        else {
            System.out.println("Usuário não encontrado");
        }


    }
}
