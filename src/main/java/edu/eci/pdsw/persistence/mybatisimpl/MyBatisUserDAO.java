package edu.eci.pdsw.persistence.mybatisimpl;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;

import com.google.inject.Inject;

import edu.eci.pdsw.entities.User;
import edu.eci.pdsw.persistence.UserDAO;
import edu.eci.pdsw.persistence.mybatisimpl.mappers.UserMapper;


public class MyBatisUserDAO implements UserDAO {

	@Inject
	UserMapper userMapper;
	
	@Override
	public User consulta(String mail) throws PersistenceException{
            try {
                return userMapper.consultaUser(mail);
            } catch (Exception e) {
                throw new PersistenceException("No existe ningun usuario con el correo: " + mail, e);
            }
        }
	

}
