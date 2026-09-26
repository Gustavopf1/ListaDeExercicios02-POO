public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "Notebook", 3500.00, 10);

        System.out.println("Informações do produto:");
        produto1.exibirInfo();

        System.out.println("\nPreço negativo:");
        produto1.setPreco(-100);

        System.out.println("\nPreço válido:");
        produto1.setPreco(3200.00);
        produto1.exibirInfo();
    }
}
