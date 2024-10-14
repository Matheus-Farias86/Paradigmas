#5. Polimorfismo Utilize polimorfismo para criar uma função que receba uma lista de objetos Animal e chame o método som de cada um, demonstrando comportamento diferente para cada subclasse.

class Animal:
    def __init__(self,especie,nome):
        self.especie = especie
        self.nome = nome

    def emitirSom(self):
        return ''


class Cachorro(Animal):
    def __init__(self,nome):
        super().__init__("Cachorro", nome)

    def emitirSom(self):
        return "Au Au"


class Gato(Animal):
    def __init__(self,nome):
        super().__init__("Gato", nome)

    def emitirSom(self):
        return "Miau"


def emitirSonsDosAnimais(animais):
    for animal in animais:
        print(f'{animal.nome} diz: {animal.emitirSom()}')


if __name__ == '__main__':
    cachorro = Cachorro("Rex")
    gato = Gato("Mimi")

    animais = [cachorro, gato]

    emitirSonsDosAnimais(animais)
