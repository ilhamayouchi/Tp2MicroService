package com.example.metier;

import com.example.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


// Déclarer la classe comme un bean Spring avec l'id "metier"
@Component("metier")
public class MetierImpl implements IMetier {

    // Injection de dépendance de la implémentation de IDao
    @Autowired
    // Spécifie quelle implémentation de IDao utiliser
    @Qualifier("dao2")

    private IDao dao;

    @Override
    public double calcul() {
        return dao.getValue() * 2;
    }

    // Setter pour l'injection par setter
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
