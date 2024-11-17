package es;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LectureEtEcritureTexte {
    public static void main(String[] args) {
        String fichierSource = "livres.txt"; // Chemin du fichier source
        String fichierDestination = "sortie.txt"; // Chemin du fichier de destination

        try (
            BufferedReader br = new BufferedReader(new FileReader(fichierSource));
            BufferedWriter bw = new BufferedWriter(new FileWriter(fichierDestination))
        ) {
            String ligne;
            System.out.println("Lecture et écriture en cours...");
            while ((ligne = br.readLine()) != null) {
                bw.write(ligne); // Écrit la ligne dans le fichier de destination
                bw.newLine(); // Ajoute une nouvelle ligne
            }
            System.out.println("Écriture terminée. Résultat enregistré dans : " + fichierDestination);
        } catch (IOException e) {
            System.err.println("Erreur lors du traitement des fichiers : " + e.getMessage());
        }
    }
}


