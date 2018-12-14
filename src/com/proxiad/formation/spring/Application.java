package com.proxiad.formation.spring;

import com.proxiad.formation.spring.access.UtilisateurRepository;
import com.proxiad.formation.spring.business.UtilisateurService;
import com.proxiad.formation.spring.exceptions.AuthentificationException;
import com.proxiad.formation.spring.exceptions.InscriptionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.time.Instant;
import java.util.Date;


public class Application {

    @Autowired
    private UtilisateurService utilisateurService;

    public static void main(String[] args) {
        Application app = new Application();
        app.job();
    }

    public void job() {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        UtilisateurService utilisateurService = (UtilisateurService) context.getBean("utilisateurService");

        //plante
        try {
            utilisateurService.authentification("login","password");
        } catch (AuthentificationException e) {
            e.printStackTrace();
        }

        //marche
        try {
            utilisateurService.inscription("login", "password", "mail@mail.mail", 19);
        } catch (InscriptionException e) {
            e.printStackTrace();
        }

        //marche
        try {
            utilisateurService.authentification("login","password");
        } catch (AuthentificationException e) {
            e.printStackTrace();
        }

        //plante
        try {
            utilisateurService.inscription("login", "password", "mail@mail.mail", 19);
        } catch (InscriptionException e) {
            e.printStackTrace();
        }



    }
}
