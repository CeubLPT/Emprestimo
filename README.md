# Emprestimo
Exercício para associação de classes e herança.

Você deverá implementar o seguinte modelo:

**Atenção: não implementar as classes `PessoaFisica` e `PessoaJuridica` até ter visto a matéria de herança**

![emprestimo 2](https://user-images.githubusercontent.com/20231710/30089721-e9115e4c-9284-11e7-9ff0-f01467feedd1.png)

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

