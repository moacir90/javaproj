
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author senai
 */
public class velVentilador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Velocidades. \nEscolha: 1=Fraco, 2=Moderado, 3=Forte: ");
        int velocidade =0;
        Scanner input = new Scanner (System.in);
        velocidade=input.nextInt();
        
        switch(velocidade){
            case 1:
                System.out.println("Velocidade fraca");
                break;
            case 2:
                System.out.println("Velocidade moderado");
                break;
            case 3:
                System.out.println("Velocidade forte");
                break;
            default:
                System.out.println("Velocidade invalida. Por favor, tente novamente");
        
        
        
        
        }
        
        
        
        
        
        
    }
    
}
