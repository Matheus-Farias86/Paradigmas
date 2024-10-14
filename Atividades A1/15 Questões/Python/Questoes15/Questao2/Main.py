# 2. Métodos Adicione um método acelerar e frear à classe Carro que altere um atributo velocidade. Crie um método para exibir a velocidade atual.
# Classe Carro
class Carro:
    def __init__(self, marca, modelo, ano, velocidade = 0):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.velocidade = velocidade

    def acelerar(self,incremento):
        self.velocidade += incremento

    def frear(self,decremento):
        self.velocidade -= decremento
        if self.velocidade < 0:
            self.velocidade = 0

    def exibir(self):
        print(f'Marca: {self.marca}, Modelo: {self.modelo}, Ano: {self.ano}')

    def exibirVelocidade(self):
        print(f'Velocidade atual: {self.velocidade}')


if __name__ == '__main__':
    carro1 = Carro("Toyota", "Corolla", 2021)
    carro2 = Carro("Jeep", "Commander", 2024)
    carro3 = Carro("Ford", "Maverick", 2022)

    carro1.exibir()
    carro1.exibirVelocidade()
    carro1.acelerar(40)
    carro1.exibirVelocidade()
    carro1.frear(10)
    carro1.exibirVelocidade()
    carro1.frear(100)
    carro1.exibirVelocidade()