/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsw.project.services.impl;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.apache.ibatis.exceptions.PersistenceException;
import pdsw.project.dao.UserDAO;
import pdsw.project.entities.User;
import pdsw.project.services.InitiativeBankException;
import pdsw.project.services.InitiativeBankServices;

/**
 *
 * @author 2099190
 */

@Singleton
public class InitiativeBankServicesImpl implements InitiativeBankServices {

    @Inject
    private UserDAO userDAO;

    @Override
    public User consultarUsuario(String mail) throws InitiativeBankException {
        try {
            return userDAO.consultarUsuario(mail);
        } catch (PersistenceException ex) {
            throw new InitiativeBankException(ex.getMessage(), ex);
        }
    }
    
}
