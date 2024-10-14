package Questao14;
//14. Singleton Implemente o padrão de projeto Singleton para garantir que apenas uma instância de uma classe Configuracao seja criada.

class Configuracao {
    private static Configuracao instance;

    private Configuracao() {
        System.out.println("Nova instância de Configuracao criada.");
    }

    public static Configuracao getInstance() {
        if (instance == null) instance = new Configuracao();

        return instance;
    }

    public void mostrarConfiguracao() {
        System.out.println("Exibindo configurações...");
    }
}

public class Main {
    public static void main(String[] args) {
        Configuracao config1 = Configuracao.getInstance();
        Configuracao config2 = Configuracao.getInstance();

        System.out.println(config1 == config2);

        config1.mostrarConfiguracao();
    }
}
