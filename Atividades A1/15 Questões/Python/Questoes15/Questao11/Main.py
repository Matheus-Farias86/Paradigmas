#11. Classes Abstratas Crie uma classe abstrata Funcionario com um método abstrato calcularSalario. Derive classes como FuncionarioHorista e FuncionarioAssalariado
#que implementam calcularSalario de formas distintas.

from abc import ABC, abstractmethod

class Funcionario(ABC):
    def __init__(self, nome):
        self.nome = nome

    @abstractmethod
    def calcularSalario(self):
        pass


class FuncionarioHorista(Funcionario):
    def __init__(self, nome, horasTrabalhadas,valorPorHora):
        super().__init__(nome)
        self.horasTrabalhadas = horasTrabalhadas
        self.valorPorHora = valorPorHora

    def calcularSalario(self):
        return self.horasTrabalhadas * self.valorPorHora


class FuncionarioAssalariado(Funcionario):
    def __init__(self, nome, salarioFixo):
        super().__init__(nome)
        self.salarioFixo = salarioFixo

    def calcularSalario(self):
        return self.salarioFixo


if __name__ == '__main__':
    horista = FuncionarioHorista('João', 160, 25.0)
    assalariado = FuncionarioAssalariado('Maria', 3000.0)

    print(f'Salário do horista {horista.nome}: {horista.calcularSalario()}')
    print(f'Salário do assalariado {assalariado.nome}: {assalariado.calcularSalario()}')