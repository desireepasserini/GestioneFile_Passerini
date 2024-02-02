package gestionefile_passerini5binf;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MC
 * @ 12/01/23
 */

import java.io.IOException;
import  java.io.FileReader;
import  java.io.BufferedReader;


public class Lettore extends Thread{
    String nomeFile;
    
    public Lettore(String nomeFile){
        this.nomeFile = nomeFile;
    }
    
    /**
     * Legge il file senza tener conto del tipo di file
     * e lo mostra in output
     */
    public void leggi(){
        int i; 
        try (BufferedReader fr = new BufferedReader(new FileReader(nomeFile))) { 
            //1) apro il file
            //2) leggo carattere per carattere e lo stampo 
            while ((i=fr.read()) != -1)
                System.out.print((char) i);
            
            System.out.print("\n\r");   
        } catch (IOException ex) {
            System.err.println("Errore in lettura!");
        }
    }
    

    public void run(){
        leggi();
    }
}
