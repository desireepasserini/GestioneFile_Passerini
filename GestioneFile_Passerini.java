/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionefile_passerini;
import gestionefile_passerini.Lettore;
import java.util.Scanner;

/**
 *
 * @author Studente
 */
public class GestioneFile_Passerini {

    public static void main(String[] args) {
        
        //1)LETTURA
        Lettore lettore = new Lettore("user.json"); //legge il file .json
        lettore.start();
        
        //2)ELABORAZIONE
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci username: "); //richiede l'username in input
        String username = scanner.nextLine();//assegna l'username letto in input alla variabile "username"
        
        System.out.print("Inserisci password: "); //richiede la password in input
        String password = scanner.nextLine(); //assegna lla password letta in input alla variabile "password"
        
        scanner.close(); // chiudi lo scanner

        //3) SCRITTURA
        Scrittore scrittore = new Scrittore("output.csv", username, password);
        Thread threadScrittore = new Thread(scrittore);
        Scrittore copia = new Scrittore()
        threadScrittore.start();
    } 
}
