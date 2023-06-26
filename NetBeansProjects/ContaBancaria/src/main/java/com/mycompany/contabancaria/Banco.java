package com.mycompany.contabancaria;


public class Banco {

    
    public static void main(String[] args) {
        
        Conta contaBradesco = new Conta();
        contaBradesco.mostraSaldo();
        contaBradesco.deposito(100);
        contaBradesco.mostraSaldo();
        contaBradesco.saque(50);
        contaBradesco.mostraSaldo();
        
        
    }
}
