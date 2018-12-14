package com.proxiad.formation.spring.access;

import com.proxiad.formation.spring.beans.Utilisateur;
import com.proxiad.formation.spring.entities.UtilisateurEntity;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilisateurRepositoryImpl implements UtilisateurRepository {

    private static Map<String, UtilisateurEntity> utilisateurs = new HashMap<>();

    @Override
    public void add(String login, String password, String email, int age) {
        if (utilisateurs.get(login)==null) {
            UtilisateurEntity newUser = new UtilisateurEntity();
            newUser.setLogin(login);
            newUser.setPassword(password);
            newUser.setAge(age);
            utilisateurs.put(login,newUser);
        }
    }

    @Override
    public UtilisateurEntity get(String login) {
        return utilisateurs.get(login);
    }

}
