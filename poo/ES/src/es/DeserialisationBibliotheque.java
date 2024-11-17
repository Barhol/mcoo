package es;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.List;

public class DeserialisationBibliotheque {
    public static void main(String[] args) {
        String cheminFichier = "bibliotheque.ser"; // Fichier contenant les objets sérialisés

        // Désérialisation
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(cheminFichier))) {
            List<Livre> bibliotheque = (List<Livre>) ois.readObject(); // Lire l'objet
            System.out.println("Liste des livres désérialisée :");
            for (Livre livre : bibliotheque) {
                System.out.println(livre); // Affiche chaque livre
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erreur lors de la désérialisation : " + e.getMessage());
        }
    }
}

