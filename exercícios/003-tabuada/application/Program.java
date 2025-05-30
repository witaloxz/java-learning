import java.util.Scanner;

public class Program {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.print("Digite um número: ");
    int n1 = sc.nextInt();

    System.out.println("Tabuada de multiplicação do " + n1);
    for(int i = 0; i <= 10; i++){
        
        System.out.println(n1 + " x " + i + " = " + (n1 * i));
    }
    
    sc.close();
}
}
