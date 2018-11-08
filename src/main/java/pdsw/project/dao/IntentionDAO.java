/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsw.project.dao;


import pdsw.project.entities.Intention;
import org.apache.ibatis.exceptions.PersistenceException;

/**
 *
 * @author 2099190
 */
public interface IntentionDAO {
    
    public void save(Intention inten) throws PersistenceException;
    
}
