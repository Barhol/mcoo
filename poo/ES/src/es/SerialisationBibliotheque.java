package es;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SerialisationBibliotheque {
    public static void main(String[] args) {
        String cheminFichier = "bibliotheque.ser"; // Fichier de sauvegarde

        // Liste de livres
        List<Livre> bibliotheque = new ArrayList<>();
        bibliotheque.add(new Livre("1984", "George Orwell", 1949));
        bibliotheque.add(new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 1943));
        bibliotheque.add(new Livre("Harry Potter", "J.K. Rowling", 1997));

        // Sérialisation
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(cheminFichier))) {
            oos.writeObject(bibliotheque); // Écrit l'objet sérialisé dans le fichier
            System.out.println("Liste de livres sérialisée dans " + cheminFichier);
        } catch (IOException e) {
            System.err.println("Erreur lors de la sérialisation : " + e.getMessage());
        }
    }
}


