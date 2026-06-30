import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite o numero da conta: ");
        int numeroDaConta = entradaDados.nextInt();
        
        System.out.print("Digite o numero da agencia: ");
        int agencia = entradaDados.nextInt();
        entradaDados.nextLine();
        
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = entradaDados.nextLine();
        
        System.out.print("Digite o saldo da conta: ");
        double saldoConta = entradaDados.nextDouble();
        
        ContaTerminal contaTerminal = new ContaTerminal(numeroDaConta, agencia, nomeCliente, saldoConta);

        System.out.println("Olá "+contaTerminal.getNomeCliente()+", obrigado por criar uma conta em nosso banco, sua agência é "+ contaTerminal.getAgencia()+
        ", conta "+contaTerminal.getNumeroDaConta()+" e seu saldo "+contaTerminal.getSaldoConta()+" já está disponivel para saque.");

        entradaDados.close();
    }
}
