#10. Sobrecarga de Métodos (Java) / Métodos com Nomes Diferentes (Python, Go) Implemente uma classe Calculadora com métodos somar que aceita diferentes números de parâmetros (dois ou três números).
#Em Golang, use funções com nomes diferentes para diferentes quantidades de parâmetros.

class Calculadora:
    # Método para somar dois números
    def somarDois(self, a, b):
        return a + b

    # Método para somar três números
    def somarTres(self, a, b, c):
        return a + b + c

if __name__ == "__main__":
    calculadora = Calculadora()

    # Chamadas aos métodos da calculadora
    x1 = calculadora.somarDois(14, 11)
    print("14 + 11 =", x1)

    x2 = calculadora.somarTres(10, 5, 90)
    print("10 + 5 + 90 =", x2)
