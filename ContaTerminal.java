import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta : ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        // Solicitação dos dados ao usuário
        System.out.print("Por favor, digite o número da Agência : ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do Cliente : ");
        String nomeCliente = scanner.nextLine();

        double saldo = 237.48;

        // Mensagem final
         System.out.printf( "Olá %s, obrigado por criar uma conta em nosso banco! Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);

        scanner.close();
    }
}
