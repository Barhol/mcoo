package es;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectureTexte {
    public static void main(String[] args) {
        String cheminFichier = "livres.txt"; // Remplacez par le chemin de votre fichier texte

        try (BufferedReader br = new BufferedReader(new FileReader(cheminFichier))) {
            String ligne;
            System.out.println("Contenu du fichier texte :");
            while ((ligne = br.readLine()) != null) {
                System.out.println(ligne); // Affiche chaque ligne du fichier
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }
}


