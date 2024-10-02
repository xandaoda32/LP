class Carro {
    // Atributos
    String marca;
    String modelo;
    int ano;

    // Métodos
    void acelerar() {
        // Exibe na tela "O carro acelerou."
        System.out.println("O carro acelerou.");
    }
}

class Carro {
    private String marca;
    private String nome;
    public Carro(String marca, String nome) {
        this.marca = marca;
        this.nome = nome;
    }
    public void andar() {
        System.out.println("O carro " + marca + " " + nome + " está andando");
    }
}


public class App {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla");

        // Irá exibir "O carro Toyota Corolla está andando".
        carro.andar();
    }
}


class Carro {
    private String marca;
    private String nome;
    public Carro(String marca, String nome) {
    this.marca = marca;
    this.nome = nome;
    }

    protected String nomeCompleto() {
    return marca + " " + nome;
    }
    public void andar() {
    System.out.println("O carro " + nomeCompleto() + " está andando");
    }
}
public class App {
    public static void main(String[] args) {
    Carro carro = new Carro("Fiat", "Gol");
    carro.marca = "VW"; // Irá apresentar um erro de compilação
    carro.andar();
    }
}
