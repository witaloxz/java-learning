
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.User;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<User> users = new ArrayList<>();

        String menu = """
                1) Cadastrar usuário
                2) Mostrar usuários cadastrados
                3) Sair
                """;

        int opcao = 0;
        while (opcao != 3) {
            System.out.println();
            System.out.println(menu);
            System.out.print("Escolhar uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número de usuários que deseja cadastrar: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {
                        System.out.println("Usuário #" + (1 + i));

                        System.out.print("Nome: ");
                        String name = sc.nextLine();

                        System.out.print("Email: ");
                        String email = sc.next();
                        sc.nextLine();

                        users.add(new User(name, email));
                        System.out.println();

                    }
                    System.out.println("Usuários cadastrados com sucesso!");
                    break;

                case 2:

                    System.out.println();
                    for (User p : users) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.println("fim do programa");
                    break;

                default:
                    System.out.println("ERROR: Opção inválida");
                    break;
            }

        }

    }
}
