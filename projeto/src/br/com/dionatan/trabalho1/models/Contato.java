package br.com.dionatan.trabalho1.models;


public class Contato {

    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;
    
    // Sets
    public void setNome(String nome) {
        this.nome = nome;
    }    

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }    

    public void setEmail(String email) {
        this.email = email;
    }    

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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
    
    // Construtor
    public Contato(String nome, String telefone, String email, Endereco endereco){
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setEmail(email);
        this.setEndereco(endereco);
    }
    
    // Equals
    @Override
    public boolean equals(Object obj) {
        
        if ( this == obj ){
            return true ;
        }
        
        if ( obj == null ||  this.getClass() != obj.getClass() ){
            return false;
        }
        
        Contato contato = (Contato) obj;
        
        return this.nome.equalsIgnoreCase    ( contato.getNome()     ) &&
               this.telefone.equalsIgnoreCase( contato.getTelefone() ) &&
               this.email.equalsIgnoreCase   ( contato.getEmail()    ) ;
    }
    
    // Hashcode
    @Override
    public int hashCode() {
        return getEmail().length();
    }
    
    // toString
    @Override
    public String toString() {
        return this.nome + " - " + this.telefone + " - " + this.email ;
    }    
    
}
