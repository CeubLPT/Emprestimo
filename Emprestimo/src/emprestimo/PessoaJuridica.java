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
public class PessoaJuridica extends Pessoa{
    private String cnpj;
    
    public PessoaJuridica(String nome, String cnpj){
        super(nome);        
        this.cnpj = cnpj;
    }    

    public String getCnpj() {
        return cnpj;
    }

    public boolean validaId(){
        return validaCnpj();
    }
    
    public boolean validaCnpj(){
        boolean valido = true;
        
        if (cnpj.length() != 13 && cnpj.length() != 14)
            return false;
        
        try {
            // verifica se só existem números
            char[] caracteres = cnpj.toCharArray();
                        
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
