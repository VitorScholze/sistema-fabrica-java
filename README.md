# sistema-fabrica-java
# 🏭 Sistema de Produção e Controle de Estoque em Java

Este projeto é um sistema simples de controle de estoque e produção, desenvolvido em Java com foco em prática de lógica de programação e orientação a objetos.

---

## 🚀 Funcionalidades

* Cadastro de matérias-primas
* Controle de estoque
* Cadastro de produtos com receita (materiais necessários)
* Produção de produtos baseada no estoque disponível
* Validação de quantidade antes da produção
* Menu interativo via terminal

---

## 🧠 Conceitos aplicados

* Programação Orientada a Objetos (POO)
* Listas (`ArrayList`)
* Encapsulamento
* Separação de responsabilidades (Sistema x Estoque)
* Lógica de validação antes de execução (simulação de produção)

---

## 🏗️ Estrutura do projeto

* `Sistema` → controla o fluxo do sistema
* `Estoque` → gerencia os materiais disponíveis
* `Produto` → representa o produto final
* `MateriaPrima` → representa os materiais
* `ItemEstoque` → controla quantidade de materiais
* `ItemReceita` → define o que é necessário para produzir um produto
* `Main` → ponto de execução

---

## 📌 Exemplo de uso

* Cadastrar matéria-prima (ex: madeira, metal)
* Cadastrar produto (ex: martelo → 2 madeira + 3 metal)
* Produzir produto informando quantidade
* Sistema valida o estoque antes de permitir produção

---

## 📈 Objetivo do projeto

Este projeto foi desenvolvido para praticar lógica de programação e simular um sistema real de controle de produção.

