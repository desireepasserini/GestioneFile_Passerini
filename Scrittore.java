/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionefile_passerini5binf;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Studente
 */

public class Scrittore implements Runnable{

    String nomeFile;
    String username;
    String password;
    
    public Scrittore(String nomeFile, String username, String password){
        this.nomeFile = nomeFile;
        this.username = username;
        this.password = password;
    }
    
    @Override
    public void run() {
        scrivi();
    }
    /**
     * Scrive un file di testo usando la classe BufferedWriter
     */
    public void scrivi(){
        
 //il try-with-resources permette di utilizzare le risorse presenti al suo interno senza doverle dichiarare separatamente
 
        try (BufferedWriter br = new BufferedWriter(new FileWriter(nomeFile))) { 
            //2) scrivo nel buffer
            br.write("File in output");
            br.write("\n\r");
            //svuoto il buffer(contenenti dati del json) e salvo nel file i dati cosi che non si sovrappongono
            br.flush();         
        } catch (IOException ex) {
            Logger.getLogger(Scrittore.class.getName()).log(Level.SEVERE, null, ex);
        }                
    }
}

