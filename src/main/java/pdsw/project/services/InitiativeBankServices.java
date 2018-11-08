/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsw.project.services;


import pdsw.project.entities.User;
/**
 *
 * @author 2099190
 */
public interface InitiativeBankServices {
     
    public User consultarUsuario(String mail) throws InitiativeBankException;
}
