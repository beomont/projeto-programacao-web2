# Projeto Final WEB II - Santander Coders 2022

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
O aplicativo possui uma API REST que permite que os usuários realizem operações CRUD nas tabelas abaixo. 

Os seguintes endpoints estão disponíveis:

#### Categoria
- GET /categorias: Retorna todos os registros na tabela de Categorias.
- GET /categorias/{id}: Retorna o registro correspondente ao ID fornecido.
- POST /categorias: Cria um novo registro com base nos dados fornecidos.
- PUT /categorias/{id}: Atualiza o registro correspondente ao ID fornecido com os dados fornecidos.
- DELETE /categorias/{id}: Exclui o registro correspondente ao ID fornecido.


#### Editora
- GET /editoras: Retorna todos os registros na tabela de Editoras.
- GET /editoras/{id}: Retorna o registro correspondente ao ID fornecido.
- POST /editoras: Cria um novo registro com base nos dados fornecidos.
- PUT /editoras/{id}: Atualiza o registro correspondente ao ID fornecido com os dados fornecidos.
- DELETE /editoras/{id}: Exclui o registro correspondente ao ID fornecido.


#### Livros
- GET /livros: Retorna todos os registros na tabela de Editoras.
- GET /livros/{id}: Retorna o registro correspondente ao ID fornecido.
- GET /livros/filter: Filtra por nome e/ou ISBN os registros correspondentes de Livros.
- GET /livros/categoria/{idCategoria}: Filtra livros por Categoria correspondentes ao ID fornecido.
- GET /livros/editora/{idEditora}: Filtra livros por Editora correspondentes ao ID fornecido.
- POST /livros: Cria um novo registro com base nos dados fornecidos.
- PUT /livros/{id}: Atualiza o registro correspondente ao ID fornecido com os dados fornecidos.
- DELETE /livros/{id}: Exclui o registro correspondente ao ID fornecido.
