package com.mycompany.mavenproject1;

import java.util.Scanner;


public class urnaEletronica {

   
    public static void main(String[] args) {
       
       
       Scanner scanner = new Scanner(System.in);
       
       final int candidato1 = 77123;//"Pedro"
       final int candidato2 = 90321;//"Maria"
       final int candidato3 = 12345;//"Joao"
       
       int votosCanditadato1=0;
       int votosCanditadato2=0;
       int votosCanditadato3=0;
       
       int voto=0;
       
      // a urna eletronica apresenta tres possiveis candidatos com um numero correspondendo a cada candidato. 
      do{ 
      System.out.println("===== ELEICOES 2023 =====\nEscolha seu candidato:\n77123 - Pedro\n90321 - Maria\n12345 - Joao");
       
       //o programa apresenta um campo de entra de dados para que o usario digite a escolha de sei candidato.
       
       voto=scanner.nextInt();
                
       //ao digitar o numero escolhido, o programa ira somar um voto para o candidato escolhido pelo usuario. o programa deve exibir ao usuario uma mensagem que o voto foi compuitado com sucesso
       if(voto==77123){
           votosCanditadato1=votosCanditadato1+1;
           System.out.println("Voce votou em Pedro.\nSeu voto foi computado com sucesso.");
        //    String statusConfirmacao=scanner.next();
        //    if (statusConfirmacao.equals("S")){
        //         votosCanditadato1=votosCanditadato1+1;
        //    }
       } else if(voto==90321){
        System.out.println("Voce votou em Maria.\nSeu voto foi computado com sucesso.");
           votosCanditadato2=votosCanditadato2+1;
       } else if(voto==12345){
        System.out.println("Voce votou em Joao. \nSeu voto foi computado com sucesso.");
           votosCanditadato3=votosCanditadato3+1;
       } else{
           if(voto!=00000){
           System.out.println("voce nao digitou um numero valido!");
        }
       }
     
      }while(voto!=00000);
       
      System.out.println("A votação encerrou.\nVotos:\nPedro: " +votosCanditadato1+"\nMaria: " +votosCanditadato2+"\nJoao: " +votosCanditadato3);
       //apos, deve solicitar uma novo voto
       
       //quando o mesario digitar a senha secreta, o prohgrama ira para de disponibilizar votos
       
       //logo apos parar de disponibilizar votos, o programa deve exibir a quantidade de votos para cada condidatos.
        
       
    }
    
}
