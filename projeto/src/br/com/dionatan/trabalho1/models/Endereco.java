package br.com.dionatan.trabalho1.models;


public class Endereco {

    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    
    // Sets
    public void setRua(String p) {
        this.rua = p;
    }    
    
    public void setBairro(String p) {
        this.bairro = p;
    }    
    
    public void setCidade(String p) {
        this.cidade = p;
    }    
    
    public void setEstado(String p) {
        this.estado = p;
    }    
    
    public void setPais(String p) {
        this.pais = p;
    }    
    
    // Gets
    public String getRua() {
        return this.rua;
    }

    public String getBairro() {
        return this.bairro;
    }
    
    public String getCidade() {
        return this.cidade;
    }
    
    public String getEstado() {
        return this.estado;
    }
    
    public String getPais() {
        return this.pais;
    }
    
    // Equals
    @Override
    public boolean equals(Object obj) {
        
        if ( this == obj )
            return true ;
        
        if ( obj == null ||  this.getClass() != obj.getClass() ){
            return false;
        }
        
        Endereco endereco = (Endereco) obj;
        
        return this.rua.equalsIgnoreCase(endereco.getRua()) &&
               this.bairro.equalsIgnoreCase(endereco.getBairro()) && 
               this.cidade.equalsIgnoreCase(endereco.getCidade()) && 
               this.estado.equalsIgnoreCase(endereco.getEstado()) && 
               this.pais.equalsIgnoreCase(endereco.getPais()) ;
        
    }    
    
    // Hashcode
    @Override
    public int hashCode() {
        return getRua().length();
    }
    
}
