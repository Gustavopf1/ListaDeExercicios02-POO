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

## Questão 02

a ) Para representar um livro em um sistema de controle de biblioteca, é muito importante ter o título, autor, e o gênero como romance, ficção ou terror, pois ajuda a organizar a localização física dele na biblioteca. Cada exemplar deve ter um código único, permitindo diferenciar cópias diferentes de um mesmo título, já que a biblioteca pode ter mais de uma unidade do mesmo livro. Também é importante indicar a disponibilidade do livro, informando se ele está disponível para empréstimo ou se já está emprestado, e registrar a localização do exemplar, com o número da estante e da prateleira onde ele está guardado, facilitando encontrá-lo fisicamente. 

b ) A classe Livro pode ser considerada uma abstração porque ela representa apenas as características essenciais de um livro para o sistema, como título, autor, gênero e código.

c ) `pegarLivro()` -  muda a disponibilidade pra indisponível </br>
    `devolverLivro()` - muda a disponibilidade pra disponível </br>
    `exibirInformacoes()` -  mostra os dados do livro (título, autor, gênero, disponibilidade)
