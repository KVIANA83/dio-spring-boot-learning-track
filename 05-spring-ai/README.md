# 💰 Budgeting API com Spring Boot + Spring AI

Este projeto é uma API inteligente de controle de transações financeiras, desenvolvida com Spring Boot e Spring AI, permitindo interação com IA através de comandos de voz, processamento de texto e execução de funções reais da aplicação.

---

## 🚀 Objetivo do Projeto

O objetivo é construir uma API capaz de:

* Receber comandos de áudio do usuário
* Transcrever áudio em texto
* Interpretar a intenção usando Inteligência Artificial
* Executar ações reais na aplicação (Tool Calling)
* Criar e consultar transações financeiras
* Retornar respostas também em formato de áudio

---

## 🧠 Funcionalidades

### 📌 Transações financeiras

* Criar transação
* Listar transações por categoria
* Persistência em banco de dados MySQL

### 🎙️ Integração com IA

* Transcrição de áudio para texto
* Interpretação de comandos via IA
* Tool Calling para execução de regras da aplicação

### 🔊 Resposta em áudio

* Conversão da resposta da IA em áudio (Text-to-Speech)

---

## 🛠️ Tecnologias utilizadas

* Java 21
* Spring Boot 4
* Spring Web
* Spring Data JPA
* Spring AI
* MySQL
* Gradle
* Docker

---

## 📂 Estrutura do projeto

dio.budgeting
├── application        (casos de uso)
├── domain             (regras de negócio)
├── infrastructure
│   ├── http           (controllers REST + IA)
│   └── persistence    (repositórios JPA)
└── BudgetingApplication.java

---

## ▶️ Como executar o projeto

### 1. Clonar o repositório

git clone [https://github.com/SEU-USUARIO/SEU-REPOSITORIO.git](https://github.com/SEU-USUARIO/SEU-REPOSITORIO.git)

---

### 2. Subir o banco de dados

docker-compose up -d

---

### 3. Rodar a aplicação

./gradlew bootRun

---

## 📡 Endpoints da API

### 🔹 Criar transação

POST /transactions

{
"category": "GROCERIES",
"description": "Compra no mercado",
"amount": 25000
}

---

### 🔹 Listar transações por categoria

GET /transactions/{category}

/transactions/GROCERIES

---

### 🔹 Processamento com IA (áudio → texto → ação → áudio)

POST /transactions/ai

Enviar como:

* multipart/form-data
* file (arquivo de áudio)

---

## 🧪 Fluxo da IA

1. Usuário envia áudio
2. Sistema transcreve áudio para texto
3. IA interpreta a intenção
4. Tool Calling executa a ação
5. Resposta é gerada em áudio

---

## 📌 Aprendizados

* Integração de IA com aplicações Java
* Spring AI e Tool Calling
* Arquitetura em camadas
* Persistência com Spring Data JPA
* Processamento de áudio no backend

---

## 📈 Possíveis melhorias

* Autenticação com Spring Security
* Dashboard financeiro
* Relatórios mensais com IA
* Validações de entrada
* Testes automatizados

---

## 👩‍💻 Autor

Projeto desenvolvido como parte do desafio da DIO - Spring AI

