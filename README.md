# Wallet API

Projeto de estudo em arquitetura de **microserviços** com Java + Spring Boot.

## Serviços

| Serviço | Descrição | Status |
|---------|-----------|--------|
| [`hr-worker`](./hr-worker) | Cadastro de trabalhadores (workers) e cálculo de renda diária | 🚧 em desenvolvimento |

> Novos microserviços serão adicionados como subpastas neste monorepo.

## Stack

- Java + Spring Boot
- Maven (wrapper incluído: `./mvnw`)
- JPA / Hibernate
- Lombok

## Como rodar um serviço

```bash
cd hr-worker
./mvnw spring-boot:run
```
