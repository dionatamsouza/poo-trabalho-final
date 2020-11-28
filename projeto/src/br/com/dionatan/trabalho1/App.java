package br.com.dionatan.trabalho1;


import br.com.dionatan.trabalho1.models.Contato;
import br.com.dionatan.trabalho1.models.Endereco;


public class App {
    
    public static void main( String[] args ) {
        
        
        
        List<Contato> contatos = new ArrayList<Contato>();
        
        // Listando todos
        for (Contato contato : contatos) {
            System.out.println( "Nome: " + contato.getNome() );
        }
        
    }
    
}
