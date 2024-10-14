#12. Sobrecarga de Operadores (Python) / Métodos de Conveniência (Java, Go) Em Python, sobrecarregue o operador + para somar dois objetos Produto baseados no preço.
#Em Java e Golang, crie métodos que permitam essa funcionalidade.

class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

    def __add__(self, outroProduto):
        soma = self.preco + outroProduto.preco
        novoNome = f'Pacote com {self.nome} e {outroProduto.nome}'
        return Produto(novoNome, soma)

    def __str__(self):
        return f'{self.nome} - R${self.preco:.2f}'


if __name__ == '__main__':
    iphone = Produto('iPhone', 6000.00)
    airpods = Produto('Airpods', 1500.00)

    pacote = iphone + airpods

    print(pacote)