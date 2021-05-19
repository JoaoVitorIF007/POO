/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

import java.util.Scanner;

/**
 *
 * @author JoaoVitor
 */
public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 9;
        int v[] = new int [10];
        int x[] = new int [10];
        System.out.println("Digite 10 números: ");
        for(int i=0 ; i<10; i++){
            v[i] = ler.nextInt();        
    }
        System.out.println("");
        
        
        for(int j=0; j<10 ;j++){
            x[n--] = v[j];
        }
        System.out.println("Vetores digitados: ");
        for(int i=0; i<10; i++){
            System.out.println(v[i]);
        }
        System.out.println("");
        System.out.println("Vetores invertidos: ");
        for(int i=0; i<10; i++){
        
        System.out.println(x[i]);
    }
        
    }
    
}
