package main

//12. Sobrecarga de Operadores (Python) / Métodos de Conveniência (Java, Go) Em Python, sobrecarregue o operador + para somar dois objetos Produto baseados no preço.
//Em Java e Golang, crie métodos que permitam essa funcionalidade.
import "fmt"

type Produto struct {
	nome  string
	preco float64
}

func (p1 Produto) Somar(p2 Produto) Produto {
	soma := p1.preco + p2.preco
	novoNome := fmt.Sprintf("Pacote com %s e %s", p1.nome, p2.nome)
	return Produto{nome: novoNome, preco: soma}
}

func (p Produto) String() string {
	return fmt.Sprintf("%s - R$%.2f", p.nome, p.preco)
}

func main() {
	iphone := Produto{"iPhone", 6000.00}
	airpods := Produto{"Airpods", 1500.00}

	pacote := iphone.Somar(airpods)

	fmt.Println(pacote.String())
}
