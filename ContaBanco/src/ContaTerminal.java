import java.util.Locale;
import java.util.Scanner;



public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Por favor, digite o número da Agência!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite sua conta!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome!");
        String nomeCliente = teclado.nextLine();

        System.out.println("Qual seu saldo bancário?");
        double saldo = scanner.nextDouble();

      
        //imprimindo os dados obtidos pelo usuário
        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia +", conta: " + numero + " e seu saldo " + saldo + " reais, já está disponível para saque.");

    }
}
