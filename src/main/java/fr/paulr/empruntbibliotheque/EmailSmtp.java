/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.paulr.empruntbibliotheque;

/**
 *
 * @author Utilisateur
 */
public class EmailSmtp {
    public void send(String to, String subject, String body) {
        System.out.println("Envoi d'email à " + to + " : " + subject);
    }
}
