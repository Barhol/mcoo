package es;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copier {
    public static void main(String[] args) {
        String sourceFichier = "source_image.jpg"; // Chemin du fichier source
        String destinationFichier = "copie_image.jpg"; // Chemin du fichier de destination

        try (
            FileInputStream fis = new FileInputStream(sourceFichier);
            FileOutputStream fos = new FileOutputStream(destinationFichier)
        ) {
            byte[] buffer = new byte[1024]; // Tampon de 1 Ko pour optimiser la lecture/écriture
            int longueur;

            System.out.println("Copie du fichier en cours...");
            while ((longueur = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, longueur); // Écrit uniquement les octets lus
            }
            System.out.println("Copie terminée. Fichier copié : " + destinationFichier);
        } catch (IOException e) {
            System.err.println("Erreur lors de la copie du fichier : " + e.getMessage());
        }
    }
}

