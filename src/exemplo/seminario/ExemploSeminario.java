/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.seminario;

/**
 *
 * @author architect
 */
public class ExemploSeminario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vet[] = new int[10];
        Rapa obj = new Rapa();
        
        System.out.println("Meu primeiro programa");
        System.out.println("Agora Sim!");
        
        for(int i = 0; i < 15; i++)
        {
               vet[i] = i;
               System.out.println(vet[i]);
        }
    }
    
}
