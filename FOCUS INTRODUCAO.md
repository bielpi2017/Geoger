# Documentação do Projeto — FocusWork

## 1. Nome do Projeto

**FocusWork – Sistema de Organização para Universitários que Trabalham**

---

## 2. Definição do Problema

Muitos universitários precisam conciliar estudos, trabalho e vida pessoal. A falta de organização causa atrasos em atividades, esquecimento de prazos, baixo rendimento acadêmico e aumento do estresse.

---

## 3. Objetivo Geral

Desenvolver uma plataforma que permita ao usuário organizar tarefas acadêmicas e profissionais em um único ambiente.

### Objetivos Específicos

- Gerenciar tarefas e atividades.
- Organizar horários de estudo.
- Controlar datas de provas e trabalhos.
- Emitir lembretes.
- Acompanhar produtividade.

---

## 4. Requisitos

### Requisitos Funcionais

- **RF01** – Realizar cadastro de usuário.
- **RF02** – Realizar login.
- **RF03** – Cadastrar disciplinas.
- **RF04** – Cadastrar tarefas.
- **RF05** – Editar tarefas.
- **RF06** – Excluir tarefas.
- **RF07** – Marcar tarefas como concluídas.
- **RF08** – Visualizar calendário.
- **RF09** – Receber lembretes.
- **RF10** – Visualizar relatórios de produtividade.

### Requisitos Não Funcionais

- **RNF01** – Interface intuitiva.
- **RNF02** – Sistema responsivo.
- **RNF03** – Segurança dos dados.
- **RNF04** – Disponibilidade 24 horas.
- **RNF05** – Tempo de resposta inferior a 3 segundos.

---

## 5. Diagrama de Casos de Uso (UML)

```text
                +----------------+
                |    Usuário     |
                +----------------+
                        |
        ---------------------------------
        |        |        |      |      |
        V        V        V      V      V

   [Cadastrar] [Login] [Gerenciar Tarefas]
                              |
                ---------------------------
                |            |            |
                V            V            V
          [Cadastrar]   [Editar]   [Excluir]

                        |
                        V
             [Concluir Tarefa]

                        |
                        V
               [Ver Calendário]

                        |
                        V
               [Receber Lembretes]

                        |
                        V
            [Visualizar Relatórios]
```

---

## 6. Diagrama de Classes (UML)

```text
+------------------+
|     Usuario      |
+------------------+
| id: int          |
| nome: String     |
| email: String    |
| senha: String    |
+------------------+
| login()          |
| cadastrar()      |
+------------------+

          1
          |
          |
          *
+------------------+
|      Tarefa      |
+------------------+
| id: int          |
| titulo: String   |
| descricao:String |
| prazo: Date      |
| status:String    |
+------------------+
| criar()          |
| editar()         |
| excluir()        |
| concluir()       |
+------------------+

          *
          |
          |
          1

+------------------+
|   Disciplina     |
+------------------+
| id: int          |
| nome: String     |
| professor:String |
+------------------+

+------------------+
|   Calendario     |
+------------------+
| id: int          |
| data: Date       |
+------------------+
| exibirEventos()  |
+------------------+

+------------------+
|   Relatorio      |
+------------------+
| id: int          |
| produtividade    |
+------------------+
| gerarRelatorio() |
+------------------+
```

---

## 7. Banco de Dados

### Tabela Usuario

| Campo | Tipo |
|---------|---------|
| id | INT |
| nome | VARCHAR(100) |
| email | VARCHAR(100) |
| senha | VARCHAR(255) |

### Tabela Disciplina

| Campo | Tipo |
|---------|---------|
| id | INT |
| nome | VARCHAR(100) |
| professor | VARCHAR(100) |

### Tabela Tarefa

| Campo | Tipo |
|---------|---------|
| id | INT |
| titulo | VARCHAR(100) |
| descricao | TEXT |
| prazo | DATE |
| status | VARCHAR(20) |
| usuario_id | INT |

---

## 8. Tecnologias

- Front-end: ...
- Back-end: ...
- Banco de Dados: MySQL
- Versionamento: ...
- Prototipação: ...

---

## 9. Cronograma

| Fase | Duração |
|---------|---------|
| Planejamento | 1 semana |
| Modelagem | 1 semana |
| Protótipo | 1 semana |
| Desenvolvimento | 4 semanas |
| Testes | 1 semana |
| Entrega | 1 semana |

---

## 10. Benefícios

- Melhor organização acadêmica.
- Redução de atrasos.
- Maior produtividade.
- Controle da rotina de estudos e trabalho.
- Melhor gestão do tempo.

---

## 11. Conclusão

O FocusWork é uma solução voltada para estudantes universitários que precisam conciliar estudos e trabalho. A plataforma busca centralizar a gestão das atividades acadêmicas e profissionais, promovendo maior organização, produtividade e eficiência no gerenciamento do tempo.
