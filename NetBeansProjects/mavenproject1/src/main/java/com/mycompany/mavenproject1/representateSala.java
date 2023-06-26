/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author senai
 */
public class representateSala {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Candidatos para Representates de sala: \nCadidato 1, \nCadidato 2, \nCadidato 3: ");
        int candidato =0;
        Scanner input = new Scanner (System.in);
        candidato=input.nextInt();
        
        switch(candidato){
            case 1:
                System.out.println("Voce votou no candidato 1.");
                break;
            case 2:
                System.out.println("Voce votou no candidato 2.");
                break;
            case 3:
                System.out.println("Voce votou no candidato 3.");
                break;
            default:
                System.out.println("Candidato invalido, Por favor escolha um candidato valido.");
        
        }
    }
    
}
