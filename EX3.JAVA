// Classe base
public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
    }
}

// Subclasse Eletrônico
public class Eletronico extends Produto {
    String marca;

    public Eletronico(String nome, double preco, String marca) {
        super(nome, preco);
        this.marca = marca;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Marca: " + marca);
    }
}

// Subclasse Alimento
public class Alimento extends Produto {
    String dataValidade;

    public Alimento(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Data de validade: " + dataValidade);
    }
}

// Classe principal para testar
public class Main {
    public static void main(String[] args) {
        Eletronico e = new Eletronico("Fone de ouvido", 150.0, "Sony");
        Alimento a = new Alimento("Leite", 5.0, "10/06/2025");

        System.out.println("Eletrônico:");
        e.exibirInfo();

        System.out.println("\nAlimento:");
        a.exibirInfo();
    }
}
