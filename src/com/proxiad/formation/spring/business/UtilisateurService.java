package com.proxiad.formation.spring.business;

import com.proxiad.formation.spring.beans.Utilisateur;
import com.proxiad.formation.spring.exceptions.AuthentificationException;
import com.proxiad.formation.spring.exceptions.InscriptionException;

public interface UtilisateurService {
    Utilisateur authentification (String login, String password) throws AuthentificationException;
    void inscription(String login, String password, String mail, int age) throws InscriptionException;

}
