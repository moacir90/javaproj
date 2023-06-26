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
public class Sobremesa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ecolha uma Sobremesa; 1-Bombom, 2-Pudim, 3-Cafe: ");
        int escolha =0;
        Scanner input = new Scanner (System.in);
        escolha=input.nextInt();
        
        
        if(escolha==1){
        System.out.println("Voce escolheu Bombom");
        }else if(escolha==2){
        System.out.println("Voce escolheu Pudim");
        }else if(escolha==3){
        System.out.println("Voce escolheu Cafe");
        }
        
        
        
    }
    
}
