package br.com.lucianopspcom.models.varios;

class Endereco {
    private String logradouro;
    private String cidade;
    private String estado;
    private long cep;
    private int numero;
    private String observacoes;    

    protected void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    protected void setCidade(String cidade) {
        this.cidade = cidade;
    }

    protected void setEstado(String estado) {
        this.estado = estado;
    }

    protected void setCep(long cep) {
        this.cep = cep;
    }

    protected void setNumero(int numero) {
        this.numero = numero;
    }

    protected void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    protected String getLogradouro() {
        return logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    protected long getCep() {
        return cep;
    }

    protected int getNumero() {
        return numero;
    }

    protected String getObservacoes() {
        return observacoes;
    }
}