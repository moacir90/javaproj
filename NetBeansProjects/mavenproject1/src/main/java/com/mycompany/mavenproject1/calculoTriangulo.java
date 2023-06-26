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
public class calculoTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner scanner = new Scanner(System.in);    
    double base=0;
    double altura=0;
   
    System.out.println("Digite a base: ");
    base=scanner.nextDouble();
     
     System.out.println("Digite altura: ");
     altura=scanner.nextDouble();
   
    double resultado= ((base*altura)/2);
        
        System.out.println("resultado" + resultado);
        
    }
    
}
