/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprestimo;

/**
 *
 * @author Alexandre.Torres
 */
public class Controle {
    public static void main(String[] args) {
        
        Pessoa p = new PessoaFisica("Antonio", "89647895931");
        
        if ( !p.validaId())
            System.out.println("ID invalida");
        
        Livro l = new Livro("Senhor dos Anéis", 
                            1000, 
                            new Editora( "Intrínseca"));
        
        p.empresta(l);
        p.empresta( new Livro("Senhor dos Anéis", 
                        1000, 
                        new Editora( "Intrínseca")));
        System.out.println( p.emprestimos());
        
    }
    
}
