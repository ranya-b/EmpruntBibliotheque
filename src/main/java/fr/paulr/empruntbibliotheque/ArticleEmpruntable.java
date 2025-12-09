/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package fr.paulr.empruntbibliotheque;

/**
 *
 * @author Utilisateur
 */
public interface ArticleEmpruntable {

    void emprunter();

    void rendreArticle();

    void calculerPenaliteDeRetard(int jours);

    void imprimeEtiquette();

    void connexionBDD();

    void envoyerNotifEmail(String message);
}
