#4. Herança Crie uma classe base Animal com métodos como som. Derive classes como Cachorro e Gato que implementam o método som de maneiras diferentes.

# Classe Animal
class Animal:
    def __init__(self, especie, nome):
        self.especie = especie
        self.nome = nome

    def emitirSom(self):
        return ''


class Cachorro(Animal):
    def __init__(self, nome):
        super().__init__('cachorro', nome)

    def emitirSom(self):
        return 'Au Au'


class Gato(Animal):
    def __init__(self,nome):
        super().__init__('gato', nome)

    def emitirSom(self):
        return 'Miau'


if __name__ == '__main__':
    cachorro = Cachorro('Rex')
    gato = Gato('Mimi')

    print(f'{cachorro.nome} diz: {cachorro.emitirSom()}')
    print(f'{gato.nome} diz: {gato.emitirSom()}')
