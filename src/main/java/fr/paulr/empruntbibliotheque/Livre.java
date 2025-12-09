/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.paulr.empruntbibliotheque;

/**
 *
 * @author Utilisateur
 */
public class Livre implements ArticleEmpruntable{
    private String titre;
    private boolean emprunte;

    public Livre(String titre) {
        this.titre = titre;
    }

    @Override
    public void emprunter() {
        emprunte = true;
        System.out.println("Livre emprunté : " + titre);
    }

    @Override
    public void rendreArticle() {
        emprunte = false;
        System.out.println("Livre rendu : " + titre);
    }

    // LSP violé : comportement incohérent
    @Override
    public void calculerPenaliteDeRetard(int jours) {
        if (jours < 0) {
            throw new IllegalArgumentException("Le nombre de jours ne peut pas être négatif !");
        }
        System.out.println("Pénalités de retard : " + (jours * 10) + " euros");
    }

    @Override
    public void imprimeEtiquette() {
        System.out.println("Etiquette : " + titre);
    }

    // DIP violé : dépendance directe à une classe concrète
    @Override
    public void connexionBDD() {
        ConnecteurMySql db = new ConnecteurMySql();
        db.connect("localhost", 3306, "root", "root");
    }

    @Override
    public void envoyerNotifEmail(String message) {
        EmailSmtp sender = new EmailSmtp();
        sender.send("user@example.com", "Message de votre bibliothèque", message);
    }
}
