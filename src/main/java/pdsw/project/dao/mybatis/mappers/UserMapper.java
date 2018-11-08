/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsw.project.dao.mybatis.mappers;

import org.apache.ibatis.annotations.Param;
import pdsw.project.entities.User;

/**
 *
 * @author 2124203
 */
public interface UserMapper {
    public User consultarUsuario(@Param("mail") String mail);
}
