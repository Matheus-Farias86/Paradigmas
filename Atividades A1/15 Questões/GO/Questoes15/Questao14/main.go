package main

//14. Singleton Implemente o padrão de projeto Singleton para garantir que apenas uma instância de uma classe Configuracao seja criada.
import (
	"fmt"
	"sync"
)

type Configuracao struct{}

var (
	instancia *Configuracao
	once      sync.Once
)

func GetConfiguracao() *Configuracao {
	once.Do(func() {
		instancia = &Configuracao{}
		fmt.Println("Nova instância de Configuracao criada.")
	})
	return instancia
}

func (c *Configuracao) MostrarConfiguracao() {
	fmt.Println("Exibindo configurações...")
}

func main() {
	config1 := GetConfiguracao()
	config2 := GetConfiguracao()

	fmt.Println(config1 == config2)

	config1.MostrarConfiguracao()
}
