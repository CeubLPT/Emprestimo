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
public class PessoaFisica extends Pessoa{
    private String cpf;
    
    public PessoaFisica(String nome, String cpf){
        super(nome);        
        this.cpf = cpf;
    }    
    public String getCpf() {
        return cpf;
    }
    
    public boolean validaId(){
        return validaCpf();
    }
    
    public boolean validaCpf(){
        boolean valido = true;
        
        if (cpf.length() != 11)
            return false;
        
        try {
            // verifica se só existem números
            char[] caracteres = cpf.toCharArray();
                        
            for (char c:caracteres){
                // essa conversão é usada apenas para ver se gera erro
                int i = (int)c;
            }
                
        } catch (Exception e) {
            // erro de conversão
            valido = false;
           
        }
        
        return valido;
       
    }    
    
}
