/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

import java.util.Scanner;

/**
 *
 * @author JoaoVitor
 */
public class Desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int contador = 0;
        int maior = 0;
        int menor = 0;
        double media = 0;
        double soma = 0;
        int x;
        System.out.println("Digite o número: ");
        x = ler.nextInt();
        if (x!= -1){
            contador++;
            menor=x;
        }
        while (x != -1){
            if (x > maior){
                maior = x;
            }
            if (x < menor & x != -1){
                menor = x;
            }
            soma = soma+x;
            media = soma/contador;
            x = ler.nextInt();
            if(x != -1){
                contador++;
            }
        }
        System.out.println("Quantidade de números digitados: "+contador);
        System.out.println("O maior número é: "+maior);
        System.out.println("O menor número é: "+menor);
        System.out.println("Média dos números: "+media);
    }
    
}
