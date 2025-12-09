/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.paulr.empruntbibliotheque;

/**
 *
 * @author Utilisateur
 */
public class EmpruntBibliotheque {

    public static void main(String[] args) {
        GestionnaireBibliotheque gestionnaire = new GestionnaireBibliotheque();
        Livre livre = new Livre("Design Patterns, Elements of Reusable Object-Oriented Software");
        DVD dvd = new DVD("Inception");

        gestionnaire.addItem(livre);
        gestionnaire.addItem(dvd);

        gestionnaire.processItem(livre, "livre");
        gestionnaire.processItem(dvd, "dvd");
    }
}
