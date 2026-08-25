<div align="center">

# 🎯 Soc Ops

### **The Social Bingo that turns strangers into teammates**

*Find people who match the prompts · Score 5 in a row · Win the room*

[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-21-ED8B00?logo=openjdk&logoColor=white)](https://adoptium.net/)
[![GitHub Pages](https://img.shields.io/badge/Docs-GitHub_Pages-181717?logo=github)](https://treinamentos-serpro.github.io/copilog-dev-days-elias-paiva/)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

🌐 [Português (BR)](README.pt_BR.md) | [Español](README.es.md)

</div>

---

## What is Soc Ops?

**Soc Ops** is a real-time, multiplayer Social Bingo web app designed for live in-person events — hackathons, workshops, team off-sites, or any gathering where breaking the ice matters.

A host creates a session and projects the board. Attendees join on their phones, hunt for people who match each square ("Has visited 3+ countries", "Wakes up before 6am"), and race to complete a row. The first to Bingo wins — but everyone leaves knowing each other a little better.

> 🛠️ This project is also the **hands-on subject of a GitHub Copilot workshop**, where you'll build new features using AI-assisted coding, context engineering, and multi-agent workflows.

---

## ✨ Features

| Feature | Description |
|---------|-------------|
| 🎲 **Dynamic boards** | Unique 5×5 bingo cards auto-generated per player |
| 🔴 **Live sessions** | Real-time game state shared across all players |
| 🏆 **Instant Bingo detection** | Rows, columns, and diagonals — all tracked automatically |
| 📱 **Mobile-first UI** | Tap-friendly interface that works on any screen |
| 🌍 **Multilingual** | UI in English, Português, and Español |

---

## 🚀 Quick Start

**Prerequisites:** [Java 21+](https://adoptium.net/) · [Maven 3.9+](https://maven.apache.org/) *(or use the included `./mvnw` wrapper)*

```bash
# 1. Clone the repo
git clone https://github.com/treinamentos-serpro/copilog-dev-days-elias-paiva.git
cd copilog-dev-days-elias-paiva/socops

# 2. Run the app
./mvnw spring-boot:run

# 3. Open in your browser
open http://localhost:8080
```

Other useful commands:

```bash
./mvnw clean package   # build a JAR
./mvnw test            # run the test suite
```

---

## 📚 Workshop Lab Guide

This repo doubles as a guided Copilot workshop. Work through the labs in order:

| Part | Title | What you'll do |
|------|-------|----------------|
| [**00**](workshop/00-overview.md) | Overview & Checklist | Orient yourself, confirm your setup |
| [**01**](workshop/01-setup.md) | Setup & Context Engineering | Add project context, craft system prompts |
| [**02**](workshop/02-design.md) | Design-First Frontend | Build a polished UI with Copilot assistance |
| [**03**](workshop/03-quiz-master.md) | Custom Quiz Master | Create a custom Copilot agent skill |
| [**04**](workshop/04-multi-agent.md) | Multi-Agent Development | Orchestrate agents for complex tasks |

> 📖 **[Open the full Lab Guide →](workshop/GUIDE.md)**

---

## 🤝 Contributing

Contributions, issues, and feature requests are welcome — see [CONTRIBUTING.md](CONTRIBUTING.md).

---

<div align="center">

*Automatically deployed to [GitHub Pages](https://treinamentos-serpro.github.io/copilog-dev-days-elias-paiva/) on every push to `main`.*

</div>
