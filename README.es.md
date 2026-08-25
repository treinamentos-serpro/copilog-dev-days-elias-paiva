<!-- l10n-sync: source-file="README.md" -->
<div align="center">

# 🎯 Soc Ops

### **El Social Bingo que convierte a desconocidos en compañeros de equipo**

*Encuentra personas que coincidan con las preguntas · Consigue 5 en línea · Domina la sala*

[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-21-ED8B00?logo=openjdk&logoColor=white)](https://adoptium.net/)
[![GitHub Pages](https://img.shields.io/badge/Docs-GitHub_Pages-181717?logo=github)](https://treinamentos-serpro.github.io/copilog-dev-days-elias-paiva/)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

</div>

---

## ¿Qué es Soc Ops?

**Soc Ops** es una app web de Social Bingo multijugador en tiempo real, diseñada para eventos presenciales — hackatones, talleres, retiros de equipo o cualquier reunión donde romper el hielo importa.

Un host crea una sesión y proyecta el tablero. Los asistentes se unen desde sus teléfonos, buscan personas que coincidan con cada casilla ("Ha visitado 3+ países", "Se despierta antes de las 6am") y corren para completar una línea. El primero en hacer Bingo gana — pero todos se van conociéndose un poco mejor.

> 🛠️ Este proyecto también es el **tema práctico de un taller de GitHub Copilot**, donde construirás nuevas funcionalidades usando codificación asistida por IA, ingeniería de contexto y flujos multi-agente.

---

## ✨ Funcionalidades

| Funcionalidad | Descripción |
|---------------|-------------|
| 🎲 **Tableros dinámicos** | Tarjetas 5×5 únicas generadas automáticamente por jugador |
| 🔴 **Sesiones en vivo** | Estado del juego compartido en tiempo real entre todos los jugadores |
| 🏆 **Detección instantánea de Bingo** | Filas, columnas y diagonales — todo rastreado automáticamente |
| 📱 **UI mobile-first** | Interfaz optimizada para toque que funciona en cualquier pantalla |
| 🌍 **Multilingüe** | Interfaz en Inglés, Portugués y Español |

---

## 🚀 Inicio Rápido

**Requisitos previos:** [Java 21+](https://adoptium.net/) · [Maven 3.9+](https://maven.apache.org/) *(o usa el wrapper `./mvnw` incluido)*

```bash
# 1. Clona el repositorio
git clone https://github.com/treinamentos-serpro/copilog-dev-days-elias-paiva.git
cd copilog-dev-days-elias-paiva/socops

# 2. Ejecuta la app
./mvnw spring-boot:run

# 3. Abre en tu navegador
open http://localhost:8080
```

Otros comandos útiles:

```bash
./mvnw clean package   # generar un JAR
./mvnw test            # ejecutar la suite de pruebas
```

---

## 📚 Guía del Lab del Taller

Este repositorio también sirve como un taller guiado de Copilot. Trabaja los labs en orden:

| Parte | Título | Qué harás |
|-------|--------|-----------|
| [**00**](workshop/es/00-overview.md) | Descripción General y Lista de Verificación | Oriéntate, confirma tu configuración |
| [**01**](workshop/es/01-setup.md) | Configuración e Ingeniería de Contexto | Añade contexto al proyecto, crea prompts de sistema |
| [**02**](workshop/es/02-design.md) | Desarrollo Frontend Orientado al Diseño | Construye una UI refinada con asistencia de Copilot |
| [**03**](workshop/es/03-quiz-master.md) | Quiz Master Personalizado | Crea una skill de agente Copilot personalizada |
| [**04**](workshop/es/04-multi-agent.md) | Desarrollo Multi-Agente | Orquesta agentes para tareas complejas |

> 📖 **[Abrir la Guía Completa del Lab →](workshop/es/GUIDE.md)**

---

## 🤝 Contribuciones

Las contribuciones, issues y solicitudes de funcionalidades son bienvenidas — consulta [CONTRIBUTING.md](CONTRIBUTING.md).

---

<div align="center">

*Se despliega automáticamente en [GitHub Pages](https://treinamentos-serpro.github.io/copilog-dev-days-elias-paiva/) con cada push a `main`.*

</div>
