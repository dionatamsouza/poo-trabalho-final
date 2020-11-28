package br.com.dionatan.trabalho1;


import br.com.dionatan.trabalho1.models.Contato;
import br.com.dionatan.trabalho1.models.Endereco;


import java.util.Scanner;


public class App {
    
    public static void main( String[] args ) {
        
        List<Contato> contatos = new ArrayList<Contato>();
        
        int menu;
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println ("Escolha a opcao desejada :");
            System.out.println ("    1. Inserir contato ");
            System.out.println ("    2. Alterar contato ");
            System.out.println ("    3. Excluir contato ");
            System.out.println ("    4. Listar contatos ");
            System.out.println ("    5. Sair ");
            
            menu = scanner.nextInt();
            
            System.out.println ("    nr " + menu );
            
        } while ( menu != 5 ) ;
        
        // Listando todos
        /*
        for (Contato contato : contatos) {
            System.out.println( "Nome: " + contato.getNome() );
        }
        */
    }
    
}
