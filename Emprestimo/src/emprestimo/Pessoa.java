/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprestimo;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Alexandre.Torres
 */
public abstract class Pessoa {
    private String nome;
    private Collection<Emprestimo> emprestimos = new ArrayList<>();
    
    
    public Pessoa(String nome){
        this.nome = nome;
    }

    public void empresta(Livro l){
        emprestimos.add( new Emprestimo(l));
    }
    public String getNome() {
        return nome;
    }

    public Collection<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
    
    public String emprestimos(){
        String txt = "";
        
        for (Emprestimo e:emprestimos)
            txt += e + "\n";
        
        return txt;
        
    }
    public abstract boolean validaId();
   
}
