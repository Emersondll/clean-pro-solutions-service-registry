# Clean Pro Solutions - Service Registry 🌐

## 🎯 Papel no Ecossistema
O **Service Registry** é o catálogo vivo de todos os microserviços em execução. Baseado no Netflix Eureka, ele permite que:
- Microserviços se encontrem sem conhecer IPs fixos.
- Haja balanceamento de carga entre instâncias do mesmo serviço.
- O ecossistema seja resiliente e escalável.

## 🚀 Tecnologias
- **Java 21** & **Spring Boot 3.3.4**
- **Spring Cloud Netflix Eureka Server**

## 🛠️ Como Executar

### 1. Execução Isolada (Individual)
Para rodar o registry:
```bash
docker-compose up -d --build
```
O painel do Eureka estará disponível em `http://localhost:8761`.

### 2. Execução Integrada
Este serviço é o primeiro a subir na orquestração principal [Clean Pro Platform](../README.md).

---
© 2026 Clean Pro Solutions - Desenvolvido por Emerson Lima.
