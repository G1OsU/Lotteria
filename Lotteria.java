/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laurenzi Giosuè
 */
public class Lotteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //2 Scelta del numero dei numeri da estrarre




        Estrazione e = new Estrazione();
        
        
       // e.stampaMatrice();
        e.start();

        
        
        
        
        Giocatore g1= new Giocatore(1,e);
        Giocatore g2= new Giocatore(2, e);
        Giocatore g3= new Giocatore(3, e);
        Giocatore g4= new Giocatore(4, e);


        g1.start();
        g2.start();
        g3.start();
        g4.start();
        // Istanza ed avvio del thread Estrazione
        try {
            // Istanza di alcuni thread Giocatore
            
            // Avvio dei thread Giocatori
            g1.join();
            g2.join();
            g3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Lotteria.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            System.err.println("Errore join ");//personale
        }
       

        // Comunicazione fine gioco


        e.verifica(g1.sceltaNumero(), g1.getIdGiocatore());
        e.verifica(g2.sceltaNumero(), g2.getIdGiocatore());
        e.verifica(g3.sceltaNumero(), g3.getIdGiocatore());
        e.verifica(g4.sceltaNumero(), g4.getIdGiocatore());

    }
}
   