package edu.eci.pdsw.persistence.mybatisimpl;

import org.apache.ibatis.exceptions.PersistenceException;

import com.google.inject.Inject;

import edu.eci.pdsw.entities.User;
import edu.eci.pdsw.persistence.UserDAO;
import edu.eci.pdsw.persistence.mybatisimpl.mappers.UserMapper;


public class MyBatisUserDAO implements UserDAO {

	@Inject
	UserMapper userMapper;
	
	@Override
	public User consultaUser(String mail) throws PersistenceException{
            try {
                return userMapper.consultarUsuario(mail);
            } catch (Exception e) {
                throw new PersistenceException("No existe ningun usuario con el correo: " + mail, e);
            }
        }

}
