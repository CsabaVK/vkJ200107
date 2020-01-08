/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helsinki1952;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author csabavk
 */
public class Helsinki1952 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<hclass> lista = new ArrayList<>();
        
        try {
            FileReader file = new FileReader("helsinki.txt");
            BufferedReader br = new BufferedReader(file);
            
            String sor = null;
            
            while ((sor = br.readLine())!=null) {                
                hclass h = new hclass(sor);
                lista.add(h);
            }
        } catch (Exception e) {
        }
        
        System.out.println("3. feladat");
        System.out.println("Pontszerző helyezéek száma: " + lista.size());
        
        
    }
}
