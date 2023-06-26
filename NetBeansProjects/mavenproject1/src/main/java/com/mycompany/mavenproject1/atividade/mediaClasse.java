/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1.atividade;

import java.util.Scanner;


public class mediaClasse {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int contador = 0;
        int nota1 = 0;
        int nota2 = 0;
        int media = 0;
        
        System.out.println("CALCULO DE MEDIA DE NOTA "); // mensagem com o objetivo do programa
        
        System.out.println("informar a primeira nota"); // usado para adicionar/receber o valor da nota 1
        nota1=scanner.nextInt();
        
        System.out.println("informar a  segunda nota"); //usado para adicionar/receber o valor da nota 2
        nota2=scanner.nextInt();
       
        
        do{
            media=(nota1+nota2)/2;
            if(media>=7){
                System.out.println("Aprovado");
                break;
            }
        System.out.println( "nota " + media);
        
        }while(media<=6);
        
        
        
    }
    
}
