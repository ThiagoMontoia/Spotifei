# Relatório Projeto Spotifei

## 1. Apresentação

Este projeto consiste no desenvolvimento de um sistema desktop para gerenciamento de músicas, playlists e histórico de interações do usuário. A aplicação foi construída em Java, utilizando Swing para a interface, e PostgreSQL como banco de dados. O sistema permite cadastro/login de usuário, busca de músicas, criação e edição de playlists, além de curtir e descurtir músicas.

---

## 2. Tecnologias e Estrutura


Arquitetura em camadas com:  
- **Model:** Representação das entidades (Usuário, Música, Playlist, Histórico)  
- **DAO:** Camada para acesso e manipulação dos dados no banco  
- **View:** Interfaces gráficas para interação do usuário  
- **Controller:** Lógica de controle integrada para coordenar ações  

- **Linguagem:** Java  
- **Interface:** Swing (Java GUI)  
- **Banco de Dados:** PostgreSQL  
- **IDE:** NetBeans  
- **Acesso ao Banco:** JDBC  
- **Controle de Versão:** Git/GitHub  


---

## 3. Banco de Dados - Tabelas Principais

| Tabela            | Descrição                                          |
|-------------------|---------------------------------------------------|
| **usuario**       | Dados dos usuários cadastrados                     |
| **musica**        | Informações das músicas (nome, artista, gênero)   |
| **playlist**      | Playlists criadas pelos usuários                    |
| **playlist_musica** | Relação entre playlists e suas músicas            |
| **musica_curtida** | Registro das curtidas e descurtidas pelas músicas |
| **historico**     | Histórico das músicas pesquisadas e interações     |

---

## 4. Funcionalidades Implementadas

### 4.1 Cadastro e Login  
- Cadastro com validação para evitar duplicidade.  
- Login para acesso às demais funcionalidades.  

### 4.2 Busca de Músicas  
- Pesquisa por nome, artista ou gênero.  
- Exibição dos resultados em tabela, com opção para curtir ou descurtir.  

### 4.3 Gerenciamento de Playlists  
- Criação, visualização, adição e remoção de músicas nas playlists.  

### 4.4 Curtir e Descurtir  
- Registra o status da interação (curtiu/descurtiu) no banco.  

### 4.5 Histórico  
- Apresenta últimas músicas buscadas e ações do usuário.  

---

## 5. Dificuldades e Soluções

- Sincronizar dados entre telas diferentes.  
- Validar dados inconsistentes do banco.  
- Otimizar consultas para melhorar performance.  
---

## 6. Execução do Projeto

1. Importar o projeto na IDE NetBeans.  
2. Configurar o arquivo `Conexao.java` com as credenciais do PostgreSQL.  
3. Executar os scripts SQL presentes na pasta `/sql` para criar e popular as tabelas.  
4. Compilar e rodar o projeto.  
5. Gerar o `.jar` para distribuição, se desejar.  
6. Gerar documentação Javadoc via IDE.  

---

## 7. Músicas para Testar

| Nome               | Artista         | Gênero       |
|--------------------|-----------------|--------------|
| Havana             | Camila Cabello  | Pop          |
| Lose Yourself      | Eminem          | Hip Hop      |
| Yesterday          | The Beatles     | Rock         |
| Rolling in the Deep| Adele           | Soul         |
| La Camisa Negra    | Juanes          | Pop Latino   |

---
