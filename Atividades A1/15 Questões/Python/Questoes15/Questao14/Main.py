#14. Singleton Implemente o padrão de projeto Singleton para garantir que apenas uma instância de uma classe Configuracao seja criada.

class Configuracao:
    _instance = None

    def __new__(cls):
        if cls._instance is None:
            cls._instance = super(Configuracao, cls).__new__(cls)
            print('Nova instância de Configuracao criada.')
        return cls._instance

    def mostrarConfiguracao(self):
        print('Exibindo configurações...')


if __name__ == '__main__':
    config1 = Configuracao()
    config2 = Configuracao()

    print(config1 is config2)

    config1.mostrarConfiguracao()