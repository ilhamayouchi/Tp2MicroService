package com.example.dao;

import org.springframework.stereotype.Component;


// Déclarer la classe comme un bean Spring avec l'id "dao"
@Component("dao")
public class DaoImpl implements IDao {
    @Override
    public double getValue() {
        // Cette implémentation retourne une valeur fixe de 100.0
        return 100.0;
    }
}