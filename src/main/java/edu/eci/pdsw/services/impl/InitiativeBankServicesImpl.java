package edu.eci.pdsw.services.impl;

import com.google.inject.Inject;
import edu.eci.pdsw.entities.User;
import edu.eci.pdsw.persistence.PersistenceException;
import edu.eci.pdsw.persistence.UserDAO;
import edu.eci.pdsw.services.InitiativeBankException;
import edu.eci.pdsw.services.InitiativeBankServices;

public class InitiativeBankServicesImpl implements InitiativeBankServices {

    @Inject
    private UserDAO userDAO;


    @Override
    public User consultarUsuario(String mail) throws InitiativeBankException{
        try {
            return userDAO.consulta(mail);
        } catch (PersistenceException ex) {
            throw new InitiativeBankException(ex.getMessage(), ex);
        }
    }
    
}
