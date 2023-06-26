package com.mycompany.saladeaula;


public class janela {
    
    private String situacao;
    
    
    
    public void setSituacao(String situacao){
        this.situacao=situacao;
    }
    
    public String getSituacao(){
        return this.situacao;
    }
    
    public void abrirJanela(){
        System.out.println("A janela esta aberta");
    }
    
    public void JanelaFechada(){
        System.out.println("A janela esta fechada");
    }
    
    
    
    
    
    
}
