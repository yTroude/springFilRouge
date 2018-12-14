package com.proxiad.formation.spring.access;

import com.proxiad.formation.spring.beans.Utilisateur;
import com.proxiad.formation.spring.entities.UtilisateurEntity;

import java.util.Date;
import java.util.List;

public interface UtilisateurRepository {

    void add(String login, String password, String email, int age);
    UtilisateurEntity get(String login);
}
