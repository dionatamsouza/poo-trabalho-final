package br.com.dionatan.trabalho1.models;


public class Contato {

    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;

    
    
    // Sets
    public void setNome(String p) {
        this.nome = p;
    }    

    public void setTelefone(String p) {
        this.telefone = p;
    }    

    public void setEmail(String p) {
        this.email = p;
    }    

    public void setEndereco(Endereco p) {
        this.endereco = p;
    }
    
    
    
    // Gets
    public String getNome() {
        return this.nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }
    
    
    
    // Equals
    @Override
    public boolean equals(Object obj) {
        
        if ( this == obj )
            return true ;
        
        if ( obj == null ||  this.getClass() != obj.getClass() ){
            return false;
        }
        
        Contato contato = (Contato) obj;
        
        return this.nome.equalsIgnoreCase(contato.getNome()) &&
               this.telefone.equalsIgnoreCase(contato.getTelefone()) &&
               this.email.equalsIgnoreCase(contato.getEmail()) ;
        
    }
    
    
    
    // Hashcode
    @Override
    public int hashCode() {
        return getEmail().length();
    }    
    
    
    
}
