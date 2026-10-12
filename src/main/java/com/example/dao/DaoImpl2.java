package com.example.dao;

import org.springframework.stereotype.Component;

// Déclarer une classe comme un bean Spring avec l'id "dao2"
@Component("dao2")
public class DaoImpl2 implements IDao {
    @Override
    public double getValue() {
        // Cette implémentation alternative retourne 150.0
        return 150.0;
    }
}