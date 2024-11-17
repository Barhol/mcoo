package es;

import java.io.FileInputStream;
import java.io.IOException;

public class LectureFichierBinaire {
    public static void main(String[] args) {
        String cheminFichier = "fichier_binaire.dat"; // Remplacez par le chemin de votre fichier binaire

        try (FileInputStream fis = new FileInputStream(cheminFichier)) {
            int octet;
            System.out.println("Contenu du fichier binaire (en octets) :");
            while ((octet = fis.read()) != -1) {
                System.out.print(octet + " "); // Affiche chaque octet en tant que nombre
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }
}


