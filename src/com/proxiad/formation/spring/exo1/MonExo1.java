package com.proxiad.formation.spring.exo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MonExo1 {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/vide.xml");
        Voiture voiture = (Voiture) context.getBean("voiture");
        Voiture voiture2 = (Voiture) context.getBean("voiture");
        System.out.println("Le bean voiture1 est créé : " + (voiture == null ? "non !" : "oui !"));
        System.out.println("Le bean voiture2 est créé : " + (voiture2 == null ? "non !" : "oui !"));
        System.out.println("Est ce que voiture == voiture2 : "+((voiture==voiture2)?"oui !":"non !"));
        System.out.println("Le nom de voiture est " + (voiture.getNom() != null ? voiture.getNom() : "<null>"));
        voiture.setNom("Ma Super Voiture");
        System.out.println("Son nom est maintenant " + (voiture.getNom() != null ? voiture.getNom() : "<null>"));
        System.out.println("Est ce qu'elle a un moteur : " + (voiture.getMoteur() != null ? "oui !" : "non !"));

    }
}