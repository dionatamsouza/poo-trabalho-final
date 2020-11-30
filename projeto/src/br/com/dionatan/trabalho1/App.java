package br.com.dionatan.trabalho1;

import br.com.dionatan.trabalho1.models.Contato;
import br.com.dionatan.trabalho1.models.Endereco;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    
    public static void main( String[] args ) {
        
        int menu;
        Scanner scanner = new Scanner(System.in);
        List<Contato> contatos = new ArrayList<Contato>();
        
        do {
            System.out.println ("Escolha a opcao desejada :");
            System.out.println ("    1. Inserir contato ");
            System.out.println ("    2. Alterar contato ");
            System.out.println ("    3. Excluir contato ");
            System.out.println ("    4. Listar contatos ");
            System.out.println ("    5. Sair ");
            System.out.print   ("    -> " );
            
            menu = scanner.nextInt();
            
            
            // Inserir Contato
            if (menu==1){
                
                String nome;
                String telefone;
                String email;
                
                String rua;
                String bairro;
                String cidade;
                String estado;
                String pais;
                
                
                scanner.nextLine(); // flush
                
                System.out.println (" Insira o contato: ");
                System.out.print   ("        Nome: " );
                nome = scanner.nextLine();
                System.out.print   ("    Telefone: " );
                telefone = scanner.nextLine();
                System.out.print   ("       Email: " );
                email = scanner.nextLine();
                System.out.print   ("    Endereco: \n" );
                System.out.print   ("     Rua: " );
                rua = scanner.nextLine();
                System.out.print   ("  Bairro: " );
                bairro = scanner.nextLine();
                System.out.print   ("  Cidade: " );
                cidade = scanner.nextLine();
                System.out.print   ("  Estado: " );
                estado = scanner.nextLine();
                System.out.print   ("    Pais: " );
                pais = scanner.nextLine();
                
                Endereco endereco = new Endereco(rua, bairro, cidade, estado, pais);
                Contato  contato  = new Contato(nome, telefone, email, endereco);
                
                contatos.add(contato);
            }
            
            
            // Alterar Contato
            if (menu==2){
            
            }
            
            // Excluir Contato
            if (menu==3){
            
            }
            
            // Listar Contatos
            if (menu==4){
                System.out.println (" Listar : ");
                for (Contato contato : contatos) {
                    System.out.println ("        Nome: " + contato.getNome()     );
                    System.out.println ("    Telefone: " + contato.getTelefone() );
                    System.out.println ("       Email: " + contato.getEmail()    );
                    System.out.println ("    Endereco: " );
                    System.out.println ("     Rua: " + contato.getEndereco().getRua()    );
                    System.out.println ("  Bairro: " + contato.getEndereco().getBairro() );
                    System.out.println ("  Cidade: " + contato.getEndereco().getCidade() );
                    System.out.println ("  Estado: " + contato.getEndereco().getEstado() );
                    System.out.println ("    Pais: " + contato.getEndereco().getPais()   );
                }
            }
            
        } while ( menu != 5 ) ;
        
    }
    
}
