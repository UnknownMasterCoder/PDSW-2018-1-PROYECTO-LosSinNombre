package edu.eci.pdsw.persistence.mybatisimpl;

import org.apache.ibatis.exceptions.PersistenceException;

import com.google.inject.Inject;
import edu.eci.pdsw.entities.Intention;

import edu.eci.pdsw.persistence.IntentionDAO;
import edu.eci.pdsw.persistence.mybatisimpl.mappers.IntentionMapper;
import java.util.List;


public class MyBatisIntentionDAO implements IntentionDAO{

    @Inject
    IntentionMapper intentionMapper;
	

    @Override
    public List<Intention> consultaAll() throws PersistenceException {
        try {
            return intentionMapper.consultarAll();
        } catch (Exception e) {
            throw new PersistenceException("No existen intenciones", e);
        }              
    }

}
