import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        
        System.out.println("Por favor, digite o número da Agência!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite sua conta!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome!");
        String nomeCliente = scanner.next();

        System.out.println("Qual seu saldo bancário?");
        double saldo = scanner.nextDouble();

        System.out.println("Muito Obrigado!");
    }
}
