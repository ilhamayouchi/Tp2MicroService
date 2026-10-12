package com.example.presentation;

import com.example.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// Classe du configuration de Spring
@Configuration
@ComponentScan(basePackages = {"com.example.dao", "com.example.metier"})
public class Presentation2{
    public static void main(String[] args) {
        // Création du contexte Spring basé sur les annotations
        ApplicationContext context = new AnnotationConfigApplicationContext(Presentation2.class);

        // Récupération du bean IMetier depuis le Spring
        IMetier metier = context.getBean(IMetier.class);

        // Exécution et affichage de la méthode calcul()
        System.out.println("Résultat = " + metier.calcul());
    }
}
