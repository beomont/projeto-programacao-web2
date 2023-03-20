# Projeto Final WEB II

Tecnologias utilizadas

Este projeto utiliza as seguintes tecnologias:

<img width="40" height="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" /> <img width="40" height="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original-wordmark.svg" /> <img width="40" height="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/git/git-original-wordmark.svg" />
         
          
## Projeto CRUD com Java Spring e H2
Este é um projeto de um aplicativo CRUD utilizando Java Spring e o banco de dados H2. 
Ele permite que os usuários criem, leiam, atualizem e excluam dados em uma ou mais tabelas.

#### Pré-requisitos
Antes de começar, você deve ter as seguintes ferramentas instaladas em seu sistema:

- Java JDK 11 ou superior
- Maven
- Um IDE Java, como o Eclipse ou o IntelliJ IDEA

#### Instalação
Para instalar e executar o projeto, siga estas etapas:

- Clone este repositório em seu sistema local.
- Abra o projeto em seu IDE Java.
- Execute o comando `mvn clean install` para compilar o projeto e baixar as dependências necessárias.
- Execute o aplicativo utilizando o comando `mvn spring-boot:run`.

O aplicativo será executado em http://localhost:8080.

#### Uso
O aplicativo possui uma API REST que permite que os usuários realizem operações CRUD em uma tabela de exemplo. 

Os seguintes endpoints estão disponíveis:

- GET /endpoint: Retorna todos os registros na tabela de exemplo.
- GET /endpoint/{id}: Retorna o registro correspondente ao ID fornecido.
- POST /endpoint: Cria um novo registro com base nos dados fornecidos.
- PUT /endpoint/{id}: Atualiza o registro correspondente ao ID fornecido com os dados fornecidos.
- DELETE /endpoint/{id}: Exclui o registro correspondente ao ID fornecido.
