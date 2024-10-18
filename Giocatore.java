/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Giosuè Laurenzi
 */
public class Giocatore extends Thread{
 private int idGiocatore;
 private String nomeGiocatore;
 private Estrazione estrazione;
 private int numero;
 

    /** 
    * Param javaDoc
    * Metodo costruttore
    * @param idGiocatore codice del giocatore
    * @param estrazione riferimento dell'oggetto Estrazione
    * 
    */
    public Giocatore(int idGiocatore, Estrazione estrazione) {
       this.idGiocatore=idGiocatore;
       this.estrazione=estrazione;
       
       

    }

    public int sceltaNumero(){


        Scanner myObj = new Scanner(System.in);
        System.out.println("Inserisci un numero Giocatore " + idGiocatore );
        int numero = Integer.parseInt(myObj.nextLine());
        return numero;


    }

    public int getIdGiocatore() {
        return idGiocatore;



    }

    /**
    * 
    * Metodo per eseguire il thread
    */
    public void run() {
        System.out.println(" Giocatore id:"+ this.idGiocatore + " con estrazione " + this.estrazione + "INIZIO");

        
        
        for(int i=3; i>0; i--){
        System.out.println(i);
            try {
                this.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Giocatore.class.getName()).log(Level.SEVERE, null, ex);
            }
        
       }
       // estrazione.verifica(numeroScelto, idGiocatore);
        //System.out.println("Giocatore id : " + idGiocatore + " ho verificato il mio numero.FINE");
    }
}
