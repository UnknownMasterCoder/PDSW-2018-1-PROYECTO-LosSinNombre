/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsw.project.dao.mybatis.mappers;

import pdsw.project.entities.Intention;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author 2099190
 */
public interface IntentionMapper {
    
    void addIntention(@Param("int") Intention inten);
    
}