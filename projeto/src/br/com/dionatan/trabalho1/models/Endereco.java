package br.com.dionatan.trabalho1.models;


public class Endereco {

    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    
    // Sets
    public void setRua(String rua) {
        this.rua = rua;
    }    
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }    
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }    
    
    public void setEstado(String estado) {
        this.estado = estado;
    }    
    
    public void setPais(String pais) {
        this.pais = pais;
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
    
    // Construtor
    public Endereco(String rua, String bairro, String cidade, String estado, String pais){
        this.setRua(rua);
        this.setBairro(bairro);
        this.setCidade(cidade);
        this.setEstado(estado);
        this.setPais(pais);
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
    
    // toString
    @Override
    public String toString() {
        return this.rua + " - " + this.bairro + " - " + this.cidade + " - " + this.estado + " - " + this.pais ;
    }
    
}
