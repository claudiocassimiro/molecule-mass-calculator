# Protein Mass Calculator

Este projeto é uma aplicação em Java que calcula a massa total de uma proteína a partir de sua sequência de aminoácidos fornecida em um arquivo de texto. A sequência de aminoácidos é composta por caracteres que representam os diferentes aminoácidos, e suas massas são somadas para obter a massa total da proteína.

## Estrutura de Dados Utilizada

Para armazenar a massa de cada aminoácido, utilizamos um `HashMap` em que a chave é o caractere que representa o aminoácido e o valor é a massa correspondente. Esta escolha se dá pela eficiência em busca e inserção que o `HashMap` oferece.

## Tabela de Massas dos Aminoácidos

| Aminoácido | Massa (Da) |
|------------|-------------|
| A          | 71.03711    |
| C          | 103.00919   |
| D          | 115.02694   |
| E          | 129.04259   |
| F          | 147.06841   |
| G          | 57.02146    |
| H          | 137.05891   |
| I          | 113.08406   |
| K          | 128.09496   |
| L          | 113.08406   |
| M          | 131.04049   |
| N          | 114.04293   |
| P          | 97.05276    |
| Q          | 128.05858   |
| R          | 156.10111   |
| S          | 87.03203    |
| T          | 101.04768   |
| V          | 99.06841    |
| W          | 186.07931   |
| Y          | 163.06333   |

## Como Usar

### Pré-requisitos

- Java Development Kit (JDK) instalado
- Um arquivo de texto contendo a sequência de aminoácidos (por exemplo, `proteina1.txt`)

### Compilação e Execução

1. Clone este repositório ou copie o código para um diretório local.
2. Navegue até o diretório contendo o arquivo `ProteinMassCalculator.java`.

#### Compilação

```sh
javac ProteinMassCalculator.java
```

#### Execução

```sh
java ProteinMassCalculator
```

3. Quando solicitado, insira o nome do arquivo contendo a sequência da proteína (por exemplo, `proteina1.txt`).

### Exemplo

Suponha que você tenha um arquivo `proteina1.txt` com o seguinte conteúdo:

```
SKADYEK
```

Após executar o programa e fornecer o nome do arquivo, a saída será:

```
A massa total da proteína é: 821.39200
```

## Estrutura do Código

- `ProteinMassCalculator.java`: Contém o código principal para ler a sequência de aminoácidos a partir de um arquivo, calcular a massa total utilizando um `HashMap`, e exibir o resultado.

## Tratamento de Erros

O programa verifica se o arquivo fornecido existe e pode ser lido. Se um aminoácido desconhecido for encontrado na sequência, uma mensagem de erro será exibida.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.