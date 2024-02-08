/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombokhasznalata;

/**
 *
 * @author PalkovicsAlex(SZOFT_
 */
public class TombokHasznalata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        indexek:     0       1        2
        pyLista = ["egy", "kettő", "három"]
        */
        
        String[] tomb = {"egy", "kettő", "három"};
        
        // a tömb mérete nem változtatható
        
        System.out.println("tömb = " + tomb);
        
        System.out.println("A tömb elemei: ");
        for(int i = 0; i < tomb.length; i++) {
            System.out.printf("[%d. index] = %s\n", i, tomb[i]);
        }
        
        // mérete nem változhat, de új tömb lehetséges
        
        tomb = new String[4];
        
        /* for(int i = 0; i < tomb.length; i++) {
            System.out.printf("[%d. index] = %s\n", i, tomb[i]);
        } */
        
        tomb[2] = "zwei";
        for(int i = 0; i < tomb.length; i++) {
            System.out.printf("[%d. index] = %s\n", i, tomb[i]);
        }
        
        tomb[0] = "null";
        tomb[1] = "one";
        tomb[3] = "three";
        for(int i = 0; i < tomb.length; i++) {
            System.out.printf("[%d. index] = %s\n", i, tomb[i]);
        }
        
        System.out.println("\"null\" vagy null ?");
        /**/
        if ("null" == null) {
            System.out.println("egyezik");
        } else {
            System.out.println("nem egyezik");
        }
    }
    
}
