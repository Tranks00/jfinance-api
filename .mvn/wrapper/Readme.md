# 💰 JFinance API

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Management-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

## 📋 Sobre o Projeto

O **JFinance** é uma API RESTful desenvolvida para gerenciamento de finanças pessoais. O objetivo principal deste projeto foi aplicar conceitos modernos do **Java 21** e do ecossistema **Spring Boot 3** na construção de uma aplicação backend robusta.

O sistema permite o registro de transações financeiras (receitas e despesas), listagem de histórico e cálculo automático de saldo em tempo real, servindo tanto dados JSON quanto uma interface web simples.

## 🚀 Tecnologias e Práticas Utilizadas

Este projeto vai além do básico, implementando recursos recentes da linguagem:

* **Java 21 (LTS):** Uso da versão mais estável e moderna.
* **Java Records:** Para modelagem de dados imutáveis (DTOs), reduzindo *boilerplate code*.
* **Stream API:** Manipulação funcional de coleções para cálculos de saldo e filtragem de dados.
* **Spring Boot 3 (Web):** Criação de endpoints REST.
* **Frontend Integrado:** Interface simples em HTML5 e Vanilla JS consumindo a própria API.

## ⚙️ Funcionalidades

- [x] **Cadastro de Transações:** Registro de Entradas (Receitas) e Saídas (Despesas).
- [x] **Listagem Geral:** Visualização de todas as movimentações.
- [x] **Cálculo de Saldo:** Processamento automático (Receitas - Despesas).
- [x] **API REST:** Endpoints padronizados para integração.

## 🔌 Endpoints da API

A API roda nativamente na porta `8080`.

| Método | Endpoint           | Descrição                          |
| :----- | :----------------- | :--------------------------------- |
| `GET`  | `/api/transacoes`  | Lista todas as transações em JSON. |
| `POST` | `/api/transacoes`  | Cria uma nova transação.           |
| `GET`  | `/api/saldo`       | Retorna o valor do saldo atual.    |

### Exemplo de JSON para `POST`:
```json
{
  "descricao": "Freelance Java",
  "valor": 1500.00,
  "tipo": "RECEITA"
}
## 🛠️ Como Executar o Projeto

Siga estas instruções para rodar a API na sua máquina local.

### Pré-requisitos
Antes de começar, você precisa ter instalado:
* **Java JDK 21** (ou 17)
* **Git**

### Passo a Passo

1. **Clone o repositório:**
   Abra seu terminal e digite:
   ```bash
   git clone [https://github.com/Tranks00/jfinance-api.git](https://github.com/Tranks00/jfinance-api.git)
