/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsw.project.dao;

import pdsw.project.entities.User;
import org.apache.ibatis.exceptions.PersistenceException;

/**
 *
 * @author 2124203
 */
public interface UserDAO {
    public User consultarUsuario(String email) throws PersistenceException;
}
