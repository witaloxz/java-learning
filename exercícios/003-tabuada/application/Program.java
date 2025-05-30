import java.util.Scanner;

public class Program {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.println("Digite um número: ");
    int n1 = sc.nextInt();


    for(int i = 0; i < n1; i++){
        System.out.println("Tabuada de multiplicação do " + n1);
        System.out.println(n1 + " x " + i + " = " + (n1 * i));
    }
    
    sc.close();
}
}
