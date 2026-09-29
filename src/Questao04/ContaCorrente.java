package Questao04;

public class ContaCorrente {

    private int numero;
    private String titular;
    private float saldo;

    public ContaCorrente(int numero, String titular, float saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void sacar (float valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!\n");
        } else if (valor > 10000) {
            System.out.println("Limite de 10000 por saque excedido!\n");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente!\n");
        } else {
            saldo = saldo - valor;
            System.out.println("Saque realizado!\n");
        }
    }

    public void depositar (float valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!\n");
        } else if (valor > 10000) {
            System.out.println("Limite de 10000 por depósito excedido!\n");
        } else {
            saldo = saldo + valor;
            System.out.println("Depósito realizado!\n");
        }
    }

    public float consultarSaldo () {
        return saldo;
    }
}
