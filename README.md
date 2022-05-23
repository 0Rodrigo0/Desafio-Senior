# DevinHouse
## Desafio Senior

Especificação de Funcionalidade do Projeto

## Introdução

Deverá ser desenvolvido um cadastro (Create/Read/Update/Delete/List) para as seguintes entidades: produto/serviço, pedido e itens de pedido. Todos as entidades deverão ter um ID único do tipo UUID. No cadastro de produto/serviço deverá ter uma indicação para diferenciar um produto de um serviço. Deverá ser possível aplicar um percentual de desconto no pedido, porém apenas para os itens que sejam produto (não serviço); o desconto será sobre o valor total dos produtos.


## Requisitos

1. A prova deverá ser entregue completa (todos os itens resolvidos).
2. O código não poderá ter erros de compilação.
3. Deverá haver uma documentação mínima de como executar o projeto e suas funcionalidades.
- [Projeto](https://github.com/0Rodrigo0/Desafio-Senior/tree/master) - Link do Projeto.

## Entrega

A prova deverá ser entregue completa (todos os itens resolvidos). Deverão ser criados testes automatizados. O código não poderá ter erros de compilação. Deverá haver uma documentação mínima de como executar o projeto e suas funcionalidades.

## Tecnologias utilizadas
- Banco de dados PostgreSQL 6.7</br>
- Java 8+</br>
- Maven </br>
- Spring 2.7.0</br>
- JPA</br>
- REST com JSON</br>
- JDK 17.0</br>

## Instalação

Porjeto foi desenvolvido no InteliJ: Build #IC-221.5080.210, built on April 12, 2022
Runtime version: 11.0.14.1+1-b2043.25 amd64, VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.

Necessário a instalação do PostgreSQL, e a criação da database ERP. A senha do banco deve ser 123456 e o usuário postgres.

Para a execução e teste utilizar o Postman Version 9.19.0.

## Parametros para o Postman

# GET
Tabela produtoServico: localhost:8080/produtoServico
Tabela pedido: localhost:8080/pedido
Tabela itensPedido: localhost:8080/itensPedido

# POST
Tabela produtoServico: localhost:8080/produtoServico/cadastra</br>
![image](https://user-images.githubusercontent.com/87920248/169725214-460bf611-afc9-4f34-bdfc-99614fec3329.png)

Tabela pedido: localhost:8080/pedido/cadastra</br>
![image](https://user-images.githubusercontent.com/87920248/169725301-95b79f14-4d83-45fa-a253-b2c17d6bda19.png)

Tabela itensPedido: localhost:8080/itensPedido/cadastra</br>
![image](https://user-images.githubusercontent.com/87920248/169725329-4f4cd6a2-2ea5-43dd-8f3a-54dab6f934a5.png)


# PUT
Tabela produtoServico: localhost:8080/produtoServico/<id do objeto></br>
![image](https://user-images.githubusercontent.com/87920248/169725382-b418a31c-0eb0-4eb3-b5ec-60cf1a5767c2.png)

Tabela pedido: localhost:8080/pedido/<id do objeto></br>
![image](https://user-images.githubusercontent.com/87920248/169725411-9c4e2c0b-dcba-481c-bab8-cc99c1ffbe83.png)

Tabela itensPedido: localhost:8080/itensPedido/<id do objeto><br/>
![image](https://user-images.githubusercontent.com/87920248/169725435-4403811d-9455-47e8-ab71-b88c009701f8.png)

# DELETE
Tabela produtoServico: localhost:8080/produtoServico/<id do objeto>
Tabela pedido: localhost:8080/pedido/<id do objeto>
Tabela itensPedido: localhost:8080/itensPedido/<id do objeto>


## Licença

MIT

**Free Software, Hell Yeah!**
