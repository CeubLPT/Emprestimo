# Emprestimo
Exercício para associação de classes e herança.

Você deverá implementar o seguinte modelo:

**Atenção: não implementar as classes `PessoaFisica` e `PessoaJuridica` até ter visto a matéria de herança**


![emprestimo 1](https://user-images.githubusercontent.com/20231710/30089356-9a7d03f0-9282-11e7-91ac-10fccbe08198.png)

## Fase 1

Implemente as classes e os métodos acessores. Nâo existem grandes complicações.

Vamos observar o relacionamento entre `Pessoa` e `Emprestimo`:
1. `Pessoa` tem n `Emprestimo`, então você deverá implementar o relacionamento como uma coleção. 
2. `Emprestimo` tem uma `Pessoa`, então o relacionamento será feito pelo atributo `Pessoa pessoa`.

Este é um relacionamento de dupla navegabilidade, então, quando um livro for emprestado ambos os lados deverão ser mantidos. Como isso será feito?
O método `empresta(Livro livro)` da classe `Pessoa` deverá:
1. incluir o livro na coleção.
2. chamaro `emprestimo.empresta(this, Livro)`
3. este último método irá setar o relacionamento `Emprestimo-Pessoa` e `Emprestimo-Livro`

