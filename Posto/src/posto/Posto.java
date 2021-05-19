/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posto;

import java.util.Scanner;

/**
 *
 * @author JoaoVitor
 */
public class Posto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float gasolina, etanol, valor;
        System.out.println("Digite o valor da gasolina: ");
        gasolina = ler.nextFloat();
        System.out.println("Digite o valor do etanol: ");
        etanol = ler.nextFloat();
        
        valor = etanol/gasolina;
        
        if (valor <=0.7) {
            System.out.println("Abasteça com etanol");
        } 
        else{
            System.out.println("Abasteça com gasolina");
        }
        
    }
    
}
