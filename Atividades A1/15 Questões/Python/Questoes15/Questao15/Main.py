#15. Exceções/Erros Personalizados Crie uma classe de exceção personalizada SaldoInsuficienteException em Java e Python, ou error em Golang, que seja lançada
# quando houver uma tentativa de saque superior ao saldo disponível na classe ContaBancaria.

class SaldoInsuficienteException(Exception):
    def __init__(self, mensagem):
        super().__init__(mensagem)


class ContaBancaria:
    def __init__(self, titular, saldoInicial):
        self.titular = titular
        self.saldo = saldoInicial

    def getSaldo(self):
        return self.saldo

    def sacar(self, valor):
        if valor > self.saldo:
            raise SaldoInsuficienteException(f'Saldo insuficiente para realizar o saque. Saldo disponível: {self.saldo}')
        else:
            self.saldo -= valor
            print(f'Saque realizado: {valor}')


if __name__ == '__main__':
    conta = ContaBancaria('Jack', 1000.00)
    print('Saldo atual:', conta.getSaldo())

    try:
        conta.sacar(500.00)
        conta.sacar(600.00)
    except SaldoInsuficienteException as e:
        print(e)

    print('Saldo atual:', conta.getSaldo())