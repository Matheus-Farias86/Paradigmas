#3. Encapsulamento Implemente uma classe ContaBancaria com atributos saldo, titular e métodos depositar e sacar. Use encapsulamento para proteger o atributo saldo.

class ContaBancaria:
    def __init__(self, titular, saldo):
        self.titular = titular
        self.saldo = saldo

    def depositar(self, valor):
        if valor > 0:
            self.saldo += valor
        else:
            print('Valor deve ser maior que 0')

    def sacar(self, valor):
        if valor > 0 and valor <= self.saldo:
            self.saldo -= valor
        elif valor > self.saldo:
            print('Saldo insuficiente')
        else:
            print('Valor deve ser maior que 0')

    def getsaldo(self):
        return self.saldo

    def exibir(self):
        print(f'Titular: {self.titular}, Saldo: {self.saldo}')


if __name__ == '__main__':
    conta = ContaBancaria('Tyler', 4000)

    conta.exibir()

    conta.depositar(700)
    conta.exibir()
    conta.sacar(3000)
    conta.exibir()
    conta.sacar(5000)
    conta.exibir()
