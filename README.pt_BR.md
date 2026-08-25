<!-- l10n-sync: source-file="README.md" -->
<div align="center">

# 🎯 Soc Ops

### **O Social Bingo que transforma desconhecidos em companheiros de equipe**

*Encontre pessoas que correspondam às perguntas · Faça 5 em linha · Domine a sala*

[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-21-ED8B00?logo=openjdk&logoColor=white)](https://adoptium.net/)
[![GitHub Pages](https://img.shields.io/badge/Docs-GitHub_Pages-181717?logo=github)](https://treinamentos-serpro.github.io/copilog-dev-days-elias-paiva/)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

</div>

---

## O que é o Soc Ops?

**Soc Ops** é um web app de Social Bingo multiplayer em tempo real, projetado para eventos presenciais — hackathons, workshops, off-sites de equipe ou qualquer encontro onde quebrar o gelo importa.

Um host cria uma sessão e projeta o quadro. Os participantes entram pelo celular, procuram pessoas que correspondam a cada quadrado ("Já visitou 3+ países", "Acorda antes das 6h") e correm para completar uma linha. O primeiro a fazer Bingo vence — mas todos saem se conhecendo um pouco melhor.

> 🛠️ Este projeto também é o **tema prático de um workshop sobre GitHub Copilot**, onde você vai construir novas funcionalidades usando codificação assistida por IA, engenharia de contexto e fluxos multi-agente.

---

## ✨ Funcionalidades

| Funcionalidade | Descrição |
|----------------|-----------|
| 🎲 **Quadros dinâmicos** | Cartelas 5×5 únicas geradas automaticamente por jogador |
| 🔴 **Sessões ao vivo** | Estado do jogo compartilhado em tempo real entre todos os jogadores |
| 🏆 **Detecção instantânea de Bingo** | Linhas, colunas e diagonais — tudo rastreado automaticamente |
| 📱 **UI mobile-first** | Interface otimizada para toque que funciona em qualquer tela |
| 🌍 **Multilíngue** | Interface em Inglês, Português e Espanhol |

---

## 🚀 Início Rápido

**Pré-requisitos:** [Java 21+](https://adoptium.net/) · [Maven 3.9+](https://maven.apache.org/) *(ou use o wrapper `./mvnw` incluído)*

```bash
# 1. Clone o repositório
git clone https://github.com/treinamentos-serpro/copilog-dev-days-elias-paiva.git
cd copilog-dev-days-elias-paiva/socops

# 2. Execute o app
./mvnw spring-boot:run

# 3. Abra no navegador
open http://localhost:8080
```

Outros comandos úteis:

```bash
./mvnw clean package   # gerar um JAR
./mvnw test            # rodar a suite de testes
```

---

## 📚 Guia do Lab do Workshop

Este repositório também serve como um workshop guiado do Copilot. Siga os labs em ordem:

| Parte | Título | O que você vai fazer |
|-------|--------|----------------------|
| [**00**](workshop/pt_BR/00-overview.md) | Visão Geral & Lista Rápida | Oriente-se, confirme sua configuração |
| [**01**](workshop/pt_BR/01-setup.md) | Configuração & Engenharia de Contexto | Adicione contexto ao projeto, crie prompts de sistema |
| [**02**](workshop/pt_BR/02-design.md) | Frontend Design-First | Construa uma UI refinada com assistência do Copilot |
| [**03**](workshop/pt_BR/03-quiz-master.md) | Quiz Master Personalizado | Crie uma skill de agente Copilot personalizada |
| [**04**](workshop/pt_BR/04-multi-agent.md) | Desenvolvimento Multi-Agente | Orquestre agentes para tarefas complexas |

> 📖 **[Abrir o Guia Completo do Lab →](workshop/pt_BR/GUIDE.md)**

---

## 🤝 Contribuindo

Contribuições, issues e solicitações de funcionalidades são bem-vindas — veja [CONTRIBUTING.md](CONTRIBUTING.md).

---

<div align="center">

*Deploy automático no [GitHub Pages](https://treinamentos-serpro.github.io/copilog-dev-days-elias-paiva/) a cada push para `main`.*

</div>
