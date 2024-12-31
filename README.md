# Sistema de Gerenciamento de Cursos e Professores

Este é um projeto básico em Java que implementa um sistema de gerenciamento de cursos e professores. Ele utiliza conceitos de programação orientada a objetos (POO) e estruturas de dados, como listas, para armazenar informações e oferecer funcionalidades interativas via console.

## Funcionalidades

O sistema oferece as seguintes funcionalidades:

- **Gerenciamento de Cursos**:
  - Adicionar novos cursos.
  - Listar cursos disponíveis.
  - Marcar cursos como concluídos.
  - Remover cursos.
- **Gerenciamento de Professores**:
  - Adicionar novos professores.
  - Listar professores registrados.
  - Remover professores.
- **Visualização**:
  - Separação entre cursos disponíveis e concluídos para melhor organização.

## Estrutura do Projeto

### Classes Principais
- **Curso**: Representa um curso com informações como nome, descrição, lista de professores associados e carga horária.
- **Professor**: Representa um professor, incluindo nome e disciplina lecionada.

### Classe `Main`
A classe principal é responsável por gerenciar a interação com o usuário através de um menu interativo no console, permitindo a execução das funcionalidades descritas acima.

## Tecnologias e Conceitos Utilizados

- **Java**: Linguagem de programação utilizada.
- **POO (Programação Orientada a Objetos)**: Aplicação de encapsulamento, métodos e classes para modularidade.
- **Coleções Java**: Uso de `ArrayList` para armazenar objetos dinâmicos.
- **Scanner**: Para entrada de dados do usuário.
- Estruturas de controle como `switch` para navegação no menu.

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git

2. Compile os arquivos Java:
   ```bash
   javac src/main/**/*.java

4. Execute o programa:
   ```bash
   java src.main.Main

### Exemplo de entrada

Escolha uma das opções:

1 - Adicionar Curso  
2 - Adicionar Professor  
3 - Remover Curso  
4 - Remover Professor  
5 - Listar Cursos  
6 - Listar Professores  
7 - Marcar Curso como concluído  
0 - Sair  

- Adicionar Curso: Permite inserir o nome e a descrição de um curso.  
- Listar Cursos: Exibe todos os cursos cadastrados, separados por disponíveis e concluídos.  

### Exemplo de saída  

Lista de Cursos - Disponíveis:  
1 - Curso: Java Básico, Descrição: Introdução à linguagem Java.  
Lista de Cursos - Concluídos:  
Nenhum curso encontrado.  
