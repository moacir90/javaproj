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
public class SobremesaSwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ecolha uma Sobremesa; 1-Bombom, 2-Pudim, 3-Cafe: ");
        int escolha =0;
        Scanner input = new Scanner (System.in);
        escolha=input.nextInt();
        
        switch(escolha){
            case 1:
                System.out.println("Voce escolheu Bombom");
                break;
            case 2:
                System.out.println("Voce escolheu Pudim");
                break;
            case 3:
                System.out.println("Voce escolheu Cafe");
                break;
            default:
                System.out.println("Opção nao dispoinivel no menu");
    }
    
}
}