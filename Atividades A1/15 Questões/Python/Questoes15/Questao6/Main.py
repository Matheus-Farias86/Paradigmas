#6. Composição Implemente uma classe Motor e associe-a a uma classe Carro. A classe Carro deve ter um objeto do tipo Motor como um de seus atributos.

class Motor:
    def __init__(self, tipo, potencia):
        self.tipo = tipo
        self.potencia = potencia

    def ligar(self):
        print('O motor está ligado.')

    def desligar(self):
        print('O motor está desligado.')


class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.motor = Motor('Diesel', 150)

    def ligar(self):
        Motor.ligar(self.motor)
        print("O carro está pronto para rodar.")

    def desligar(self):
        Motor.desligar(self.motor)
        print('O carro está desligado.')

    def exibir(self):
        print(f'Marca: {self.marca}, Modelo: {self.modelo}, Ano: {self.ano}')


if __name__ == '__main__':
    carro1 = Carro("Toyota", "Corolla", 2021)
    carro2 = Carro("Jeep", "Commander", 2024)
    carro3 = Carro("Ford", "Maverick", 2022)

    carro1.exibir()
    carro2.exibir()
    carro3.exibir()

    carro1.ligar()
    carro1.desligar()


