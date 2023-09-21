package edu.denise.anatomiadeclasses;
// Anatomia de uma classe

public class HelloWorld {
    public static void main (String [] args) {
        //classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";
                
        //qual o resultado das expressoes abaixo?
        int concatenacao = 0; 

        concatenacao = 1+1+1;

        System.out.print(concatenacao);
    }    
}

/* 

- **public:** Esta é uma modificadora de acesso que indica que a classe HelloWorld é acessível de qualquer lugar, ou seja, ela pode ser acessada de outras classes e pacotes.

- **class:** A palavra-chave "class" é usada para declarar uma classe em Java. Neste caso, estamos criando uma classe chamada HelloWorld.

- **HelloWorld:** Este é o nome da classe. O nome da classe deve começar com uma letra maiúscula por convenção.

- **public:** Novamente, a palavra-chave "public" é usada aqui para indicar que o método `main` é acessível de qualquer lugar.

- **static:** A palavra-chave "static" indica que o método `main` pertence à classe HelloWorld em vez de uma instância específica dessa classe. Isso significa que você pode chamar o método `main` sem criar um objeto da classe HelloWorld.

- **void:** O tipo de retorno do método `main`. Neste caso, o método `main` não retorna nenhum valor.

- **main:** Este é o nome do método. O método `main` é o ponto de entrada de um programa Java e é onde a execução do programa começa.

- **(String[] args):** Isso é chamado de parâmetro de método. O método `main` aceita um único argumento, que é um array de strings chamado `args`. Esses argumentos podem ser passados para o programa quando ele é executado a partir da linha de comando.

- **System.out.print("Hello, World!");:** Esta é uma linha de código dentro do método `main`. Ele chama o método `print` da classe `System` para imprimir a string "Hello, World!" no console. Isso é o que faz com que a mensagem "Hello, World!" seja exibida quando o programa é executado. */