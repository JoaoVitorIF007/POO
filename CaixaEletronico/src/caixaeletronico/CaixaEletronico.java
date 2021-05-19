/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaeletronico;

import java.util.Scanner;

/**
 *
 * @author JoaoVitor
 */
public class CaixaEletronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor, t;
        System.out.println("Qual o valor do saque: ");
        valor = ler.nextInt();
        t = valor;
        System.out.println("Resulta em notas de: ");
        if(t >= 50){
            t = valor / 50;
            valor = valor % 50;
            System.out.println(t+ " Nota(s) de 50");
        }
        if(valor >=10){
            t = valor/10;
            valor = valor % 10;
            System.out.println(t+ " Nota(s) de 10");
        }
        if(valor >= 5){
            t = valor/5;
            valor = valor%5;
            System.out.println(t+ " Nota(s) de 5");
        }
        if(valor >= 1){
            t = valor/1;
            valor = valor%1;
            System.out.println(t+ " Nota(s) de 1");
        }
        else{
            System.out.println("Valor inexistente!");
        }
             
        
    }
    
}
