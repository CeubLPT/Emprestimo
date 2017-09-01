/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprestimo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alexandre.Torres
 */
public class Emprestimo {
    private Date data;
    private Date dataDevolucao;
    private boolean emAberto;
    private Livro livro;
    
    public Emprestimo(Livro l){
        this.livro = l;
        this.data = new Date();
        emAberto = true;
    }
    
    public void devolve(){
        emAberto = false;
        dataDevolucao = new Date();
    }

    public Date getData() {
        return data;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public boolean isEmAberto() {
        return emAberto;
    }

    public Livro getLivro() {
        return livro;
    }

    public static void main(String[] args) {
        Emprestimo e = new Emprestimo(null);
        System.out.println(e.getData());
    }
    
    public String toString(){
        SimpleDateFormat format = new SimpleDateFormat( "dd/MM/yyyy");
        String txt = livro + " emprestado em " + format.format(data);
        if (!emAberto){
            txt += " devolvido em " + format.format(dataDevolucao);
        }
            
        return txt;
    }

}
