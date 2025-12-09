/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.paulr.empruntbibliotheque;

/**
 *
 * @author Utilisateur
 */
public class DVD implements ArticleEmpruntable{
     private String titre;

    public DVD(String titre) {
        this.titre = titre;
    }

    @Override
    public void emprunter() {
        throw new UnsupportedOperationException("Les DVDs doivent être empruntés au comptoir.");
    }

    @Override
    public void rendreArticle() {
        System.out.println("DVD rendu : " + titre);
    }

    @Override
    public void calculerPenaliteDeRetard(int jours) {
        System.out.println("Forfait : 50 euros quel que soit le nombre de jours de retard.");
    }

    @Override
    public void imprimeEtiquette() {
        System.out.println("Etiquette DVD : " + titre);
    }

    @Override
    public void connexionBDD() {
        ConnecteurMySql db = new ConnecteurMySql();
        db.connect("Serveur BDD", 3307, "admin", "admin");
    }

    @Override
    public void envoyerNotifEmail(String message) {
        System.out.println("Pas de notification par email pour les DVD.");
    }
}

// Classes concrètes (DIP violé)
class MySqlDatabase {
    public void connect(String host, int port, String user, String pass) {
        System.out.println("Connexion MySQL à " + host + ":" + port);
    }
}

class SmtpEmailSender {
    public void send(String to, String subject, String body) {
        System.out.println("Email envoyé à " + to + ": " + subject);
    }
}
