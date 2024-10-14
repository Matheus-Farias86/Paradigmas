#7. Associação Crie uma classe Escola e uma classe Professor. A associação deve permitir que uma escola tenha vários professores, e um professor possa lecionar em várias escolas.

class Professor:
    def __init__(self, nome):
        self.nome = nome
        self.escolas = []

    def addEscolas(self, escola):
        self.escolas.append(escola)
        escola.addProfessores(self)

    def getEscolas(self):
        return self.escolas

class Escola:
    def __init__(self, nome):
        self.nome = nome
        self.professores = []

    def addProfessores(self, professor):
        if professor not in self.professores:
            self.professores.append(professor)

    def getProfessores(self):
        return self.professores

if __name__ == '__main__':
    prof1 = Professor('Kate')
    prof2 = Professor('Jack')
    prof3 = Professor('John')
    escola1 = Escola('Ilha')
    escola2 = Escola('Dharma')

    prof1.addEscolas(escola1)
    prof2.addEscolas(escola1)
    prof2.addEscolas(escola2)
    prof3.addEscolas(escola2)

    print('Escolas da Kate')
    for escola in prof1.getEscolas():
        print(f'   -{escola.nome}')
    print('Escolas do Jack')
    for escola in prof2.getEscolas():
        print(f'   -{escola.nome}')
    print('Escolas do John')
    for escola in prof3.getEscolas():
        print(f'   -{escola.nome}')

    print('Professores da escola Ilha')
    for professor in escola1.getProfessores():
        print(f'   -{professor.nome}')
    print('Professores da escola Dharma')
    for professor in escola2.getProfessores():
        print(f'   -{professor.nome}')
