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

Para a execução de testes indicado Postman Version 9.19.0.

## Parametros para o Postman

## GET
Tabela produtoServico: localhost:8080/produtoServico</br>
Tabela pedido: localhost:8080/pedido</br>
Tabela itensPedido: localhost:8080/itensPedido</br>

## POST
Tabela produtoServico: localhost:8080/produtoServico/cadastra</br>
![image](https://user-images.githubusercontent.com/87920248/169725214-460bf611-afc9-4f34-bdfc-99614fec3329.png)

Tabela pedido: localhost:8080/pedido/cadastra</br>
![image](https://user-images.githubusercontent.com/87920248/169725301-95b79f14-4d83-45fa-a253-b2c17d6bda19.png)

Tabela itensPedido: localhost:8080/itensPedido/cadastra</br>
![image](https://user-images.githubusercontent.com/87920248/169725329-4f4cd6a2-2ea5-43dd-8f3a-54dab6f934a5.png)


## PUT
Tabela produtoServico: localhost:8080/produtoServico/<id do objeto></br>
![image](https://user-images.githubusercontent.com/87920248/169725382-b418a31c-0eb0-4eb3-b5ec-60cf1a5767c2.png)

Tabela pedido: localhost:8080/pedido/<id do objeto></br>
![image](https://user-images.githubusercontent.com/87920248/169725411-9c4e2c0b-dcba-481c-bab8-cc99c1ffbe83.png)

Tabela itensPedido: localhost:8080/itensPedido/<id do objeto><br/>
![image](https://user-images.githubusercontent.com/87920248/169725435-4403811d-9455-47e8-ab71-b88c009701f8.png)

## DELETE
  Tabela produtoServico: localhost:8080/produtoServico/<id do objeto></br>
  Tabela pedido: localhost:8080/pedido/<id do objeto></br>
  Tabela itensPedido: localhost:8080/itensPedido/<id do objeto></br>

</br>
</br>
</br>
</br>
</br>
  
# Edite o arquivo para copiar os parametros
  

## POST
Tabela produtoServico: localhost:8080/produtoServico/cadastra
{
    "nome": "Massagem",
    "valor": 100,
    "tipo": "2" //tipo 1 = produto | tipo 2 = serviço
}
Tabela pedido: localhost:8080/pedido/cadastra
{
    "valor": "",
    "total": "",
    "desconto": 10.0,
    "produtoServico":{
        "id": "8d3b9a6a-c92d-469d-a0ba-abae3a97e44e",
        "nome": "Massagem",
        "valor": 100.0,
        "tipo": 2 // tipo 1 = produto | tipo 2 = serviço
    }, ...
}
Tabela itensPedido: localhost:8080/itensPedido/cadastra
{
    "nome": "Pedido1",
    "pedido":{
        "id": "ef7bf71b-676b-482f-ae5a-e0a133528ea0"
    },
    "produtoServico":{
        "id": "1861637b-e958-43a5-ae07-adbc39f8ceaf"
    }
}

## PUT
Tabela produtoServico: localhost:8080/produtoServico/<id do objeto>
{
    "nome": "Alterado",
    "valor": 100.0,
    "tipo": 2 // tipo 1 = produto | tipo 2 = serviço
}
Tabela pedido: localhost:8080/pedido/<id do objeto>
{
    "valor": 100.0,
    "total": 80.0,
    "desconto": 20.0,
    "produtoServico": {
        "id": "3db70a41-00a3-455a-acde-270fbb03d7c5",
        "nome": "jump",
        "valor": 100.0,
        "tipo": 2 // tipo 1 = produto | tipo 2 = serviço
    },
}
Tabela itensPedido: localhost:8080/itensPedido/<id do objeto>
{
    "valor": 500.0,
    "total": 500.0,
    "desconto": 1000.0,
    "produtoServico": {
        "id": "a9c4c442-10a2-49e7-9d27-cac2c91c2db4"
    }
}

  </br>
  </br>
  </br>
  
  
# Contatos:

E-mail: rodrigobl1@yahoo.com.br.

Linkedin: https://www.linkedin.com/in/rodrigo-blw/

°•._______{°-°}________.•°
  
  </br>
  </br>
  </br>
  
## Licença

MIT

**Free Software, Hell Yeah!**
