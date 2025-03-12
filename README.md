# MagicFridgeAI 🍳🤖

**MagicFridgeAI** é um aplicativo que ajuda os usuários a criar receitas com base nos alimentos disponíveis em sua geladeira. Através de uma API, os usuários podem cadastrar alimentos e o sistema irá sugerir receitas criativas e práticas com base nesses ingredientes.

## Tecnologias ⚙️

- **Java** ☕ com **Spring Boot** 🚀
- **Banco de Dados**: **H2** 🗄️ (em memória)
- **Integração com OpenAI API** 💡 (para gerar receitas usando GPT-3.5)
- **WebClient** 🌐 para integração com APIs externas
- **Spring WebFlux** 🔄 para programação reativa

## Funcionalidades ✨

- Cadastro de alimentos com informações como nome, categoria, quantidade e validade 🍎🥩
- Geração de receitas com base nos alimentos cadastrados 🍴
- Integração com a **OpenAI** para sugestão de receitas utilizando **GPT-3.5** 🤖
- Aplicação leve e fácil de usar

## Como rodar o projeto localmente 🖥️

### Pré-requisitos ⚠️

Antes de começar, você vai precisar de:

- **Java 11+** instalado ☕
- **Maven** ou **Gradle** (dependendo de qual você estiver utilizando) 🛠️
- Uma **chave da OpenAI API** 🔑 (necessária para gerar as receitas)

### Passos 🚶‍♂️

1. Clone o repositório:

   ```bash
   git clone https://github.com/Morettys2/MagicFridgeAI.git
   cd MagicFridgeAI
