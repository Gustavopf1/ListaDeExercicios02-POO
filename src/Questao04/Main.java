package Questao04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o numero da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Informe o nome do titular: ");
        String titular = sc.nextLine();

        ContaCorrente conta = new ContaCorrente(numero, titular, 0);

        int opcao;
        do {
            System.out.println("\n --- Menu ---");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar saldo");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe valor do saque: ");
                    float valorSaque = sc.nextFloat();
                    conta.sacar(valorSaque);
                    break;

                case 2:
                    System.out.print("Informe o valor do depósito: ");
                    float valorDeposito = sc.nextFloat();
                    conta.depositar(valorDeposito);
                    break;

                case 3:
                    System.out.print("Saldo atual: R$ " + conta.consultarSaldo());
                    break;

                case 0:
                    System.out.print("Saindo do programa...");
                    break;

                default:
                    System.out.print("Opção inválida!");
            }


        }
        while (opcao != 0);

        sc.close();
    }
}
