#13. Métodos Estáticos Adicione um método estático à classe Matematica que calcula o fatorial de um número. Em Python, utilize @staticmethod, em Java static,
#e em Golang crie uma função regular na struct.

class Matematica:
    @staticmethod
    def calcFatorial(numero):
        if numero == 0 or numero == 1:
            return 1
        fatorial = 1
        for i in range(2, numero + 1):
            fatorial *= i
        return fatorial


if __name__ == '__main__':
    numero = 5
    resultado = Matematica.calcFatorial(numero)
    print(f'Fatorial de {numero} = {resultado}')