/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonnaci;

import java.util.Scanner;

/**
 *
 * @author JoaoVitor
 */
public class Fibonnaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int n1=0, n2=1, n=3; 
        System.out.println("Digite um número inteiro: ");
        n = ler.nextInt();
        int soma = n1+n2;
        if(n==1){
            System.out.println(n1);
        }
        else if(n==2){
            System.out.println(n2);
        }
        else if(n==3){
            System.out.println(soma);
        }
        else{
            for(int i=3; i<=n; i++){
                n1 = n2;
                n2 = soma;
                soma = n1+n2;
            }
            System.out.println(soma);
        }
       
    }
    
}
