/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsw.project.dao.mybatis;

import com.google.inject.Inject;
import pdsw.project.dao.IntentionDAO;
import pdsw.project.dao.mybatis.mappers.IntentionMapper;
import org.apache.ibatis.exceptions.PersistenceException;
import pdsw.project.entities.Intention;

/**
 *
 * @author 2099190
 */
public class MyBatisIntentionDAO implements IntentionDAO{
    
    @Inject
    private IntentionMapper intentionMapper;
    
    @Override 
    public void save (Intention inten) throws PersistenceException{
    	System.out.println(inten);
    	intentionMapper.addIntention(inten);        
    }
}