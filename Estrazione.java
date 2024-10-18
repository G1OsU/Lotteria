import java.util.Random;
import java.util.Scanner;

public class Estrazione extends Thread {
    private int matriceNumeri[][];
    private int numeroVincitori;
    private int numero; // prova
    private int vincitori[];
    int righe;
    int colonne;

    public Estrazione() {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Inserisci il numero di righe: ");
        righe = scanner.nextInt();
        System.out.print("Inserisci il numero di colonne: ");
        colonne = scanner.nextInt();




        matriceNumeri = new int[righe][colonne];
        Random random = new Random();
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                matriceNumeri[i][j] = random.nextInt(100);
            }
        }
        
    }

    public void stampaMatrice() {
        System.out.println("Scheda Vincente: ");
        for (int i = 0; i < this.righe; i++) {
            for (int j = 0; j < this.colonne; j++) {
                System.out.print(matriceNumeri[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public void stampaVincitori() {
        // Implementazione per stampare i vincitori
    }

    public void verifica(int numero, int idGiocatore) {
       

       //fare confronto delle matrici per determinare vincitore
int vinto=0;
        for (int i = 0; i < matriceNumeri.length; i++) {
            for (int j = 0; j < matriceNumeri[i].length; j++) {
                if (numero == matriceNumeri[i][j]) {
                    System.out.println("Giocatore " + idGiocatore+ ", Hai vinto");
                    vinto++;
                }
            }
        } if(vinto == 0 ){
            System.out.println("Giocatore " + idGiocatore +  ", Hai perso");
        }
       
       /* if (numero == this.numero) {
            System.out.println("Giocatore " + idGiocatore + " hai scelto il numero " + numero + " e hai vinto!");
        } else {
            System.out.println("Hai perso!");
        } */
    }

    public void run() {
        System.out.println("INIZIO ESTRAZIONE!");
        stampaMatrice();
        // Logica di estrazione e stampa finale
    }
}
