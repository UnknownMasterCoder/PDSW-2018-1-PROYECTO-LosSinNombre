package edu.eci.pdsw.services;

import edu.eci.pdsw.entities.User;

public interface InitiativeBankServices {
    public User consultarUsuario(String mail) throws InitiativeBankException;
}
