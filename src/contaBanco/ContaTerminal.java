package contaBanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita e l� o n�mero da conta
        System.out.println("Por favor, digite o n�mero da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha deixada pelo nextInt()
        
        // Solicita e l� o n�mero da ag�ncia
        System.out.println("Por favor, digite o n�mero da Ag�ncia:");
        String agencia = scanner.nextLine();
        
        // Solicita e l� o nome do cliente
        System.out.println("Por favor, digite o Nome do Cliente:");
        String nomeCliente = scanner.nextLine();
        
        // Solicita e l� o saldo
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();
        
        // Fecha o scanner
        scanner.close();
        
        // Exibe a mensagem final
        String mensagem = "Ol� " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua ag�ncia � " + 
                           agencia + ", conta " + numero + " e seu saldo " + saldo + " j� est� dispon�vel para saque.";
        System.out.println(mensagem);
    }
}
