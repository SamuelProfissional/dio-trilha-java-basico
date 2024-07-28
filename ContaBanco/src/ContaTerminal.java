import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

    Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia;                  
        String nomeCliente;
        Double saldo;


        System.out.println("Por favor, digite o número da Agência !");
         numero = ler.nextInt();
         ler.nextLine();
        System.out.println("Digite o nome da agência");
         agencia = ler.nextLine();
        System.out.println("Digite o nome do cliente");
         nomeCliente = ler.nextLine();
        System.out.println("Digite o saldo da conta");
         saldo = ler.nextDouble();
        
        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "  + numero +  " e seu saldo " + saldo + " já está disponível para saque"); 

    }
}
