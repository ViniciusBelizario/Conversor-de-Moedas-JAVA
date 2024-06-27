# Currency Converter

Este é um simples conversor de moedas escrito em Java, que utiliza a API da ExchangeRate-API para obter taxas de câmbio atualizadas. O usuário pode escolher a moeda de origem, a moeda de destino e inserir o valor a ser convertido, e o programa exibirá o valor convertido no console.

## Dependências

Este projeto depende das seguintes bibliotecas:

- OkHttp 4.9.1
- Okio 2.8.0
- Gson 2.8.8
- Kotlin Stdlib 1.5.30 (dependência do OkHttp)

## Como Configurar o Projeto

1. **Clone o Repositório:**

   ```sh
   git clone https://github.com/seuusuario/conversorMoedas.git
   cd conversorMoedas

2. **Adicionar Bibliotecas ao IntelliJ IDEA:**

Abra o projeto no IntelliJ IDEA.
Vá para File > Project Structure > Libraries.
Clique no ícone + para adicionar uma nova biblioteca.
Escolha Java e adicione os arquivos .jar das bibliotecas okhttp-4.9.1.jar, okio-2.8.0.jar e kotlin-stdlib-1.5.30.jar da pasta lib.

3. **Compilar e Executar o Projeto:**

Clique com o botão direito do mouse no arquivo CurrencyConverter.java e selecione Run 'CurrencyConverter.main()'.

## Uso
Ao executar o programa, siga as instruções no console para escolher a moeda de origem, a moeda de destino e inserir o valor a ser convertido. O programa exibirá o valor convertido no console.

## Exemplo
Escolha a moeda de origem:
1. USD
2. EUR
3. GBP
4. JPY
5. AUD
6. CAD
### Digite o número correspondente à moeda de origem: 1

Escolha a moeda de destino:
1. USD
2. EUR
3. GBP
4. JPY
5. AUD
6. CAD
### Digite o número correspondente à moeda de destino: 2

Digite o valor a ser convertido: 100

100.00 USD é equivalente a 84.50 EUR
