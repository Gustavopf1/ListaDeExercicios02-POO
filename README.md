# Questões Teóricas

## Questão 01

Getters e setters são muito utilizados pois protegem os atributos de uma classe para que não haja alterações vindas de código externo. Se eu simplesmente criasse atributos públicos, qualquer código poderia mudar os valores dos atributos da minha classe, até valores inválidos, sem verificação. O Getter é usado para permitir que outras classes consultem os atributos da minha classe, já o Setter permite que outras classes alterem o valor de um atributo, mas com segurança, validando o dado antes de aplicá-lo, sem deixar o objeto com um 
estado inválido.

Um exemplo seria uma classe `ContaBancaria`:

```java
public class ContaBancaria {
    private double saldo;

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("Saldo não pode ser negativo!");
        } else {
            this.saldo = saldo;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
```

Se o atributo `saldo` fosse público, seria possível atribuir um valor negativo diretamente `conta.saldo = -500;`, o que não faz sentido. Com o setter validando, isso é impedido, garantindo a integridade dos dados do objeto.
