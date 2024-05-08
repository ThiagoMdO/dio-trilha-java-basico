import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        try {
            System.out.print("Por favor, digite o número da Conta: ");
            Integer numeroConta = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Agora o número da Agência: ");
            String numeroAgencia = scanner.nextLine();

            System.out.print("O nome da conta: ");
            String nomeCliente = scanner.nextLine();

            System.out.print("Saldo na conta: ");
            Double saldo = scanner.nextDouble();

            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s" +
                    ", conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, numeroAgencia, numeroConta, saldo);
        }catch (Exception e){
            System.out.printf("Error" + e.getMessage());
        }finally {
            scanner.close();
        }
    }
}