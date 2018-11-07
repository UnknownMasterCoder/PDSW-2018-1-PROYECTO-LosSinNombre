/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsw.project.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import pdsw.project.entities.User;
import pdsw.project.services.InitiativeBankServices;

/**
 *
 * @author 2124203
 */
    @ManagedBean (name = "loginBean")
public class LoginBean extends BasePageBean{
	private String contrasenia;
       	private String mail;


        private static final long serialVersionUID = 35L;

        @Inject
	private InitiativeBankServices initiativeBankServices;

        
        
        
    //establecer y retornar la contraseña dada en el login   
    public void setContrasenia(String contrasenia){
        this.contrasenia = contrasenia;
    }
    
    public String getContrasenia(){
        return contrasenia;
    }
    
    //establecer y retornar la cuenta del mail dada en el login   
    public void setMail(String mail){
        this.mail = mail;
    }
    
    public String getMail(){
        return mail;
    }
}
