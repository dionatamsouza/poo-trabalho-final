package br.com.dionatan.trabalho1;


import br.com.dionatan.trabalho1.models.Contato;
import br.com.dionatan.trabalho1.models.Endereco;


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


/*
    Scanner sc = new Scanner(System.in);

    float numF = sc.nextFloat();
    int num1 = sc.nextInt();
    byte byte1 = sc.nextByte();
    long lg1 = sc.nextLong();
    boolean b1 = sc.nextBoolean();
    double num2 = sc.nextDouble();
    String nome = sc.nextLine();
*/
