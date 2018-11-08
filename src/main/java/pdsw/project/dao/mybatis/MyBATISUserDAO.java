/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsw.project.dao.mybatis;

import org.apache.ibatis.exceptions.PersistenceException;
import pdsw.project.dao.UserDAO;
import pdsw.project.dao.mybatis.mappers.UserMapper;
import pdsw.project.entities.User;

/**
 *
 * @author 2124203
 */
public class MyBATISUserDAO implements UserDAO{
    
    private UserMapper userMapper;
    
        @Override
    public User consultarUsuario(String mail) throws PersistenceException {
        try {
            return userMapper.consultarUsuario(mail);
        } catch (PersistenceException e) {
            throw new PersistenceException("Error al consultar el usuario con email " + mail, e);
        }
    }

}
