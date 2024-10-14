# 1. Classes e Objetos Básicos Crie uma classe Carro com atributos como marca, modelo, e ano. Instancie três objetos dessa classe e exiba os detalhes de cada um.
# Classe Carro
class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano

    def exibir(self):
        print(f"Marca: {self.marca}, Modelo: {self.modelo}, Ano: {self.ano}")


# Cliente
if __name__ == "__main__":
    carro1 = Carro("Toyota", "Corolla", 2021)
    carro2 = Carro("Jeep", "Commander", 2024)
    carro3 = Carro("Ford", "Maverick", 2022)

    carro1.exibir()
    carro2.exibir()
    carro3.exibir()
