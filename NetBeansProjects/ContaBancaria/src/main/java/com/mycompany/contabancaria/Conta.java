
package com.mycompany.contabancaria;


public class Conta {
    
//Propriadades
    double saldo;
            
    
//Metodos
//a) Construtor(deve possuir entrada de valores)
    public Conta(){
    
    }
//b) mostraSaldo(void que nao deve possuir entrada de valor)
    
    public void mostraSaldo(){
        System.out.println("Seu saldo e "+saldo);
    
    }
    
//c) deposito(void que possuir entrada de valor)
    public void deposito(double valor){
        saldo = saldo + valor;
        System.out.println("Voce fez um deposito e seu saldo atualizado: "+saldo);
    }
    
    
//d) saque(void que possui entra de valor e atualiza o saldo)
    public void saque(double valor){
        if(valor>saldo){
            System.out.println("Valor maior do que o saldo");
        }else {
            saldo=saldo-valor;
            System.out.println("Saldo atualizado: "+saldo);
        }
    
   }
    
}

//