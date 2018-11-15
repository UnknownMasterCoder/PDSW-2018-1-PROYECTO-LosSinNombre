package edu.eci.pdsw.managedbeans;

import edu.eci.pdsw.entities.User;
import edu.eci.pdsw.services.InitiativeBankException;
import edu.eci.pdsw.services.InitiativeBankServices;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;


@ManagedBean(name = "loginBean")
@SessionScoped  
public class LoginBean extends BasePageBean{
    
    @Inject
    private InitiativeBankServices initiativeBankServices;

    private String mail;
    private String password;

    public LoginBean() {
        mail = null;
        password = null;
    }
    
    public void verificar(){
        try {
            User temp = initiativeBankServices.consultarUsuario(mail);
        } catch (Exception e) {
            
        }
        
    }
    
    public void print(){
        System.out.println("mail ingresado: "+mail);
        System.out.println("contraseña ingresado: "+password);
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        System.out.println(mail);
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }    
    
}
