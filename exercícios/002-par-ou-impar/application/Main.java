import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n1 = sc.nextInt();

        if (n1 % 2 == 0) {
            System.out.println(n1 + ": número par");
        } else{ 
            System.out.println(n1 + ": número ímpar");
        }
    }

}
