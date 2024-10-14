#8. Agregação Modele uma classe Empresa que agregue uma lista de objetos Empregado. Cada empregado deve ter atributos como nome, cargo, e salario.

class Empregado:
    def __init__(self, nome, cargo, salario):
        self.nome = nome
        self.cargo = cargo
        self.salario = salario

    def exibirDetalhes(self):
        print(f'Nome: {self.nome}, Cargo: {self.cargo}, Salario: {self.salario}')

class Empresa:
    def __init__(self,nomeEmpresa):
        self.nomeEmpresa = nomeEmpresa
        self.empregados = []

    def addEmpregado(self,empregado):
        self.empregados.append(empregado)

    def exibirEmpregados(self):
        for empregado in self.empregados:
            empregado.exibirDetalhes()


if __name__ == '__main__':
    empresa = Empresa("Dunder Mifflin")

    emp1 = Empregado("Jim", "Vendedor", 4200.00)
    emp2 = Empregado("Pam", "Recepcionista", 2500.00)
    emp3 = Empregado("Michael", "Gerente", 7000.00)

    empresa.addEmpregado(emp1)
    empresa.addEmpregado(emp2)
    empresa.addEmpregado(emp3)

    empresa.exibirEmpregados()
