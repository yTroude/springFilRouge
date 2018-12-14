package com.proxiad.formation.spring.business;

import com.proxiad.formation.spring.access.UtilisateurRepository;
import com.proxiad.formation.spring.access.UtilisateurRepositoryImpl;
import com.proxiad.formation.spring.beans.Utilisateur;
import com.proxiad.formation.spring.entities.UtilisateurEntity;
import com.proxiad.formation.spring.exceptions.AuthentificationException;
import com.proxiad.formation.spring.exceptions.InscriptionException;
import org.springframework.beans.factory.annotation.Autowired;

public class UtilisateurServiceImpl implements UtilisateurService {
    @Autowired
    UtilisateurRepository utilisateurRepository;


    @Override
    public Utilisateur authentification(String login, String password) throws AuthentificationException {
        UtilisateurEntity ue = utilisateurRepository.get(login);
        if(ue == null || !ue.getPassword().equals(password)){
            throw new AuthentificationException();
        }
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setAge(ue.getAge());
        utilisateur.setLogin(ue.getLogin());
        utilisateur.setMail(ue.getMail());
        return utilisateur;
    }

    @Override
    public void inscription(String login, String password, String mail, int age) throws InscriptionException {
        if (utilisateurRepository.get(login)!=null || age<16){
            throw new InscriptionException();
        }

        utilisateurRepository.add(login, password, mail, age);
    }

}
